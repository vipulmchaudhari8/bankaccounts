FROM openjdk:latest

VOLUME /tmp

ADD target/bankaccounts-0.0.1-SNAPSHOT.jar bankaccounts-0.0.1-SNAPSHOT

ENTRYPOINT ["java","-jar","bankaccounts-0.0.1-SNAPSHOT"]

EXPOSE 8081
