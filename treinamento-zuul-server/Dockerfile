FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 8765
ADD ./target/treinamento-zuul-server-0.0.1-SNAPSHOT.jar treinamento-zuul.jar
ENTRYPOINT ["java","-jar","/treinamento-zuul.jar"]