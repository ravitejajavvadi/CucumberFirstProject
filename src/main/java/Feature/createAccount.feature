Feature: Create the New User Account with Employee Details 

Scenario: User able to Create new Employee Account in Login Page 

	Given user Prescent on the CreateAccount Page 
	When Loginpage title is Login - My Store 
	Then user select Gender and enter Firstname,lastname and password 
		|Title    |FirstName |LastName|Pwd      |
		|Mr		  |Ravi      |mohan   |mohan123 |
		|Mrs	  |swetha    |chandan |swetha123|
		|Mr		  |ganesh    |kumar   |gani123  |

		