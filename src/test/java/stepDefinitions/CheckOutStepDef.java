package stepDefinitions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import core.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.CheckOutPageObj;
import utilities.WebDriverUtility;

public class CheckOutStepDef {

	CheckOutPageObj checkOut = new CheckOutPageObj();

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
		checkOut.clickOnAddoToCartButton();

	}

	@When("^User click on shopping cart$")
	public void user_click_on_shopping_cart() throws Throwable {
		checkOut.clickOnShoppingCart();

	}

	@When("^User see quantities of the product added$")
	public void user_see_quantities_of_the_product_added() throws Throwable {
		checkOut.seeSelectedQuantities();
		WebDriverUtility.wait(3000);

	}

	@When("^User see unit price of the product$")
	public void user_see_unit_price_of_the_product() throws Throwable {
		checkOut.seeUnitPrice();

	}

	@When("^User see a text ‘What would you like to do next\\?’$")
	public void user_see_a_text_What_would_you_like_to_do_next() throws Throwable {
		checkOut.seeTextToNext();

	}

	@When("^User click on coupon code$")
	public void user_click_on_coupon_code() throws Throwable {
		checkOut.clickOnCoupon();

	}

	@When("^User enter coupon code$")
	public void user_enter_coupon_code() throws Throwable {
		checkOut.enterCoupon();
		WebDriverUtility.wait(3000);

	}

	@When("^User click on apply coupon button$")
	public void user_click_on_apply_coupon_button() throws Throwable {
		checkOut.applyCouponButton();

	}

	@When("^User click on estimate shipping and taxes$")
	public void user_click_on_estimate_shipping_and_taxes() throws Throwable {
		checkOut.clickEstimateAndShippingAndTaxes();

	}

	@When("^User enter country name$")
	public void user_enter_country_name() throws Throwable {
		checkOut.enterCountryName("Afghanistan");
		WebDriverUtility.wait(3000);
		WebDriverUtility.screenShot();

	}

	@When("^User enter region name$")
	public void user_enter_region_name() throws Throwable {
		checkOut.enterRegion("Badakhshan");
		WebDriverUtility.wait(3000);

	}

	@When("^User enter post code$")
	public void user_enter_post_code() throws Throwable {
		checkOut.enterPostalCode("20785");
		WebDriverUtility.wait(3000);

	}

	@When("^User click on get quote$")
	public void user_click_on_get_quote() throws Throwable {
		checkOut.clickOnQuote();

	}

	@When("^User click on use gift certificate$")
	public void user_click_on_use_gift_certificate() throws Throwable {
		checkOut.clickGiftCertificate();

	}

	@When("^User enter gift certificate here$")
	public void user_enter_gift_certificate_here() throws Throwable {
		checkOut.enterGiftCertificate("GIFT");
		WebDriverUtility.wait(3000);
		WebDriverUtility.screenShot();

	}

	@When("^User click on apply gift certificate$")
	public void user_click_on_apply_gift_certificate() throws Throwable {
		checkOut.clickOnApllyGiftCertificate();

	}

	@When("^User see total amount$")
	public void user_see_total_amount() throws Throwable {
		checkOut.seeTotalTable();
		WebDriverUtility.wait(3000);
		WebDriverUtility.screenShot();

	}

	@Then("^User click on checkout$")
	public void user_click_on_checkout() throws Throwable {
		checkOut.clickOnCheckOutButton();

	}

}
