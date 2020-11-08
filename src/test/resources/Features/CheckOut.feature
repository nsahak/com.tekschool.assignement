@CheckOutTestScenario 
Feature: User is able to checkout from the retail website 

@CheckOut 
Scenario: Calculate total cost for products in the shopping cart 
	Given User is on Retail website 
	When User click on product from the dropdown 
	And User click on the add to cart button 
	When User click on shopping cart 
	And User see quantities of the product added 
	And User see unit price of the product 
	And User see a text ‘What would you like to do next?’ 
	And User click on coupon code 
	And User enter coupon code 
	And User click on apply coupon button 
	And User click on estimate shipping and taxes 
	And User enter country name 
	And User enter region name 
	And User enter post code 
	And User click on get quote 
	And User click on use gift certificate 
	And User enter gift certificate here 
	And User click on apply gift certificate 
	And User see total amount 
	Then User click on checkout 
	