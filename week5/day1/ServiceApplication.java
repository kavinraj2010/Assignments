package week5.day1;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ServiceApplication {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://dev98106.service-now.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//frame
		driver.switchTo().frame(0);
		
		//login
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("vOIqreWIwH47");
		driver.findElement(By.id("sysverb_login")).click();

		//filter
		driver.findElement(By.xpath("(//div[@class='input-group-transparent'])[3]//input")).sendKeys("incident");
		WebElement element = driver.findElement(By.xpath("(//span[text()='Incident'])[1]"));

		//Mouse over action
		Actions click = new Actions(driver);
		click.moveToElement(element).build().perform();
		driver.findElement(By.xpath("(//div[text()='Create New'])[1]")).click();

		//frame
		driver.switchTo().frame("gsft_main");
		
		//get number
		String text = driver.findElement(By.xpath("//div//input[@aria-label='Number']")).getAttribute("value");
		System.out.println("The number is : " + text);
		 
		 driver.findElement(By.xpath("(//div[@class='input-group ref-container'])[1]//input")).click();
		 driver.findElement(By.xpath("(//div[@class='input-group ref-container'])[1]//input")).sendKeys("Abraham Lincoln"); 
		  
		 WebElement element2 =driver.findElement(By.xpath("//select[@id='incident.category']")); 
		 Select click2=new Select(element2);
		 click2.selectByVisibleText("Hardware");
		 
		 WebElement element3 = driver.findElement(By.xpath("//select[@id='incident.subcategory']")); 
		 Select click3=new Select(element3);
		 click3.selectByVisibleText("Email");
		 
		 driver.findElement(By.xpath("(//div[@class='input-group ref-container'])[2]//input")).sendKeys("IRC"); 
		 
		 
		 WebElement element8 = driver.findElement(By.xpath("//select[@id='incident.subcategory']"));
		 Select click8=new Select(element8); 
		 click8.selectByVisibleText("CPU");
		 
		 driver.findElement(By.id("incident.short_description")).sendKeys("Hello it is a create lead function");
		 
		 driver.findElement(By.id("incident.description")).sendKeys("Hello Satrans boys");
		  
		 driver.findElement(By.id("sysverb_insert")).click();
		  
		 WebElement findElement = driver.findElement(By.xpath("(//label[text()='Search']/following::input)[1]"));
		 findElement.sendKeys(text);
		 findElement.sendKeys(Keys.ENTER);
		  
		 String text2 = driver.findElement(By.xpath("//tbody[@class='list2_body']/tr/td[3]")).getText();
		  
		 if(text.equals(text2))
		 {
			 System.out.println("Testcase Pass the number is :"+text2);
		 }
		 else
		 {
			 System.err.println("testcase fail");
		 }
		 
	}

}