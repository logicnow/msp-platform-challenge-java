package com.solarwinds.msp.platform.challenge;

import com.solarwinds.msp.platform.challenge.Entitlement.Converter;
import com.solarwinds.msp.platform.challenge.Entitlement.Entitlement;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@RestController
public class EntitlementController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/api/getServiceAvailabilityByUserId")
    public String getEntitlementById(@RequestParam(required = false) String id) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(String.format("https://raw.githubusercontent.com/vyruss/test123/master/v1/user/%s/entitlement", id)))
                .build();

        try {
            HttpResponse response = client.send(request, HttpResponse.BodyHandlers.ofString());
            Entitlement[] entitlements = Converter.fromJsonString(response.body().toString());

            StringBuilder data = new StringBuilder("[");

            for(int i = 0; i < entitlements.length - 1; i++) {
                data.append(String.format("\"%s\": \"%f\",", entitlements[i].getService().getName(), entitlements[i].getMetadata().getAvailability()));
            }

            data = new StringBuilder(data.toString().replaceAll(",$", ""));
            data.append("]");

            return data.toString();

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        return "Error";
    }

}
