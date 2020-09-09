Feature: Create the New User Account with Employee Details

Scenario: User able to Create new Employee Account in Login Page

Given user Prescent on the Login Page
When Title of the Loginpage is Login - My Store
Then user select Gender
|Mr|
And user enter Firstname
|Ravi|
And user enter lastname
|Kiren|
And user enter password
|ravi@123|
#And user select dateofbirth
#And user enter address
#And user enter city
#And user select state
#And user enter zipcode
#And user enter country
#And user enter mobilenumber
#And user enter Alisaddress
#Then user click on register button
#Then User Should See Created Account  successfully 