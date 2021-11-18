FROM openjdk:8
ADD target/docker-firstprj.jar docker-firstprj.jar
EXPOSE 8090
ENTRYPOINT ["java","-jar","docker-firstprj.jar"]