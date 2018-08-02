Feature: Login

In order to login in newtours App
As a user
I need to register first

Business rules:
 - Ony registered users can do the login
 - user should provide all the necessary details on registration page
 
To Do:
 -  password should have more than 8 characters 
 
#Background:
 #Given user is on the login page
 
 Scenario: user can do the successful login
 Given user is on the login page of newtours
 When  user provides the correct credentials in newtours
 Then  user rendered to newtours home page
 
 
 Scenario: user can do the successful Register
 Given user is on the registration page of newtours
 When  user provides the correct details in newtours
 Then  user registred to newtours