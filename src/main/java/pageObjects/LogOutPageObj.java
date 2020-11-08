package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LogOutPageObj extends Base {

	public LogOutPageObj() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]/ul/li[5]/a")
	private WebElement logout;
	@FindBy(xpath = "//*[@id=\"content\"]/h1")
	private WebElement accountLogoutText;

	public void clickOnLogoutButton() {
		logout.click();
	}

	public void accountLogoutTextDisplayed() {
		accountLogoutText.isDisplayed();

	}

}
