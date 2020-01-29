FROM openjdk:8-jdk-alpine
EXPOSE 6080
WORKDIR /app
COPY target/customer-service-3.jar .
ENTRYPOINT [ "java", "-jar", "customer-service-3.jar" ]
