package stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.RemoveFromShoppingCartPageObj;
import utilities.WebDriverUtility;

public class RemoveFromShoppingCartStepDef {
	
	RemoveFromShoppingCartPageObj removePageObj = new RemoveFromShoppingCartPageObj();
	
	@When("^User click on shopping cart menu$")
	public void user_click_on_shopping_cart_menu() throws Throwable {
		removePageObj.clickOnshoppingCartMenu();
	   
	}

	@When("^User click click on the x button$")
	public void user_click_click_on_the_x_button() throws Throwable {
		removePageObj.clickOnRedXButton();
	  
	}

	@Then("^User see the product is removed'$")
	public void user_see_the_product_is_removed() throws Throwable {
		removePageObj.getCartEmptyText();
		WebDriverUtility.wait(3000);
		WebDriverUtility.screenShot();
	}
	
	
}
