FROM openjdk:8-jdk-alpine
LABEL maintainer="jfco.navarrete@gmail.com"
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=target/HelloWorld-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} HelloWorld.jar
ENTRYPOINT ["java","-jar","/HelloWorld.jar"]
