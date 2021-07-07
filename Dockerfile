FROM devops01.icico.net.ir/jdk-8u222:01

COPY target/*.jar /integration.jar

EXPOSE 8080

ENV PROFILE=dev JVM_ARGS=""

VOLUME /tmp

ENTRYPOINT java $JVM_ARGS -Djava.security.egd=file:/dev/urandom -Dspring.profiles.active=$PROFILE -jar /integration.jar
