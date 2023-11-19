FROM openjdk:21

WORKDIR /app

COPY src ./src
COPY .mvn ./.mvn
COPY mvnw pom.xml ./
RUN ./mvnw clean install

CMD ["java","-jar","-Dspring.profiles.active=docker","target/spring-redis-caching-0.0.1-SNAPSHOT.jar"]