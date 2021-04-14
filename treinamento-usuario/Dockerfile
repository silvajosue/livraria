FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD ./target/treinamento-usuario-0.0.1-SNAPSHOT.jar livraria-usuario.jar
ENTRYPOINT ["java","-jar","/livraria-usuario.jar"]