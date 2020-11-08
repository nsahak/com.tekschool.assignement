package stepDefinitions;

import core.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.RemoveProductFromWishListPageObj;
import utilities.WebDriverUtility;

public class RemoveFromWishListStepDef extends Base {

	RemoveProductFromWishListPageObj removeWishList = new RemoveProductFromWishListPageObj();

	@Given("^User click on wish list icon$")
	public void user_click_on_wish_list_icon() throws Throwable {
		removeWishList.clickOnWishList();
	}

	@When("^User click on red x button$")
	public void user_click_on_red_x_button() throws Throwable {
		removeWishList.clickOnXButton();
	}

	@Then("^User see list modification message$")
	public void user_see_list_modification_method() throws Throwable {
		removeWishList.getModificationMessage();
		WebDriverUtility.wait(3000);
		WebDriverUtility.screenShot();

	}

}
