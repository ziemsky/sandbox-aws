FROM openjdk:8-jdk-alpine

COPY libs/ecs-0.0.1-SNAPSHOT.jar /usr/src/myapp/app.jar
EXPOSE 8080
WORKDIR /usr/src/myapp
ENTRYPOINT ["java","-jar","/usr/src/myapp/app.jar"]