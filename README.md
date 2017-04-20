# simple-rest-service

Simple Rest service using Spring MVC and Boot with minimal configuration 

uses redis/jedis driver see beans.xml for config 

Compile as maven project 

mvn clean install 

Execute from

Application.java


GET call http://localhost:8080/person

POST call http://localhost:8080/person

payload

{
  "firstName": "Jason",
  "lastName": "Bourne",
  "phone": "000-000-000",
  "email": "secret@gmail.com"
}
