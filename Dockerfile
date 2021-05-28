FROM java:8
WORKDIR /
ADD verbose-1.0.jar verbose-1.0.jar
EXPOSE 8080
CMD java - jar verbose-1.0.jar encode hello world