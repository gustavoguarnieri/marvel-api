#Marvel API

This project was generated with Spring Boot, Spring Data, MySql database and Intellij IDE.


##Requirements

JDK 1.8

Maven 4

Docker Desktop

IDE

Postman

##Steps

1 - Clone the project from github and open it in your IDE.

2 - Start the MySQL database image with docker command: docker-compose up (the file docker-compose.yml will be executed).

3 - Run the marvel-api project, the data-mysql.sql file will be automatically executed to insert records in the MySQL database.

4 - Use the public link of Postman Collection shared (https://www.getpostman.com/collections/3ea92eb74010b25f2247) to consume the endpoints or another program of your choice for the endpoints listed below:


Implemented endpoints list:

/v1/public/characters

/v1/public/characters/{characterId}

/v1/public/characters/{characterId}/comics

/v1/public/characters/{characterId}/events

/v1/public/characters/{characterId}/series

/v1/public/characters/{characterId}/stories








