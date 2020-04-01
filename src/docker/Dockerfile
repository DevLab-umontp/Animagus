FROM java:openjdk-8-jdk
COPY ./target/Animagus-1.0-SNAPSHOT-jar-with-dependencies.jar /usr/app/
WORKDIR /usr/app
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "Animagus-1.0-SNAPSHOT-jar-with-dependencies.jar"]
