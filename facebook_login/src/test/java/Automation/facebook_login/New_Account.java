package Automation.facebook_login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class New_Account {
	
	public WebDriver driver;
		@Test
		public void create_newaccount() {
			//System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
			WebElement newaccount = driver.findElement(By.id("Create New Account"));
			newaccount.click();
			
			 WebElement fname = driver.findElement(By.name("firstname"));
			fname.sendKeys("Bhakti");
			
			WebElement lastname = driver.findElement(By.name("lastname"));
			lastname.sendKeys("Ingole");
			
			WebElement Date=driver.findElement(By.id("day"));
			Date.sendKeys("26");
			WebElement month=driver.findElement(By.name("birthday_month"));
			month.sendKeys("may");
			WebElement year=driver.findElement(By.name("birthday_year"));
			year.sendKeys("1997");
			
			WebElement gender=driver.findElement(By.xpath("//input[@name='sex']"));
			gender.click();
			
			WebElement signupbutton=driver.findElement(By.xpath("//input[@name='websubmit']"));
			signupbutton.click();
			
			
		}	
}	
			
			
			
			

