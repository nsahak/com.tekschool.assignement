package stepDefinitions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.ChangeCurrencyPageObj;
import utilities.WebDriverUtility;

public class ChangeCurrencyStepDef {

	ChangeCurrencyPageObj currencyPageObj = new ChangeCurrencyPageObj();

	@When("^User click on product dropdown menu$")
	public void user_click_on_product_dropdown_menu(WebElement dDown) throws Throwable {
		Select select = new Select(dDown);
		select.selectByVisibleText("Mac (1)");

	}

	@When("^User click on currency button$")
	public void user_click_on_currency_button() throws Throwable {
		currencyPageObj.clickOnCurrencyDropDown();
	}

	@When("^User select on of the currency$")
	public void user_select_on_of_the_currency(WebElement currency) throws Throwable {
		currencyPageObj.clickOnCurrencyDropDown();
		Select select = new Select(currency);
		select.selectByIndex(0);
		WebDriverUtility.wait(3000);
		WebDriverUtility.screenShot();
		select.selectByIndex(1);
		WebDriverUtility.wait(3000);
		WebDriverUtility.screenShot();
		select.selectByIndex(2);
		WebDriverUtility.wait(3000);
		WebDriverUtility.screenShot();
	}

	@Then("^User see the currency has been changed$")
	public void user_see_the_currency_has_been_changed() throws Throwable {
		WebDriverUtility.wait(3000);
		WebDriverUtility.screenShot();

	}

}
