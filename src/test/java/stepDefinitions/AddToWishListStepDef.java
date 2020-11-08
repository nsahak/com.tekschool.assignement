package stepDefinitions;

import core.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.AddToWishListPageObj;
import utilities.WebDriverUtility;

public class AddToWishListStepDef extends Base {

	AddToWishListPageObj addToWishList = new AddToWishListPageObj();

	@Given("^User is on Retail website$")
	public void user_is_on_Retail_website() throws Throwable {
		// we need to get to the retail Website.
		Base.initializeDriver();

	}

	@When("^User click on myAccount$")
	public void user_click_on_myAccount() throws Throwable {
		addToWishList.clickOnMyAccount();
	}

	@When("^user click on log in$")
	public void user_click_on_log_in() throws Throwable {
		addToWishList.clickOnLoginButton();
	}

	@When("^User enter username '(.+)' and password '(.+)'$")

	public void user_enter_username_sdet_tekschool_us_and_password_sdet(String userName, String password)
			throws Throwable {
		addToWishList.enterEmailAddress(userName);
		addToWishList.enterPassword(password);
		WebDriverUtility.wait(3000);
		WebDriverUtility.screenShot();
	}

	@When("^User click on log in button$")
	public void user_click_on_log_in_button() throws Throwable {
		addToWishList.clickOnContinueButton();
		WebDriverUtility.wait(3000);
		WebDriverUtility.screenShot();
	}

	@When("^User click on product menu$")
	public void user_click_on_product_menu() throws Throwable {

		addToWishList.clickOnProductMenu();

	}

	@When("^User click on product$")
	public void user_click_on_product() throws Throwable {
		addToWishList.clickOnProduct();

	}

	@When("^User click on heart icon$")
	public void user_click_on_heart_icon() throws Throwable {
		addToWishList.clickOnHeartIcon();

	}

	@When("^User see a success message$")
	public void user_see_a_success_message() throws Throwable {
		addToWishList.getSucccessMessage();
		WebDriverUtility.wait(2000);
		WebDriverUtility.screenShot();
	}

	@When("^User click on wish list button$")
	public void user_click_on_wish_list_button() throws Throwable {
		addToWishList.clickOnWishList();
	}

	@Then("^User see list of items added$")
	public void user_see_list_of_items_added() throws Throwable {
		addToWishList.seeWishListTable();
		WebDriverUtility.wait(3000);
		WebDriverUtility.screenShot();

	}

}
