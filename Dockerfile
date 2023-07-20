FROM openjdk:8
EXPOSE 8080
ADD target/spboot-k8s-demo.jar spboot-k8s-demo.jar
ENTRYPOINT ["java","-jar","/spboot-k8s-demo.jar"]