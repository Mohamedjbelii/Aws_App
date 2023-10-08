FROM openjdk:11
ADD /target/aws-app-0.0.1-SNAPSHOT.jar aws-app-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "aws-app-0.0.1-SNAPSHOT.jar"]
