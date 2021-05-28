FROM gradle:4.7.0-jdk8-alpine AS build
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle build
FROM openjdk:8-jdk-alpine
RUn mkdir /app
COPY --from=build /home/gradle/src/build/libs/*.jar /app/verbose-1.0.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app/verbose-1.0.jar"]
