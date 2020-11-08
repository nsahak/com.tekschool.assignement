@ChangeCurrencyTest 
Feature: User is able to change currency 


@ChangeCurrency 
Scenario: User should be able to change currency of product price 
	Given User is on Retail website 
	When User click on product dropdown menu 
	And User click on currency button 
	And User select on of the currency 
	Then User see the currency has been changed