package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class AddToWishListPageObj extends Base {

	public AddToWishListPageObj() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[contains(text(),'My Account')]")
	private WebElement myAccount;
	@FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")
	private WebElement loginButton;
	@FindBy(id = "input-email")
	private WebElement emailField;
	@FindBy(id = "input-password")
	private WebElement passwordField;
	@FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/div/form/input")
	private WebElement continueButton;
	@FindBy(xpath = "//*[@id=\"menu\"]/div[2]/ul/li[1]/a")
	private WebElement productMenu;
	@FindBy(xpath = "//*[@id=\"menu\"]/div[2]/ul/li[1]/div/div/ul/li[2]/a")
	private WebElement product;
	@FindBy(xpath = "//*[@id=\"content\"]/div[2]/div/div/div[2]/div[2]/button[2]")
	private WebElement heartIcon;
	@FindBy(xpath = "//*[@id=\"product-category\"]/div[1]")
	private WebElement successMessage;
	@FindBy(xpath = "//*[@id=\"wishlist-total\"]/span")
	private WebElement wishList;
	@FindBy(xpath = "//*[@id=\"content\"]/div[1]/table")
	private WebElement wishListTable;

	public void clickOnMyAccount() {
		myAccount.click();
	}

	public void clickOnLoginButton() {
		loginButton.click();
	}

	public void enterEmailAddress(String emailAddress) {
		emailField.sendKeys(emailAddress);
	}

	public void enterPassword(String password) {
		passwordField.sendKeys(password);
	}

	public void clickOnContinueButton() {
		continueButton.click();
	}

	public void clickOnProductMenu() {
		productMenu.click();
	}

	public void clickOnProduct() {
		product.click();
	}

	public void clickOnHeartIcon() {
		if(!heartIcon.isSelected())
		heartIcon.click();
	}

	public boolean getSucccessMessage() {
		if(successMessage.getText().trim().contains("Success: You have added"))
			return true;
		else
			return false;
	}

	public void clickOnWishList() {
		wishList.click();
	}

	public void seeWishListTable() {
		wishListTable.isDisplayed();
	}

}
