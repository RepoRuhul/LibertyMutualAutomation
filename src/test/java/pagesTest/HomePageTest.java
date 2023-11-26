package pagesTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

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

	@Test(enabled = false)
	public void use_of_home_checkbox_isSelected_() {
		boolean homeCheckBoxSelected = driver.findElement(By.xpath(
				"(//input[@class='jsx-3418619203 button']//following-sibling::div[@class='jsx-3418619203 outline']//parent::div[@class='jsx-1608262059 inner jsx-3727320559 jsx-2537838520 jsx-454447392 jsx-2014647566'])[2]\""))
				.isSelected();
		System.out.println("is home check is selected?  Ans: " + homeCheckBoxSelected);

	}

	@Test(enabled = false)
	public void use_of_getTitle_method_in_home_page() {
		System.out.println("The Title of the page is: " + driver.getTitle());
	}

	// We used log in button
	@Test(enabled = false)
	public void use_of_getCurrentURL_method() throws InterruptedException {
		driver.findElement(By.cssSelector("span.jsx-2458328595.linkText")).click();
		Thread.sleep(4000);
		System.out.println("The current URL is: " + driver.getCurrentUrl());
		Thread.sleep(4000);
		System.out.println("The Title of the page is: " + driver.getTitle());
		Thread.sleep(4000);
	}

	@Test(enabled = false)
	public void use_of_getText_method_in_login_button() throws InterruptedException {
		driver.findElement(By.name("user-d")).isDisplayed();
		driver.findElement(By.name("user-d")).sendKeys("August 2023 QA Bootcamp");
		Thread.sleep(4000);
		driver.findElement(By.name("pass-d")).isDisplayed();
		driver.findElement(By.name("pass-d")).sendKeys("ABC@123");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//label[@id='cms-label-tc']")).isSelected();
		driver.findElement(By.xpath("//label[@id='cms-label-tc']")).click();
		Thread.sleep(4000);
		driver.findElement(By.name("Submit Login")).isEnabled();
		driver.findElement(By.name("Submit Login")).click();
		Thread.sleep(4000);
	}

	// Here We used User ID field
	// getAttribute() actually give the value of the Attribute, not common
	@Test(enabled = false)
	public void use_of_getAttribute_method() throws InterruptedException {
		driver.findElement(By.name("user-d")).isDisplayed();
		Thread.sleep(4000);
		String value02 = driver.findElement(By.cssSelector("span.jsx-2458328595.linkText")).getAttribute("class");
		System.out.println("The value of the class attribute is: " + value02);
	}

	// Using zipcode field
	// clear method is not working here. i do not know why?????
	@Test(enabled = false)
	public void use_of_sendKeys_method_then_clear() throws InterruptedException {
		driver.findElement(By.cssSelector("input#quote-zipCode-input")).isDisplayed();
		driver.findElement(By.cssSelector("input#quote-zipCode-input")).sendKeys("14215");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input#quote-zipCode-input")).clear();
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input#quote-zipCode-input")).sendKeys("14215");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input#quote-zipCode-input")).clear();
		Thread.sleep(4000);
	}

	// use of Keys.ENTER
	// Click on ZipCode field, then send a value inside "Zip code " field and click
	// by Enter key
	@Test(enabled = false)
	public void use_of_sendKeys_method_then_click_by_enter_key_of_the_zip_code_field() throws InterruptedException {
		driver.findElement(By.cssSelector("input#quote-zipCode-input")).click();
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input#quote-zipCode-input")).sendKeys("11101", Keys.ENTER);
		Thread.sleep(4000);
	}

	// use of Keys.RETURN
	// Click on ZipCode field, then send a value inside "Zip code " field and click
	@Test(enabled = false)
	public void use_of_sendKeys_method_then_click_by_return_key_of_the_zip_code_field() throws InterruptedException {
		driver.findElement(By.cssSelector("input#quote-zipCode-input")).click();
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input#quote-zipCode-input")).sendKeys("14215", Keys.RETURN);
		Thread.sleep(4000);
	}

	// use of navigate()
	@Test(enabled = false)
	public void use_of_navigate_method() throws InterruptedException {
		Thread.sleep(5000);
		driver.navigate().to(
				"https://login.libertymutual.com/login?state=hKFo2SAyQ1ZFRWJVbS1IYTU0aURmTHc2QlFpNVpmcUtTSTRhWKFupWxvZ2luo3RpZNkgYU5JWUw1ZzdFbXowOFpQMGI2S3BMMWxWalZFZDFSRHajY2lk2SBsUlR1YzlnYVFjY0ZHUDBCUjVxR3dlUDlBMGJuRThreQ&client=lRTuc9gaQccFGP0BR5qGweP9A0bnE8ky&protocol=oauth2&scope=openid%20profile%20email%20offline_access&ignoreCacheOnRefresh=true&refreshDurationOffset=180&enableAutomaticTokenRefresh=true&inactivityTimeoutDuration=1200&enableIdleTimeout=true&onRedirectCallback=function%20m(t)%7Bl.LoggerWithAdditionalMetadata.log(%22info%22%2Cf.Auth0HandleRedirectStart)%3Bvar%20e%3Dt%26%26t.params%7C%7C%7B%7D%2Cr%3D(e.code%2Ce.state%2Cy(e%2Cd))%2Co%3Dt.currentPath%26%26%22%22.concat(t.prefix%3Ft.prefix%3A%22%22).concat(t.currentPath)%3Breturn%20o%3F(l.LoggerWithAdditionalMetadata.log(%22info%22%2Cf.Auth0RedirectToTarget%2C%7BredirectPath%3Ao%2Cparams%3Ar%7D)%2Cv(o%2Ch(h(%7B%7D%2Cr%7C%7C%7B%7D)%2C%7B%7D%2C%7Bauth0%3A1%7D)))%3A(l.LoggerWithAdditionalMetadata.log(%22info%22%2Cf.Auth0RedirectToHomepage%2C%7Bparams%3Ar%7D)%2Cv(%22%2Faccount%2Fhome%22%2C%7Bauth0%3A1%7D))%7D&logger=function%20E(e)%7Bvar%20t%3De.message%2Cn%3D_(e%2Cs)%3Bc.LoggerWithAdditionalMetadata.log(%22info%22%2Cl(l(%7B%7D%2Ci.Auth0TokenManagerLog)%2C%7B%7D%2C%7Bmessage%3At%7D)%2Cn)%7D&redirect_uri=https%3A%2F%2Feservice.libertymutual.com%2Faccount%2Fhome&response_type=code&response_mode=query&nonce=cUdXRHpSc0JtQkd4Q2cxVUdfVnpHQ2Z6Vk9vbmE3OEJqUzdtakx6Yjc3Sg%3D%3D&code_challenge=2sjlS72hS_DTvyygqSqzn8epc96b--Cp81Vmd8lFar0&code_challenge_method=S256&auth0Client=eyJuYW1lIjoiIiwidmVyc2lvbiI6IiJ9");
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(4000);
		driver.navigate().forward();
		Thread.sleep(4000);
		driver.navigate().refresh();
		Thread.sleep(4000);
	}

	@Test(enabled = false)
	public void set_a_specific_size_for_window() throws InterruptedException {
		Thread.sleep(4000);
		// we will get the size of Liberty mutual insurance window
		System.out.println("the size of the maximize screen is : " + driver.manage().window().getSize());
		dimension = new org.openqa.selenium.Dimension(1000, 750);
		driver.manage().window().setSize(dimension);
		Thread.sleep(5000);
		System.out.println("the size of the my set screen is : " + driver.manage().window().getSize());

		// Extra related to this method, although you can skip
		Thread.sleep(4000);
		driver.navigate().to("https://www.bankofamerica.com/");
		Thread.sleep(4000);
		System.out.println("The size of the set screen is: " + driver.manage().window().getSize());
		driver.manage().window().maximize();
		Thread.sleep(5000);
		System.out.println("The size of the maximize screen is: " + driver.manage().window().getSize());
		Thread.sleep(5000);
		driver.manage().window().setSize(dimension); // just to show again the set size
		Thread.sleep(5000);
		System.out.println("The size of the set screen is: " + driver.manage().window().getSize());
		Thread.sleep(5000);
		driver.manage().window().fullscreen();
		Thread.sleep(5000);
		System.out.println("The size of the full screen is: " + driver.manage().window().getSize());
	}

	@Test(enabled = false)
	public void logoDisplayedTest01() {
		homePage.logoDisplayed(); // Actual Outcome by selenium
		Assert.assertTrue(true); // expected result
	}

	@Test(enabled = false)
	public void logoDisplayedTest02() {
		homePage.logoDisplayed(); // Actual Outcome by selenium
		Assert.assertTrue(false); // expected result
	}

	@Test(enabled = false)
	public void logoDisplayedTest03() {
		homePage.logoDisplayed(); // Actual Outcome by selenium
		Assert.assertTrue(true, "the application logo is not displayed");
	}

	@Test(enabled = false)
	public void logoDisplayedTest04() {
		homePage.logoDisplayed(); // Actual Outcome by selenium
		Assert.assertTrue(false, "the application logo is not displayed");
	}

	@Test(enabled = false)
	public void logoDisplayedTest05() {
		homePage.logoDisplayed(); // Actual Outcome by selenium
//		Assert.assertTrue(false, "the application logo is not displayed"); //expected result
		Assert.assertFalse(false, "the application logo is not displayed");
	}

	@Test(enabled = false)
	public void logoDisplayedTest06() {
		homePage.logoDisplayed(); // Actual Outcome by selenium
//		Assert.assertTrue(false, "the application logo is not displayed"); //expected result
		Assert.assertFalse(true, "the application logo is not displayed");
	}

	@Test(enabled = false)
	public void use_of_getTitle_method01() throws InterruptedException {
		String actual = driver.getTitle();
		Thread.sleep(5000);
		System.out.println("The title of the Page is: " + actual);
	}

	// hard assert and it is pass
	@Test(enabled = false)
	public void use_of_getTitle_method_in_home_page_with_assertion01() throws InterruptedException {

		String actual = driver.getTitle();
		System.out.println("The Title of the page is: " + actual);
		Thread.sleep(5000);

		String expected = "Liberty Mutual: A trusted insurance company for over 100 years";
		Assert.assertEquals(actual, expected, "home page title doesn't match");
		String currentURL = driver.getCurrentUrl();
		System.out.println("the current url is: " + currentURL);

	}

	// hard assert and it is fail
	@Test(enabled = false)
	public void use_of_getTitle_method_in_home_page_with_assertion02() throws InterruptedException {
		String actual = driver.getTitle();
		System.out.println("The Title of the page is: " + actual);
		Thread.sleep(5000);
		String expected = "Liberty Mutual: A trusted insurance company for over 100 years              ";
		Assert.assertEquals(actual, expected, "home page title doesn't match");
		// hard assert will not execute the next steps
		String currentURL = driver.getCurrentUrl();
		System.out.println("the current url is: " + currentURL);

	}

	// soft assert and it is pass
	@Test(enabled = false)
	public void use_of_getTitle_method_in_home_page_with_assertion03() throws InterruptedException {
		String actual = driver.getTitle();
		System.out.println("The Title of the page is: " + actual);
		Thread.sleep(5000);
		String expected = "Liberty Mutual: A trusted insurance company for over 100 years              ";

		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(actual, expected, "home page title doesn't match");
		// soft assertion will execute the next steps
		String currentURL = driver.getCurrentUrl();
		System.out.println("the current url is: " + currentURL);

	}

	@Test(enabled = false)
	public void use_of_mouse_hoverAction_on_providers() throws InterruptedException {
		Thread.sleep(4000);
		driver.navigate().to("https://www.fideliscare.org/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement providers = driver.findElement(By.xpath("//span[contains(text(), 'Providers')]"));
		Thread.sleep(4000);
		// Actions actions = new Actions(driver);
		actions.moveToElement(providers).build().perform();
		Thread.sleep(6000);

	}

	// Regular click method
	@Test(enabled = false)
	public void use_of_click_method_in_loginButtonTest() throws InterruptedException {
		driver.findElement(By.cssSelector("span.jsx-2458328595.linkText")).click();
		Thread.sleep(3000);
	}

	// alternate of click method
	@Test(enabled = false)
	public void alternate_of_click_method_of_log_in_button_test() throws InterruptedException {
		driver.findElement(By.cssSelector("span.jsx-2458328595.linkText")).click();
		Thread.sleep(4000);

	}

	// alternate of click()
	@Test(enabled = false)
	public void alternate_of_click_method_in_loginButtonTest01() throws InterruptedException {
		driver.findElement(By.cssSelector("span.jsx-2458328595.linkText")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
	}

	// alternate of click()
	@Test(enabled = false)
	public void alternate_of_click_method_in_loginButtonTest02() throws InterruptedException {
		driver.findElement(By.cssSelector("span.jsx-2458328595.linkText")).sendKeys(Keys.RETURN);
		Thread.sleep(3000);
	}

	// alternate of click()
	@Test(enabled = false)
	public void alternate_of_click_method_in_loginButtonTest03() throws InterruptedException {
		WebElement loginbutton = driver.findElement(By.xpath("//span[contains(text(),'Log in')]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", loginbutton);
		Thread.sleep(4000);

	}

	// login process regular to compare with line 579
	@Test(enabled = false)
	public void use_of_sendKeys_method_then_click() throws InterruptedException {
		driver.findElement(By.xpath("//input[@class='lm-Field-input']")).sendKeys("14215");
		Thread.sleep(4000);
		driver.findElement(By.xpath(
				"(//input[@class='jsx-3418619203 button']//following-sibling::div[@class='jsx-3418619203 outline']//parent::div[@class='jsx-1608262059 inner jsx-3727320559 jsx-2537838520 jsx-454447392 jsx-2014647566'])[1]"))
				.click();
		Thread.sleep(4000);
	}

	// alternative of sendKeys(), please remember
	@Test(enabled = true)
	public void use_of_sendKeys_method_by_javascriptExecutor_then_click() throws InterruptedException {
		WebElement zipcode = driver.findElement(By.xpath("//input[@class='lm-Field-input']"));
		WebElement getMyPrice = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		// how to send text inside a field by JavascriptExecutor, alternate of
		// sendKeys()
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value = '14215' ", zipcode);
		Thread.sleep(4000);
		js.executeScript("arguments[0].click()", getMyPrice);
		Thread.sleep(4000);

	}

}
