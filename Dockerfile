FROM openjdk:11-jre-slim
MAINTAINER Luong Tran <luongtx@gmail.com>
WORKDIR /myapp
COPY /target/product-catalog-service.jar /myapp
EXPOSE 2222
ENTRYPOINT ["java", "-jar", "product-catalog-service.jar"]