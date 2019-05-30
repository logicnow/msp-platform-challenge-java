FROM maven:3.6.0-jdk-11-slim as builder

COPY . /home/build

RUN cd /home/build \
 && mvn clean package \
 && cp /home/build/target/msp-platform-challenge-1.0-SNAPSHOT.jar /home/app.jar \
 && rm -rf /home/build/

FROM adoptopenjdk/openjdk11:jre-11.0.3_7-alpine

RUN apk --update --no-cache add dumb-init && \
    adduser -D -s /sbin/nologin javauser
COPY --from=builder /home/app.jar /home/app.jar

USER javauser

ENTRYPOINT ["/usr/bin/dumb-init", "--"]
CMD ["java", "-XX:+UnlockExperimentalVMOptions", "-XX:MaxRAMFraction=1", "-jar", "/home/app.jar"]
EXPOSE 80