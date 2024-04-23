FROM openjdk:17.0.1-jdk-slim
EXPOSE 9001
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} demo.jar
ENTRYPOINT ["java", "-jar", "/demo.jar"]