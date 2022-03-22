package week5.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateIncident {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		
		driver.get("https://dev120322.service-now.com/login.do?user_name=admin&sys_action=sysverb_login&user_password=UnRyL3VksBl0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//login
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("Kavinraj@201014");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		
		Thread.sleep(3000);
		WebElement findElement = driver.findElement(By.id("filter"));
		findElement.sendKeys("incident");
		
		Thread.sleep(3000);
		findElement.sendKeys(Keys.ENTER);
		
		//frame
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//button[text()='New']")).click();
		driver.findElement(By.xpath("(//input[@class='form-control'])[4]")).sendKeys("Developer");
		
		//get incident number
		WebElement findElement2 = driver.findElement(By.xpath("(//input[@class='form-control'])[1]"));
		String string = findElement2.getAttribute("value");
		System.out.println(string);
		
		//click submit
		driver.findElement(By.xpath("(//button[text()='Submit'])[1]")).click();
		driver.switchTo().defaultContent();
		
		//frame
		driver.switchTo().frame(0);
		
        WebElement ele=driver.findElement(By.xpath("(//input[@class='form-control'])[1]"));
        ele.sendKeys(string);
        ele.sendKeys(Keys.ENTER);
		
		//verify instance created or not
        WebElement findElement3 = driver.findElement(By.xpath("//td[@class='vt']//a"));
        String text = findElement3.getText();
        System.out.println(text);
        
        driver.switchTo().defaultContent();
		
        if(string.equals(text)) 
		{
			System.out.println("instance created");
			Thread.sleep(2000);
			driver.close();
		}
		
		else
		{
			System.out.println("instance not created");
		}
			
	}

}
