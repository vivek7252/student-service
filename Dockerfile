FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

COPY target/student-0.0.1-SNAPSHOT.jar .

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "student-0.0.1-SNAPSHOT.jar"]