FROM openjdk:17-jdk-slim

LABEL "org.opencontainers.image.authors"="eazybytes.com"

COPY target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "accounts-0.0.1-SNAPSHOT.jar"]