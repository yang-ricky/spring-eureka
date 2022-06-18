FROM openjdk:11-jre-slim

VOLUME /tmp
ADD spring-eureka-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8000
ENTRYPOINT ["java","-jar","/app.jar"]