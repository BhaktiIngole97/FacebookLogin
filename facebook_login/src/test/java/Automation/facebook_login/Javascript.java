package Automation.facebook_login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Javascript {
	
		public static WebDriver driver;
		@Test
		
		public void javascript_exe() {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
		}
			
		
		public void javascriptexe () throws InterruptedException {
			
			driver.get("file:///C:/Users/Dell/eclipse-workspace/facebook_login/JavascriptExecutor/javascript.html");
			ChromeDriver js =  (ChromeDriver) driver;
			Thread.sleep(2000);
			
			js.executeScript("document.getElementById('t1').value='bhakti'");
			Thread.sleep(2000);
			
			js.executeScript("document.getElementById('t2').value=''");
			Thread.sleep(2000);
			
			js.executeScript("document.getElementById('t2').value='manager'");
			Thread.sleep(2000);
			
			js.executeScript("document.getElementById('t2').type='button'");
			Thread.sleep(2000);
			
		}}





			
			
			
					 
		
		
	



