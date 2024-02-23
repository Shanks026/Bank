FROM openjdk:17-jdk-slim
WORKDIR /var/www/java
COPY . /var/www/java
RUN javac BankAccount.java Bank.java Main.java
CMD ["java", "Main"]