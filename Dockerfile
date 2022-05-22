FROM openjdk:11-jdk
COPY target/jenkins-demo.jar app.jar
ENTRYPOINT ["java", "-jar", "jenkins-demo.jar"]