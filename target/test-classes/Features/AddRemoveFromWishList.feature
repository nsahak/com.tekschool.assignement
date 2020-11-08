@AddAndRemoveWishList 
Feature: Add and remove product from wish list 

Background: 
	Given User is on Retail website 
	When User click on myAccount 
	And user click on log in 
	And User enter username 'sdet@tekschool.us' and password 'sdet' 
	And User click on log in button 
	
@AddToWishList 
Scenario: Add product to wish list 
	When User click on product menu 
	And User click on product 
	And User click on heart icon 
	And User see a success message 
	And User click on wish list button 
	Then User see list of items added 
	
@RemoveFromWishList 
Scenario: Remove product from wish list 
	When User click on wish list icon 
	And User click on red x button 
	Then User see list modification message 