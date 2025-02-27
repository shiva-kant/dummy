FROM java:8
ADD db_service.jar db_service.jar
EXPOSE 8086
ADD /application.yml application.yml
CMD ["java","-jar","/db_service.jar"]

