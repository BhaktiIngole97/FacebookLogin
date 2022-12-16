package Automation.facebook_login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class frames {
	
		public static WebDriver driver;
		@Test
		
		public void frame() {
		
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		public static void main(String[] args)throws InterruptedException {
			
		
		driver.get("file:///C:/Users/Dell/eclipse-workspace/facebook_login/Frames/frames.html");
		
		//using index of the frame - [ int value] [ index of frames starts with zero]
		driver.switchTo().frame(0);

        driver.findElement(By.id("t1")).sendKeys("bhakti");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t2")).sendKeys("02");
		Thread.sleep(2000);
		//driver.close();
		
		}
		
		{
		//using id attribute of the frame -string
		
		driver.switchTo().frame("f1");
		
		driver.findElement(By.id("t1")).sendKeys("email");
		
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.id("t2")).sendKeys("ingolebhakti@gmail.com");
		

		//using name attribute of the frame -string
		driver.switchTo().frame("n1");
		
		driver.findElement(By.id("t1")).sendKeys("phone number");
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.id("t2")).sendKeys("12345567894");
		
		//using address of the frame -webelement
		
		WebElement f = driver.findElement(By.className("c1"));
		driver.switchTo().frame(f);
		
		driver.findElement(By.id("t1")).sendKeys("d");
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.id("t2")).sendKeys("d");
		driver.close();
		
		}
}
		
		


