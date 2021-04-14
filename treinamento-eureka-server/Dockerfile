FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 8761
ADD ./target/treinamento-eureka-server-0.0.1-SNAPSHOT.jar livraria-eureka-server.jar
ENTRYPOINT ["java","-jar","/livraria-eureka-server.jar"]