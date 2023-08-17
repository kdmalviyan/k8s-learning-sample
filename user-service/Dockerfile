FROM amazoncorretto:17-alpine-jdk
RUN mkdir "user-service"
COPY ./target/user-service-*.jar /user-service/user-service-spring-boot.jar
WORKDIR /user-service

EXPOSE 8080
ENTRYPOINT ["java","-jar","user-service-spring-boot.jar"]