FROM openjdk:17-oracle
ARG JAR_FILE=build/libs/\*.jar
COPY ${JAR_FILE} /java/app.jar
ENTRYPOINT ["java","-Dhttp.proxyHost=webcache.example","-jar","/java/app.jar"]
