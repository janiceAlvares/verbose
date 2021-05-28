FROM gradle:7.0.2-jdk8-hotspot AS build
RUN gradle build
FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY build/libs/*.jar /verbose-1.0.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/verbose-1.0.jar"]
