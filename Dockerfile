FROM dpokidov/imagemagick:7.1.1-31-2-ubuntu

RUN apt-get update -y
RUN apt-get install -y sudo curl wget apt-utils build-essential pkg-config openjdk-17-jdk

COPY . .

RUN ./gradlew build
RUN ./gradlew test

# override "dpokidov/imagemagick" default entrypoint
ENTRYPOINT [""]
