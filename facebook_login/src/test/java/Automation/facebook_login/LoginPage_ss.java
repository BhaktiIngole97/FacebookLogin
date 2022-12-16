package Automation.facebook_login;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPage_ss {

		public WebDriver driver;
		@BeforeMethod
		public void loginPage() {
			//System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
		}

		@Test
		public void take_screenshot() throws InterruptedException, IOException {
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement mobilenum = driver.findElement(By.xpath("//input[@id='email']"));
		mobilenum.sendKeys("12345667892");
		WebElement password = driver.findElement(By.cssSelector("#Pass"));
		password.sendKeys("bhakti234");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File SrcFile = ts.getScreenshotAs(OutputType.FILE);
		File DownldFile = new File(".\\Facebook_Screenshot\\"+"Facebook1.png");
		FileHandler.copy(SrcFile,DownldFile);
		driver.close();
		}
		
}

		
		
		
		
		
