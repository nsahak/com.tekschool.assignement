package stepDefinitions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import core.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.AddToShoppingCartPageObj;
import utilities.WebDriverUtility;

public class AddToShoppingCartStepDef {

	AddToShoppingCartPageObj addToCartPageObj = new AddToShoppingCartPageObj();

	
	@Given("^User is on Retail website$")
	public void user_is_on_Retail_website() throws Throwable {
		// we need to get to the retail Website.
		Base.initializeDriver();
	}

	@When("^User click on product from the dropdown$")
	public void user_click_on_product_from_the_dropdown(WebElement desktopDropDown) throws Throwable {
		Select select = new Select(desktopDropDown);
		select.selectByVisibleText("Mac (1)");
		WebDriverUtility.wait(3000);
		WebDriverUtility.screenShot();

	}

	@When("^User click on the add to cart button$")
	public void user_click_on_the_add_to_cart_button() throws Throwable {
		addToCartPageObj.clickOnAddoToCartButton();

	}

	@When("^User see a message$")
	public void user_see_a_message() throws Throwable {
		addToCartPageObj.getSuccessMessage();
		WebDriverUtility.wait(3000);
		WebDriverUtility.screenShot();
	}

	@When("^User click on items$")
	public void user_click_on_items() throws Throwable {
		addToCartPageObj.clickOnItemsButton();

	}

	@When("^User click on view cart$")
	public void user_click_on_view_cart() throws Throwable {
		addToCartPageObj.clickOnViewCartItems();

	}

	@Then("^user see list of added products available$")
	public void user_see_list_of_added_products_available() throws Throwable {
		addToCartPageObj.shoppingCartTableDisplayed();
		WebDriverUtility.wait(3000);
		WebDriverUtility.screenShot();

	}

}
