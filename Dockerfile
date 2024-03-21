FROM eclipse-temurin:17-jdk-alpine
RUN apk add curl
VOLUME /tmp
EXPOSE 8080
ADD target/service1.jar service1.jar
ENTRYPOINT ["java","-jar","/service1.jar"]
