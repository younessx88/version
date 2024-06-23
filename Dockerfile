FROM openjdk:17-jdk-slim

VOLUME /tmp

COPY target/OrderManagment-0.0.1-SNAPSHOT.jar order-management-system.jar

ENTRYPOINT ["java", "-jar", "/order-management-system.jar"]
