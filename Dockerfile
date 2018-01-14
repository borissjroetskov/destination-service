FROM openjdk:8-jdk-alpine
RUN  apk update && apk upgrade && apk add netcat-openbsd
RUN mkdir -p /usr/local/destination-service
ADD  destination-service-0.0.1.jar /usr/local/destination-service/
ADD run.sh run.sh
RUN chmod +x run.sh
CMD ./run.sh
