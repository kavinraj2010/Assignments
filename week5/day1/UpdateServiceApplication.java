package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UpdateServiceApplication extends  ServiceApplication{

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option=new ChromeOptions();
		ChromeDriver driver=new ChromeDriver(option);
		driver.get("https://dev98106.service-now.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//frame
		driver.switchTo().frame(0);
		
		//login
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("vOIqreWIwH47");
		driver.findElement(By.id("sysverb_login")).click();
		
		
		driver.findElement(By.xpath("(//div[@class='input-group-transparent'])[3]//input")).sendKeys("incident");
		driver.findElement(By.xpath("(//div[text()='Open'])[1]")).click();
		driver.switchTo().frame("gsft_main");
		
		WebElement element3 = driver.findElement(By.xpath("//select[@class='form-control default-focus-outline']"));
		Select click4=new Select(element3);
		click4.selectByVisibleText("Number");
		
		WebElement element = driver.findElement(By.xpath("(//input[@class='form-control'])[1]"));
		element.sendKeys("INC0010121",Keys.ENTER);
		
		WebElement element4 = driver.findElement(By.xpath("//select[@id='incident.contact_type']")); 
		 Select click1=new Select(element4);
		 click1.selectByVisibleText("Phone");
		 
		 WebElement element5 = driver.findElement(By.xpath("//select[@id='incident.state']"));
		 Select click5=new Select(element5); 
		 click5.selectByVisibleText("On Hold");
		 
		 WebElement element9 = driver.findElement(By.xpath("//select[@id='incident.hold_reason']"));
		 Select click9=new Select(element9);
		 click9.selectByVisibleText("Awaiting Problem");
		 
		 WebElement element6 = driver.findElement(By.xpath("//select[@id='incident.impact']")); 
		 Select click6=new Select(element6); 
		 click6.selectByVisibleText("2 - Medium");
		 
		 WebElement element7 = driver.findElement(By.xpath("//select[@id='incident.urgency']")); 
		 Select click7=new Select(element7);
		 click7.selectByVisibleText("1 - High");
		 
		driver.findElement(By.xpath("//td[@class='list_decoration_cell col-small col-center ']")).click();
		
		driver.findElement(By.xpath("//a[text()='Open Record']")).click();
		
		driver.findElement(By.id("incident.state")).click();
		
		WebElement element2 = driver.findElement(By.id("incident.state"));
		Select click2=new Select(element2);
		click2.selectByVisibleText("In Progress");
		
	}

}