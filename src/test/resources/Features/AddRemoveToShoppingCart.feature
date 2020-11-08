@AddRemovetoShoppingCart
Feature: Add and remove product to shopping cart


Background: 
	Given User is on Retail website
	
	
@AddProductToCart 
Scenario: Add Products to Shopping Cart 
	When User click on product from the dropdown 
	And User click on the add to cart button 
	And User see a message 
	And User click on items 
	And User click on view cart 
	Then user see list of added products available 
	
@RemoveFromCart 
Scenario: Remove Product from Shopping Cart 
	When User click on shopping cart menu 
	And User click click on the x button 
	Then User see the product is removed 