package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//input[@class='jsx-3418619203 button']//following-sibling::div[@class='jsx-3418619203 outline']//parent::div[@class='jsx-1608262059 inner jsx-3727320559 jsx-2537838520 jsx-454447392 jsx-2014647566'])[1]")
	WebElement autoButton;
	
	public void clickAutoButton() throws InterruptedException {
		autoButton.click();
		Thread.sleep(7000);
	}
	
	
	@FindBy(xpath = "(//input[@class='jsx-3418619203 button']//following-sibling::div[@class='jsx-3418619203 outline']//parent::div[@class='jsx-1608262059 inner jsx-3727320559 jsx-2537838520 jsx-454447392 jsx-2014647566'])[2]")
	WebElement homeButton;
	
	public void clickhomeButton() throws InterruptedException {
		homeButton.click();
		Thread.sleep(7000);
	}
	
	@FindBy(xpath = "(//input[@class='jsx-3418619203 button']//following-sibling::div[@class='jsx-3418619203 outline']//parent::div[@class='jsx-1608262059 inner jsx-3727320559 jsx-2537838520 jsx-454447392 jsx-2014647566'])[3]")
	WebElement condoButton;
	
	public void clickCondoButton() throws InterruptedException {
		condoButton.click();
		Thread.sleep(7000);
	}

	@FindBy(xpath = "(//input[@class='jsx-3418619203 button']//following-sibling::div[@class='jsx-3418619203 outline']//parent::div[@class='jsx-1608262059 inner jsx-3727320559 jsx-2537838520 jsx-454447392 jsx-2014647566'])[4]")
	WebElement rentersButton;
	
	public void clickRentersButton() throws InterruptedException {
		rentersButton.click();
		Thread.sleep(7000);
	}
	@FindBy(xpath = "//span[text()='Log in']")
	WebElement loginButton;
	
	public void clickLoginButton() throws InterruptedException {
		loginButton.click();
		Thread.sleep(7000);
	}
}
