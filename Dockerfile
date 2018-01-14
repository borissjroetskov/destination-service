FROM openjdk:8-jdk-alpine
RUN mkdir -p /usr/local/destination-service
ADD target/destination-service-0.0.1.jar /usr/local/destination-service/
ADD target/run.sh run.sh
RUN chmod +x run.sh
CMD ./run.sh
