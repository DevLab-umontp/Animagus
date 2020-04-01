FROM maven:3.6.3-jdk-8-slim AS build
RUN mkdir -p /workspace
WORKDIR /workspace
COPY pom.xml /workspace
COPY images workspace/images
COPY src /workspace/src
RUN mvn clean compile assembly:single -DskipTests 

FROM openjdk:8-jdk-slim
COPY --from=build /workspace/target/Animagus-1.0-SNAPSHOT-jar-with-dependencies.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]
