package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class RemoveFromShoppingCartPageObj extends Base {

	public RemoveFromShoppingCartPageObj() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"cart\"]/button")
	private WebElement shoppingCartMenu;
	@FindBy(xpath = "//*[@id=\"cart\"]/ul/li[1]/table/tbody/tr/td[5]/button/i")
	private WebElement redXButton;
	@FindBy(xpath = "//p[contains(text(),'Your shopping cart is empty!')]")
	private WebElement cartEmptyText;

	public void clickOnshoppingCartMenu() {
		shoppingCartMenu.click();
	}

	public void clickOnRedXButton() {
		redXButton.click();
	}

	public boolean getCartEmptyText() {

		if (cartEmptyText.getText().trim().contains("Your shopping cart is empty"))
			return true;
		else
			return false;
	}

}
