FROM openjdk:11
EXPOSE 8080
ADD target/project-ci-cd-demo.jar project-ci-cd-demo.jar
ENTRYPOINT ["java","-jar","/project-ci-cd-demo.jar"]