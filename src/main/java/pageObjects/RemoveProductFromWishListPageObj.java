package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class RemoveProductFromWishListPageObj extends Base {

	public RemoveProductFromWishListPageObj() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"wishlist-total\"]/span")
	private WebElement wishListButton;
	@FindBy(xpath = "//*[@id=\"content\"]/div[1]/table/tbody/tr/td[6]/a/i")
	private WebElement redXButton;
	@FindBy(xpath = "//*[@id=\"account-wishlist\"]/div[1]")
	private WebElement listModifcationMessage;

	public void clickOnWishList() {
		wishListButton.click();
	}

	public void clickOnXButton() {
		redXButton.click();
	}

	public boolean getModificationMessage() {
		if (listModifcationMessage.getText().trim().contains("Success: You have modified"))
			return true;
		else
			return false;
	}

}
