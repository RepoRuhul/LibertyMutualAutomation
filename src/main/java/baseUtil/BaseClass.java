package baseUtil;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pages.HomePage;

public class BaseClass {
	public ChromeDriver driver; // or we can use protected type
	public HomePage homePage; // or we can use protected type

	@BeforeMethod
	public void setUP() {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/driver/chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		// We can also use fullscreen() instead of maximize()
		// driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
		driver.get("https://www.libertymutual.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		homePage = new HomePage(driver);
	}

	@AfterMethod
	public void tearUp() {
		driver.quit();
	}

}