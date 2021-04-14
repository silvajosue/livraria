FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 8888
ADD ./target/treinamento-server-0.0.1-SNAPSHOT.jar livraria-server.jar
ENTRYPOINT ["java","-jar","/livraria-server.jar"]