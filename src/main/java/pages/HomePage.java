package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import static common.CommonActions.*;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//input[@class='jsx-3418619203 button']//following-sibling::div[@class='jsx-3418619203 outline']//parent::div[@class='jsx-1608262059 inner jsx-3727320559 jsx-2537838520 jsx-454447392 jsx-2014647566'])[1]")
	WebElement autoButton;

	@FindBy(xpath = "(//input[@class='jsx-3418619203 button']//following-sibling::div[@class='jsx-3418619203 outline']//parent::div[@class='jsx-1608262059 inner jsx-3727320559 jsx-2537838520 jsx-454447392 jsx-2014647566'])[2]")
	WebElement homeButton;

	@FindBy(xpath = "(//input[@class='jsx-3418619203 button']//following-sibling::div[@class='jsx-3418619203 outline']//parent::div[@class='jsx-1608262059 inner jsx-3727320559 jsx-2537838520 jsx-454447392 jsx-2014647566'])[3]")
	WebElement condoButton;

	@FindBy(xpath = "(//input[@class='jsx-3418619203 button']//following-sibling::div[@class='jsx-3418619203 outline']//parent::div[@class='jsx-1608262059 inner jsx-3727320559 jsx-2537838520 jsx-454447392 jsx-2014647566'])[4]")
	WebElement rentersButton;

	@FindBy(xpath = "//span[text()='Log in']")
	WebElement loginButton;

	@FindBy(xpath = "//input[@id='quote-zipCode-input']")
	WebElement zipCodeField;

	@FindBy(xpath = "(//a[@data-action='action url'])[1]")
	WebElement logo;

	@FindBy(xpath = "//button[@type='submit']//child::span[@class='lmig-Button-text' and text()='Get my price']")
	WebElement getMyprice;

	public void clickAutoButton() throws InterruptedException {
		autoButton.click();
		Thread.sleep(7000);
	}

	public void clickhomeButton() throws InterruptedException {
		homeButton.click();
		Thread.sleep(7000);
	}

	public void clickCondoButton() throws InterruptedException {
		condoButton.click();
		Thread.sleep(7000);
	}

	public void clickRentersButton() throws InterruptedException {
		rentersButton.click();
		Thread.sleep(7000);
	}

	// use of common method clickElement(WebElement)
	public void clickLoginButton() throws InterruptedException {
		clickElement(loginButton);
		;
		Thread.sleep(7000);
	}

	// I used sendKeys()method to put the text in the zipCodeField
	public void inputTextInZipCodeField() {
		zipCodeField.sendKeys("14215");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	// I validated the logo here
	public void clickLogo() throws InterruptedException {
		logo.click();
		Thread.sleep(7000);
	}

	// I'm used both common action here
	public void inputTextInZipeCodeFieldThenClickGetMyPriceButton() throws InterruptedException {
		inputText(zipCodeField, "14215");
		Thread.sleep(5000);
		clickElement(getMyprice);
		Thread.sleep(5000);
	}

	public boolean logoDisplayed() {
//	boolean flag = logo.isDisplayed();
//		return flag;
		return logo.isDisplayed();
	}

}
