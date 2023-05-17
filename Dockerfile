FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 8080
ADD target/movie-logger-app-0.0.1-SNAPSHOT.jar movie-logger.jar
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom","-jar","/movie-logger-db.jar"]

