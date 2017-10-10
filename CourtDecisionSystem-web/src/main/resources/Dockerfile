# Version 2.0
FROM java:8
VOLUME /tmp
#RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/CourtDecisionSystem.jar"]
EXPOSE 8080