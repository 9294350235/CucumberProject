package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	
	//static WebDriver driver;
	
	public static void main(String[] args) {
		
		System.setProperty("webDriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver(); 
		driver.navigate().to("https://automationexercise.com/");
		driver.manage().window().maximize();
	
		driver.findElement( By.name("class")).sendKeys("col-sm-1");
		driver.findElement(By.xpath("//input[@data-qa='password']"));
		driver.findElement(By.xpath("(//button[@type='submit'])"));
		//driver.close();
		driver.quit();
		
		
		
	}
	
	
	
	
	
}
