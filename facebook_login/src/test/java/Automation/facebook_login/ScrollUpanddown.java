package Automation.facebook_login;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollUpanddown {
	public  WebDriver driver;
	@Test
	public void Scroll_up() {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	public void ScrollUp() throws InterruptedException {

	driver.get("https://www.facebook.com/");
	
	ChromeDriver js =  (ChromeDriver) driver;
	for (int i = 1; i < 10; i++) {
		
		//scroll down on the webpage
		
        js.executeScript("window.scrollBy(0, 1000)");
		Thread.sleep(3000);
	}
	
	for (int i = 1; i < 10; i++) {
		
		//scroll up on the webpage
		
		js.executeScript("window.scrollBy(0, -1000)");
		Thread.sleep(3000);
		}
	}
		
		
	@Test

    public void Scrolldown() throws InterruptedException {

	driver.get("https://www.facebook.com/");
	
	ChromeDriver js =  (ChromeDriver) driver;
	
	driver.findElement(By.id("close")).click();
	
	WebElement element = driver.findElement(By.xpath("//img[contains(@src,'facebook')]"));
	
	int x = element.getLocation().getX();
	
	int y = element.getLocation().getY();
	
	ChromeDriver javascript = (ChromeDriver) driver;
	
	javascript.executeScript("window.scrollBy("+x+", "+y+")");
	Thread.sleep(3000);
	}
}


	
	
	

	


