package Automation.facebook_login;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class javascript_popup {
	public WebDriver driver;
	public void Hidden_popup() {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}
	
	@Test
	    public void alert() {
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.findElement(By.id("alertbutton")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
	}
	
	@Test
	public void prompt_popup() {
	driver.get("https://demoqa.com/alerts");
	driver.manage().window().maximize();
	JavascriptExecutor js =(JavascriptExecutor)driver;
	driver.findElement(By.xpath("//button[@id='promptbutton']")).click();
	Alert alert = driver.switchTo().alert();
	System.out.println(alert.getText());
	alert.sendKeys("Bhakti");
	alert.accept();
	}
	
	@Test
	public void alert_box() {
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	Alert alert = driver.switchTo().alert();
	driver.findElement(By.name("alertbox")).click();
	System.out.println(alert.getText());
	alert.accept();
	}
	
	
	@Test
	public void confirm_box() {
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	Alert alert = driver.switchTo().alert();
	driver.findElement(By.name("confirm alertbox")).click();
	System.out.println(alert.getText());
	alert.accept();
	}
	
	@Test
	public void simple_alert() {
	driver.get("https://demoqa.com/alerts");
	driver.manage().window().maximize();
	driver.findElement(By.id("alert button")).click();
	Alert alert = driver.switchTo().alert();
	System.out.println(alert.getText());
	alert.dismiss();
	}
	
	@Test
	public void confirm_popup() {
	driver.get("https://demoqa.com/alerts");
	driver.manage().window().maximize();
	driver.findElement(By.id("confirm button")).click();
	Alert alert = driver.switchTo().alert();
	System.out.println(alert.getText());
	alert.dismiss();
	
	
	
	
	
	
	
		
	}
	
	
	

}
