package ass4ApplyingPrecedingaxesmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChromWebDriverFollowingMethod {
	public WebDriver driver;

	/**
	 * Set up browser settings and open the application
	 */

	@BeforeTest
	public void setUp() {
		// the path for open WebSite
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lo0ol\\" + "Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		// Navigate to a WebSite
		driver.navigate().to("https://itmeo.com/");

		// Maximize current window
		driver.manage().window().maximize();

	}

	/**
	 * Test using 'preceding' axes method, Type of XPath
	 * 
	 * @throws InterruptedException
	 */
	@Test
	public void LearnEnglishWebSite() throws InterruptedException {

		// ex1 ------- 'preceding' axes method
		WebElement textMethod1 = driver.findElement(By.xpath("//a//preceding::a[text()='Landing Pages']"));
		textMethod1.getLocation();
		System.out.println("ex1 DONE Successfully the location of WebElement is =" + textMethod1.getLocation());

		// ex2 ------- 'preceding' axes method with contains() method
		WebElement textMethod2 = driver.findElement(By.xpath("//a//preceding::a[contains(text(),'Templates')]"));
		textMethod2.getLocation();
		System.out.println("ex2 DONE Successfully the location of WebElement is =" + textMethod2.getLocation());

		// ex3 ------- 'preceding' axes method with AND operation
		WebElement textMethod3 = driver.findElement(
				By.xpath("//input[@class='search-form__input']//preceding::img[@class='logo__img' and @alt='itmeo']"));
		System.out.println("ex3 DONE Successfully the location of WebElement is =" + textMethod3.getLocation());

		// ex4 ------- 'preceding' axes method with OR operation
		WebElement textMethod4 = driver.findElement(By.xpath(
				"//button//preceding::input[@placeholder='Your email address' or @class='footer-subscribe-form__input']"));
		textMethod4.getLocation();
		System.out.println("ex4 DONE Successfully the location of WebElement is =" + textMethod4.getLocation());
	}

	/**
	 * Tear down the setup after test completes
	 */
	@AfterTest
	public void terminateBrowser() {
		// Close the browser
		driver.quit();
	}
}
