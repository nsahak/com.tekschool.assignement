@RegisterFormTest
Feature: Register account in retail website 

@RegisterForm 
Scenario: Resgister Account for new Retail user 
	Given User is on Retail website 
	When User click on MyAccount 
	And User click on Register 
	And User fill out Resgister form with below information 
		|firstName|lastName|email                 |phone     |password |
		|Obaid    |Hamza   |obaid.hamza@gmail.com |2021115000|Hamza123 |
	And User select 'yes' for Subscibe 
	And User click on privacy and policy check box 
	And User click on continue button 
	Then User should see massage 'Your Account Has Been Created'