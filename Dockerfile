
FROM openjdk:11-jre-slim



COPY . .


CMD ["java", "-jar", "*.jar"]
