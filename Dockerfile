FROM amazoncorretto:11

MAINTAINER Robles_Facundo

COPY target/demo-0.0.1-SNAPSHOT.jar backPortfolioRobles.jar

ENTRYPOINT ["java","-jar","/backPortfolioRobles.jar"]
