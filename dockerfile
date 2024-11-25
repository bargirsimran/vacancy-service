FROM openjdk:24-jdk-slim
RUN apt update

RUN apt install -y iputils-ping

WORKDIR /app

COPY target/vacancy-service-1-latest.jar vacancy-service-1-latest.jar

CMD ["java","-jar","vacancy-service-1-latest.jar"] 