package pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class CheckOutPageObj extends Base {

	public CheckOutPageObj() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"menu\"]/div[2]/ul/li[1]/a")
	private WebElement desktopDropDown;
	@FindBy(xpath = "//nav[@id='menu']/div[2]/ul/li[1]/div/div/ul/li")
	private List<WebElement> listOfDesktopItems;
	@FindBy(xpath = "//span[contains(text(),'Add to Cart')]")
	private WebElement addToCartButton;
	@FindBy(xpath = "//span[contains(text(),'Shopping Cart')]")
	private WebElement shoppingCart;
	@FindBy(xpath = "//span[contains(text(),'Shopping Cart')]")
	private WebElement quantities;
	@FindBy(xpath = "//*[@id=\"content\"]/form/div/table/tbody/tr/td[5]")
	private WebElement unitPrice;
	@FindBy(xpath = "//*[@id=\"content\"]/h2")
	private WebElement textToSeeNext;
	@FindBy(xpath = "//*[@id=\"accordion\"]/div[1]/div[1]/h4/a")
	private WebElement useCouponCode;
	@FindBy(id = "input-coupon")
	private WebElement enterCouponCode;
	@FindBy(id = "button-coupon")
	private WebElement ApplyCouponButton;
	@FindBy(xpath = "//*[@id=\"accordion\"]/div[2]/div[1]/h4/a")
	private WebElement estimateShoppinAndTaxes;
	@FindBy(id = "input-country")
	private WebElement enterCountryName;
	@FindBy(id = "input-zone")
	private WebElement enterRegion;
	@FindBy(id = "input-postcode")
	private WebElement enterPostCode;
	@FindBy(id = "button-quote")
	private WebElement getQouteButton;
	@FindBy(xpath = "//*[@id=\"accordion\"]/div[3]/div[1]/h4/a")
	private WebElement useGiftCertificate;
	@FindBy(id = "input-voucher")
	private WebElement enterGiftCertificateCode;
	@FindBy(id = "button-voucher")
	private WebElement applyGiftCertificateButton;
	@FindBy(xpath = "//*[@id=\"content\"]/div[2]/div/table")
	private WebElement totalTable;
	@FindBy(xpath = "//*[@id=\"content\"]/div[3]/div[2]/a")
	private WebElement checkOutButton;

	public void hoverOverDesktopMenu() {
		WebDriverUtility.moveToElementAction(desktopDropDown);
		for (WebElement items : listOfDesktopItems) {
			if (items.getText().trim().contains("Mac")) {
				items.click();
			}
		}
	}

	public void clickOnAddoToCartButton() {
		addToCartButton.click();
	}

	public void clickOnShoppingCart() {
		shoppingCart.click();
	}

	public void seeSelectedQuantities() {
		quantities.isDisplayed();
	}

	public void seeUnitPrice() {
		unitPrice.isDisplayed();
	}

	public void seeTextToNext() {
		String seeTex = textToSeeNext.getText();
		System.out.println(seeTex);

	}

	public void clickOnCoupon() {
		useCouponCode.click();
	}

	public void enterCoupon() {
		enterCouponCode.sendKeys("");
	}

	public void applyCouponButton() {
		ApplyCouponButton.click();

	}

	public void clickEstimateAndShippingAndTaxes() {
		estimateShoppinAndTaxes.click();
	}

	public void enterCountryName(String country) {
		enterCountryName.sendKeys(country);
	}

	public void enterRegion(String region) {
		enterRegion.sendKeys(region);
	}

	public void enterPostalCode(String postalCode) {
		enterPostCode.sendKeys(postalCode);
	}

	public void clickOnQuote() {
		getQouteButton.click();
	}

	public void clickGiftCertificate() {
		useGiftCertificate.click();

	}

	public void enterGiftCertificate(String giftCertificate) {
		enterGiftCertificateCode.sendKeys(giftCertificate);
	}

	public void clickOnApllyGiftCertificate() {
		enterGiftCertificateCode.click();

	}

	public void seeTotalTable() {
		totalTable.isDisplayed();
	}

	public void clickOnCheckOutButton() {
		checkOutButton.click();
	}

}
