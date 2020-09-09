Feature: AutomationPractice validat the  New user Email Address
#without Examples Keword
#Scenario: verify the New User Login Email

#Given user Prescent on the homePage
#When Title of the HomePage is My Store
#Then user click on SignIn button 



#Then Login Page title is Login - My Store
#Then user enter New Email address "raviteja123@gmail.com" for Creating New User Account and click on Create account Button
#Then user landing  on New user Create Account Page

Scenario Outline:verify the New User Login Email

Given user Prescent on the homePage
When Title of the HomePage is My Store
Then user click on SignIn button 
Then Login Page title is Login - My Store
Then user enter New Email address "<email>" for Creating New User Account and click on Create account Button
Then user landing on New user Create Account Page
Then close the browser
 
 Examples:
 |email|
 |raviteja123@gmail.com|
 |satish21@gmail.com   |
 |ram4321@gmail.com    |