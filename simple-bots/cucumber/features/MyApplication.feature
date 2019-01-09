Feature: Test Facebook smoke scenario
	
	Scenario: Test Login with valid credentials
	Given Open firefox and start application
	When I enter valid username and valiad password
	Then user should be able to login sucessfully 
