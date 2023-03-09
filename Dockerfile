FROM amazoncorretto:11-alpine-jdk
MAINTAINER GAT
COPY target/gat-0.0.1-SNAPSHOT.jar gat-app.jar
ENTRYPOINT ["java","-jar","/gat-app.jar"]
