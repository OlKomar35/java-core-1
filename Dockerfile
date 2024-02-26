FROM openjdk:latest

WORKDIR /usr/src/app

COPY ./src/main/java .

RUN javac -sourcepath . -d out ./org/lesson1/Program.java

WORKDIR /usr/src/app/out

CMD java -classpath . org.lesson1.Program
