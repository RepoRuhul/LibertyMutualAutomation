package pagesTest;

import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class HomePageTest extends BaseClass {
	@Test(enabled = true, priority = 01)
	public void autoButton() throws InterruptedException {
		homePage.clickAutoButton();
	}

	@Test(enabled = true, priority = 02)
	public void homeButtonTest() throws InterruptedException {
		homePage.clickhomeButton();
	}

	@Test(enabled = true, priority = 03)
	public void condoButton() throws InterruptedException {
		homePage.clickCondoButton();
	}

	@Test(enabled = true, priority = 04)
	public void rentersButton() throws InterruptedException {
		homePage.clickRentersButton();
	}

	@Test(enabled = true, priority = 05)
	public void LoginButtonTest() throws InterruptedException {
		homePage.clickLoginButton();
	}
}
