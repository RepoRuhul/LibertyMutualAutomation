package pagesTest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class HomePageTest extends BaseClass {
	@Test(enabled = false, priority = 01)
	public void autoButton() throws InterruptedException {
		homePage.clickAutoButton();
	}

	@Test(enabled = false, priority = 02)
	public void homeButtonTest() throws InterruptedException {
		homePage.clickhomeButton();
	}

	@Test(enabled = false, priority = 03)
	public void condoButton() throws InterruptedException {
		homePage.clickCondoButton();
	}

	@Test(enabled = false, priority = 04)
	public void rentersButton() throws InterruptedException {
		homePage.clickRentersButton();
	}

	@Test(enabled = false, priority = 05)
	public void LoginButtonTest() throws InterruptedException {
		homePage.clickLoginButton();
	}

	@Test(enabled = false, priority = 06)
	public void inputTextInZipCodeFieldTest() throws InterruptedException {
		homePage.inputTextInZipCodeField();
	}

	@Test(enabled = false, priority = 07)
	public void clickLogoTest() throws InterruptedException {
		homePage.clickLogo();
	}

	@Test(enabled = false)
	public void inputTextInZipeCodeFieldThenClickGetMyPriceButtonTest() throws InterruptedException {
		homePage.inputTextInZipeCodeFieldThenClickGetMyPriceButton();
	}

	// xpath as a locator:
	@Test(enabled = false)
	public void use_of_xpath_as_locator_in_auto_button() throws InterruptedException {
		driver.findElement(By.xpath(
				"(//input[@class='jsx-3418619203 button']//following-sibling::div[@class='jsx-3418619203 outline']//parent::div[@class='jsx-1608262059 inner jsx-3727320559 jsx-2537838520 jsx-454447392 jsx-2014647566'])[1]"))
				.click();
		Thread.sleep(4000);
	}

	// use of linkText as locator
	@Test(enabled = false)
	public void use_of_linkText_as_locator_in_homeowner_insurance() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.linkText("Homeowners Insurance")).click();
		Thread.sleep(5000);

	}

	// use of linkText as locator
	@Test(enabled = true)
	public void use_of_partial_linkText_as_locator_in_homeowner_insurance() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("Homeowners Insuranc")).click();
		Thread.sleep(5000);

	}

}
