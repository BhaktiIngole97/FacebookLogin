package Automation.facebook_login;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Pop_up {
public WebDriver driver;
public void Hidden_popup() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
	}
      @Test
     
      public void hidden_popup() throws InterruptedException {
      driver.get("https://www.irctc.co.in/nget/train-search");	
      driver.manage().window().maximize();
      driver.findElement(By.xpath("(//input[@placeholder='Date Of Birth']")).click();
      Thread.sleep(3000);
      driver.findElement(By.linkText("26")).click();
      }
      
      @Test
      public void hiddenpopup() throws InterruptedException {
          driver.get("https://www.irctc.co.in/nget/train-search");	
          driver.manage().window().maximize();
          driver.findElement(By.xpath("(//input[@autocomplete='off']")).click();
          Thread.sleep(3000);
          driver.findElement(By.linkText("Nagpur")).click();
          }
      
      @Test
      public void popup() throws InterruptedException {
          driver.get("https://www.irctc.co.in/nget/train-search");	
          driver.manage().window().maximize();
          driver.findElement(By.xpath("(//input[@aria-autocomplete='list']")).click();
          Thread.sleep(3000);
          driver.findElement(By.linkText("Pune")).click();
          }
          
}
      	  
      
      
