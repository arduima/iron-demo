FROM iron/java

WORKDIR /app
ADD build/libs/irondemo-*.jar /app/app.jar

ENTRYPOINT ["java","-jar","/app/app.jar"]