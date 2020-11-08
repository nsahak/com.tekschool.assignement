package pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class AddToShoppingCartPageObj extends Base {

	public AddToShoppingCartPageObj() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//*[@id=\"menu\"]/div[2]/ul/li[1]/a")
	private WebElement desktopDropDown;
	@FindBy(xpath = "//nav[@id='menu']/div[2]/ul/li[1]/div/div/ul/li")
	private List<WebElement> listOfDesktopItems;
	@FindBy(xpath = "//span[contains(text(),'Add to Cart')]")
	private WebElement addToCartButton;
	@FindBy(xpath = "//div/div[contains(text(), 'Success: You have added ')]")
	private WebElement successMessage;
	@FindBy(id = "cart-total")
	private WebElement itemsButton;
	@FindBy(xpath = "//*[@id=\"cart\"]/ul/li[2]/div/p/a[1]/strong")
	private WebElement viewCartButton;
	@FindBy(xpath = "//div[@class='table-responsive']")
	private WebElement shoppingCartTable;

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

	public boolean getSuccessMessage() {
		if(successMessage.getText().trim().contains("Success: You have added"))
			return true;
		else
			return false;
	}

	public void clickOnItemsButton() {
		itemsButton.click();
	}

	public void clickOnViewCartItems() {
		viewCartButton.click();
	}

	public boolean shoppingCartTableDisplayed() {
		if (shoppingCartTable.isDisplayed())
			return true;
		else
			return false;
	}

}
