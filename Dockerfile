FROM adoptopenjdk/openjdk11:alpine-jre
RUN mkdir /app
COPY target/api-miyofuturo-0.0.1-SNAPSHOT.jar /app/api-miyofuturo.jar
EXPOSE 8080
WORKDIR /app
ENTRYPOINT ["java","-jar","api-miyofuturo.jar"]