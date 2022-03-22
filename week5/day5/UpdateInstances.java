package week5.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UpdateInstances {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		
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
		
		//Search for the existing incident and click on the incident
		driver.switchTo().frame(0);
		Thread.sleep(3000);
		 WebElement findElement2 = driver.findElement(By.xpath("(//input[@class='form-control'])[1]"));
		 findElement2.sendKeys("INC0010003");
		 findElement2.sendKeys(Keys.ENTER);
		 driver.switchTo().defaultContent();
		 
		 driver.switchTo().frame(0);
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[text()='INC0010003']")).click();
		 driver.switchTo().defaultContent();
		 
		 //Update the incidents with Urgency as High and State as In Progress
		 driver.switchTo().frame(0);
		 WebElement findElement3 = driver.findElement(By.xpath("//select [@id='incident.urgency']"));
		 Select se = new Select(findElement3);
		 se.selectByIndex(0);
		 driver.switchTo().defaultContent();
		 
		 driver.switchTo().frame(0);
		 WebElement findElement4 = driver.findElement(By.xpath("//select[@id='incident.state']"));
		 Select se2 = new Select(findElement4);
		 se2.selectByIndex(1);
		 driver.switchTo().defaultContent();
		 
		 driver.switchTo().frame(0);
		 driver.findElement(By.xpath("//button[@id='sysverb_update_bottom']")).click();
		 driver.switchTo().defaultContent();
		 
		 //Verify the priority and state 
		 driver.switchTo().frame(0);
		 driver.findElement(By.xpath("//a[text()='INC0010003']")).click();
		 driver.switchTo().defaultContent();
		 
		 driver.switchTo().frame(0);
		 WebElement findElement5 = driver.findElement(By.xpath("//option[text()='1 - High']"));
		 String attribute = findElement5.getAttribute("value");
		 System.out.println(attribute);
		 driver.switchTo().defaultContent();
		
		 if(attribute.equals("1")) 
		 {
			 System.out.println("priority verified");
		 }
		 else
		 {
			 System.out.println("not verified");
		 }
				 
		 driver.switchTo().frame(0);
		 WebElement findElement6 = driver.findElement(By.xpath("//option[text()='In Progress']"));
		 String text = findElement6.getText();
		 System.out.println(text);
		 driver.switchTo().defaultContent();
		
		 if(text.equals("In Progress"))
		 {
			 System.out.println("state verified");
			 driver.close();
		 }
		 else 
		 {
			 System.out.println("not verified");
		 }
	
	}
}
