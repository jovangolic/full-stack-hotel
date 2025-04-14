# Faza 1: Build faza
#FROM maven:3.9.6-openjdk-17 AS build

# Postavljanje radnog direktorijuma
#WORKDIR /app

# Kopiraj pom.xml i preuzmi zavisnosti
#COPY pom.xml .
#RUN mvn dependency:go-offline

# Kopiraj izvorni kod
#COPY src ./src

# Build aplikacije
#RUN mvn clean package -DskipTests

# Faza 2: Runtime faza
#FROM eclipse-temurin:17-jdk

# Kreiraj radni direktorijum
#WORKDIR /app

# Kopiraj samo JAR fajl iz build faze
#COPY --from=build /app/target/back-v2-0.0.1-SNAPSHOT.jar /app/back-v2.jar

# Izloži port na kojem će aplikacija raditi
#EXPOSE 8080

# Pokreni aplikaciju
#CMD ["java", "-jar", "/app/back-v2.jar"]

#FROM openjdk:17-jdk-buster
#COPY target/back-v2-0.0.1-SNAPSHOT.jar /app/back-v2.jar
#ENTRYPOINT [ "java", "-jar", "/app/back-v2.jar" ]
FROM openjdk:17-jdk-buster

WORKDIR /app

COPY target/back-v2-0.0.1-SNAPSHOT.jar /app/back-v2.jar

ENTRYPOINT ["java", "-jar", "/app/back-v2.jar"]