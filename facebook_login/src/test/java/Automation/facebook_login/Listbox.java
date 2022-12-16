package Automation.facebook_login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Listbox {
	public static WebDriver driver;
	@Test
	
	public void baseClass() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
	
	driver.get("file:///C:/Users/Dell/eclipse-workspace/facebook_login/Listbox/Listbox_breakfast.html");
	WebElement list = driver.findElement(By.id("mtr"));
	Select s = new Select(list);
	List<WebElement> options = s.getOptions();
	int size = options.size();
	System.out.println("Number of elements present inside the listbox is : "+ size);
	for (WebElement webElement : options) {
		String text = webElement.getText();
		System.out.println(text);
		
		s.selectByIndex(0);
		s.selectByValue("v");
		s.selectByVisibleText("Poori");
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		int size2 = allSelectedOptions.size();
		System.out.println("Number of items that is selected in the list box is : "+size2);
		for (WebElement webEle : allSelectedOptions) {
			System.out.println(webElement.getText());
			boolean multiple = s.isMultiple();
			System.out.println(multiple +" yes , it is multi select");
			if (multiple) {
				WebElement firstSelectedOption = s.getFirstSelectedOption();
				System.out.println(firstSelectedOption.getText()+"is the first selected item in the list box");
				WebElement firstSelectedOption1 = s.getFirstSelectedOption();
				System.out.println(firstSelectedOption1.getText()+" is the first selected item");
				s.deselectByValue("v");
				WebElement firstSelectedOption2 = s.getFirstSelectedOption();
				System.out.println(firstSelectedOption2.getText()+" is the first selected item");
				s.deselectByVisibleText("Poori");
			}
		}
	}
	      
			
		
	

}
