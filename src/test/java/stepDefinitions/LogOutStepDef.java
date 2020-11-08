package stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.LogOutPageObj;
import utilities.WebDriverUtility;

public class LogOutStepDef {

	LogOutPageObj logOutPageObj = new LogOutPageObj();

	@When("^User click on Logout$")
	public void user_click_on_Logout() throws Throwable {
		logOutPageObj.clickOnLogoutButton();

	}

	@Then("^User Should be logged out from MyAccount dashboard$")
	public void user_Should_be_logged_out_from_MyAccount_dashboard() throws Throwable {
		logOutPageObj.accountLogoutTextDisplayed();
		WebDriverUtility.wait(3000);
		WebDriverUtility.screenShot();

	}
}
