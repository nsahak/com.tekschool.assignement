package stepDefinitions;

import org.junit.Assert;
import core.Base;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.LoginPageObj;
import pageObjects.MyAccountPageObj;
import utilities.WebDriverUtility;

public class LoginTestStepDefinition extends Base {
	// we need to create and object of the loginPageObj
	LoginPageObj loginPageObj = new LoginPageObj();
	MyAccountPageObj myAccountPageObj = new MyAccountPageObj();

	@Given("^User is on Retail website$")
	public void user_is_on_Retail_website() throws Throwable {
		// we need to get to the retail Website.
		Base.initializeDriver();
		logger.info("Retail page is opened");
		String actualPageTitle = loginPageObj.getPageTitle();
		String expectedPageTitle = "TEK SCHOOL";
		Assert.assertEquals(expectedPageTitle, actualPageTitle);
		logger.info("Page title  is verified");
		WebDriverUtility.screenShot();
	}

	@And("^User click on MyAccount$")
	public void user_click_on_MyAccount() throws Throwable {
		loginPageObj.clickOnMyAccount();
	}

	@When("^User click on Login$")
	public void user_click_on_Login() throws Throwable {
		loginPageObj.clickonLogin();
		WebDriverUtility.wait(3000);
	}

	// We can pass values from scenario steps using (.+)
	@And("^User enter username '(.+)' and password '(.+)'$")
	public void user_enter_username_sdet_tekschool_us_and_password_sdet(String userName, String password) throws Throwable {
		loginPageObj.enterEmailAddress(userName);
		loginPageObj.enterPassword(password);
		WebDriverUtility.wait(3000);
		WebDriverUtility.screenShot();
	}

	@And("^User click on Login button$")
	public void user_click_on_Login_button() throws Throwable {
		loginPageObj.clickOnLoginButton();
	}

	@Then("^User should be logged in to MyAccount dashboard$")
	public void user_should_be_logged_in_to_MyAccount_dashboard() throws Throwable {
		Assert.assertTrue(myAccountPageObj.isMyAccountDisplayed());
		Assert.assertTrue(myAccountPageObj.isMyOrdersDisplayed());
		WebDriverUtility.screenShot();
	}


}