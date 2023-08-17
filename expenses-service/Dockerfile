FROM amazoncorretto:17-alpine-jdk
RUN mkdir "expense-service"
COPY ./target/expenses-service-*.jar /expense-service/expense-service-spring-boot.jar
WORKDIR /expense-service

EXPOSE 8080
ENTRYPOINT ["java","-jar","expense-service-spring-boot.jar"]