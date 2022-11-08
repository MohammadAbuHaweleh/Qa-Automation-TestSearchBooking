package Keys;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\MY LAPTOP\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// driver.get("http://127.0.0.1:5500/index.html");

		// driver.findElement(By.id("myselect")).click();
		// Keys theKeys = Keys.ARROW_DOWN;  ma ra7 yokhod + lenoh atha bde ab3at akther mn sahem ma ra7 yozpot

		// driver.findElement(By.id("myselect")).sendKeys(theKeys);
		// driver.findElement(By.id("myselect")).sendKeys("c"+Keys.ENTER);
		//*****************************************************************************
		driver.get("https://www.booking.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"ss\"]")).click();
		Thread.sleep(3000);
		Keys theKeys = Keys.ARROW_DOWN;
		driver.findElement(By.xpath("//*[@id=\"ss\"]")).sendKeys("amman");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"ss\"]")).sendKeys(theKeys);
		

	}

}
