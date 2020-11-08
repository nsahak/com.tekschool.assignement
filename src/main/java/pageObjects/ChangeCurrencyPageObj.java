package pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class ChangeCurrencyPageObj extends Base {

	public ChangeCurrencyPageObj() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"menu\"]/div[2]/ul/li[1]/a")
	private WebElement desktpMenu;
	@FindBy(xpath = "//*[@id=\"form-currency\"]/div/button/span")
	private List<WebElement> currencyDropDown;

	public void clickOnDesktopMenu() {
		desktpMenu.click();
	}

	public void clickOnCurrencyDropDown() {
		for (WebElement currencydDown : currencyDropDown)
			if (currencyDropDown.get(0).getText().contains("Euro")) {
				continue;
			} else if (currencyDropDown.get(1).getText().contains("Pound")) {
				continue;
			} else if (currencyDropDown.get(2).getText().contains("Dollar")) {
				currencydDown.click();
			}
	}

}
