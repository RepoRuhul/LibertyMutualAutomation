package baseUtil;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePage;

public class BaseClass {
	public WebDriver driver; // or we can use protected type
	// public ChromeDriver driver; // or we can use protected type
	// public FirefoxDriver driver; // or we can use protected type
	// public EdgeDriver driver; // or we can use protected type

	public HomePage homePage; // or we can use protected type

	@BeforeMethod
	public void setUP() {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();

		/*
		 * // For Firefox driver System.setProperty("webdriver.gecko.driver",
		 * "./driver/geckodriver.exe"); driver = new FirefoxDriver();
		 */

		/*
		 * // For edge Driver System.setProperty("webdriver.edge.driver",
		 * "./driver/msedgedriver.exe"); driver = new EdgeDriver();
		 */

		/*
		 * //WebDriverManager for chromedriver WebDriverManager.chromedriver().setup();
		 * driver = new ChromeDriver();
		 */

		/*
		 * // WebDriverManager for firefoxdriver
		 * WebDriverManager.firefoxdriver().setup(); driver = new FirefoxDriver();
		 */

		/*
		 * //WebDriverManager for edgedriver WebDriverManager.edgedriver().setup();
		 * driver = new EdgeDriver();
		 */

		driver.manage().window().maximize();
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