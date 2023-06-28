
//package nextGeneration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class NG {
	public WebDriver driver1;
	public WebDriver driver2;
	public WebDriver driver3;
	
	
	@BeforeTest
	
	public void login() {
		WebDriverManager.chromedriver().setup();
		//WebDriverManager.edgedriver().setup();
		//WebDriverManager.firefoxdriver().setup();
		
		driver1 = new ChromeDriver();
		//driver2 = new EdgeDriver();
		//driver3 = new FirefoxDriver();
		
		driver1.get("https://www.github.com/");
		driver1.findElement(By.xpath(null)).sendKeys("");//USERNAME
		driver1.findElement(By.xpath(null)).sendKeys("");//PASSWORD
		driver1.findElement(By.xpath(null)).click();
		
	}
		@Test
		 public void j () {
			System.out.println("k");
			
		}

	
	


}
