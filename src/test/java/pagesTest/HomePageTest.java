package pagesTest;

import javax.xml.xpath.XPath;

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
	@Test(enabled = false)
	public void use_of_partial_linkText_as_locator_in_homeowner_insurance() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("Homeowners Insuranc")).click();
		Thread.sleep(5000);

	}

	// use of css selector by id
	@Test(enabled = false)
	public void use_of_css_selector_by_id_in_zipcode_field_button() {
		driver.findElement(By.cssSelector("input#quote-zipCode-input")).click();

	}

	// use of css selector by class
	@Test(enabled = false)
	public void use_of_css_selector_by_class_in_log_in_button_() {
		driver.findElement(By.cssSelector("span.jsx-2458328595.linkText")).click();

	}

	// use of css selector by compound class
	@Test(enabled = false)
	public void use_of_css_selector_by_compound_class_in_search_field_button() {
		driver.findElement(By.cssSelector("span.jsx-2458328595.linkText")).click();
	}

	@Test(enabled = false)
	public void use_of_isdiplayed_in_search_field_button_() {
		boolean elementDisplayed = driver.findElement(By.cssSelector("span.jsx-2458328595.linkText")).isDisplayed();

		System.out.println("is the search field displayed? Ans: " + elementDisplayed);
	}

	@Test(enabled = false)
	public void use_of_isdiplayed_in_log_in_button_() {
		boolean loginButtonEnabled = driver.findElement(By.cssSelector("span.jsx-2458328595.linkText")).isEnabled();
		System.out.println("is the login button enabled? Ans: " + loginButtonEnabled);
	}

	@Test(enabled = true)
	public void use_of_home_checkbox_isSelected_() {
		boolean homeCheckBoxSelected = driver.findElement(By.xpath(
				"(//input[@class='jsx-3418619203 button']//following-sibling::div[@class='jsx-3418619203 outline']//parent::div[@class='jsx-1608262059 inner jsx-3727320559 jsx-2537838520 jsx-454447392 jsx-2014647566'])[2]\""))
				.isSelected();
		System.out.println("is home check is selected?  Ans: " + homeCheckBoxSelected);

	}
}
