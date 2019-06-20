# MSP Platform Challenge
## Context: MSP Platform Services

#### Welcome!

#### Objective:
Build and deploy this API service, which is supposed to receive GET requests, contact another API to retrieve data relevant to the request, and return the result.

#### Requirements:
1. An SSH client (to connect to the challenge instance)
2. Docker (if you wish to debug locally)

#### Instructions:
* Check out the code and build the docker image.
* Deploy the image on the instance provided.
* The deployed service on the instance should listen on port 80 for incoming HTTP requests matching:
    ```url
    /api/getServiceAvailabilityByUserId?id=<userid>
    ```
    * Available `userid`s are `32540`, `32541`, `32542`.
* It should respond with a list of that `userid`'s service availability factors, such as:
    ```js
    ["service1": 0.1, "service2": 0.2]
    ```
* Submit the completed challenge as a PR to this repo.
