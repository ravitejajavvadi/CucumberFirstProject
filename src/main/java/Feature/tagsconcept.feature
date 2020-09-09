Feature: verify the grouping functionality

@SmokeTest @RegressionTest
Scenario: verify the smoke test cases
Given user login to the application

@SmokeTest @First
Scenario: create a new user
Given user click on user new document
@SmokeTest @Second
Scenario: useer able to seearch the user list
Given user enter created useer id the respective details gettin
@RegressionTest
Scenario: user ale to edit the details
Given created user details able to edit the data
@RegressionTest
Scenario: user able to view the details
Given user clcik on view icon
@RegressionTest
Scenario: user able to delete the data
Given  user click on cancel icon record will be deleted
@SmokeTest @End2EndTest
Scenario: create the prescription
Given user create the OP Prescription
@SanityTest
Scenario: create the drug fill
Given User create the drug fill
@SanityTest
Scenario: create the receipt
Given user able to create the receipt
@SanityTest
Scenario: create the dispatch
Given user able to dispatch the bill
@SanityTest @RegressionTest
Scenario: create the due receipt bill
Given user able to create the due receipt bill

Scenario: create the patient returns 
Given user create the patient returns record