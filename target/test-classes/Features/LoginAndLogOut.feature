@LoginAndLogout
Feature: Automation Test Scenarios 

#any steps which are repeated at the beginning of all scenarios in one feature can be placed
#under Background keyword and it will reduce code duplicate and writing same steps over and over
Background: 
	Given User is on Retail website 
	And User click on MyAccount
	
@login 
Scenario: Login to MyAccount  
	When User click on Login 
	And User enter username 'sdet@tekschool.us' and password 'sdet' 
	And User click on Login button 
	Then User should be logged in to MyAccount dashboard 
	
@Logout 
Scenario: Log out from MyAccount 
	And  User click on Logout 
	Then User Should be logged out from MyAccount dashboard 