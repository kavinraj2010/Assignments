package week3.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykaa1 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		ChromeDriver driver=new ChromeDriver(options);
		options.addArguments("--disable-notifications");
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Actions build=new Actions(driver);
		WebElement brand = driver.findElement(By.xpath("//ul[@class='HeaderNav css-f7ogli']/li/a[text()='brands']"));
		build.moveToElement(brand).perform();
		
		driver.findElement(By.xpath("//div[@class='brandSearchMain']/input[@id='brandSearchBox']")).sendKeys("L'Oreal Paris");
		driver.findElement(By.xpath("//div[@id='scroller-container']//a[1]")).click();
		
		String title = driver.getTitle();
		if(title.contains("L'Oreal Paris"))
		{
			System.out.println("Testcase Pass, The Title is: "+title);
		}
		else
		{
			System.err.println("TestCase Fail");
		}
		
		driver.findElement(By.xpath("//div[@id='filter-sort']//button")).click();
		driver.findElement(By.xpath("//span[text()='customer top rated']/following::div")).click();
		driver.findElement(By.xpath("//div[@class='sidebar__inner']//span[text()='Category']")).click();
		driver.findElement(By.xpath("//span[text()='Category']/following::span[text()='Hair']")).click();
		driver.findElement(By.xpath("//span[text()='Category']/following::span[text()='Hair Care']")).click();
		driver.findElement(By.xpath("//span[text()='Category']/following::span[text()='Shampoo']")).click();
		driver.findElement(By.xpath("//span[text()='Concern']")).click();
		driver.findElement(By.xpath("//span[text()='Color Protection']")).click();
		String filter = driver.findElement(By.xpath("//span[@class='filter-value'][1]")).getText();
		if(filter.contains("Shampoo"))
		{
			System.out.println("The Filter Shampoo is selected");
		}
		else
		{
			System.err.println("Shampoo is not selected");
		}
		String img = driver.findElement(By.xpath("//div[@id='product-list-wrap']//following::img[1]")).getAttribute("href");
		driver.get(img);
		WebElement size = driver.findElement(By.xpath("//select[@title='SIZE']"));
		Select dropDown1=new Select(size);
		dropDown1.selectByVisibleText("175ml");
		
		String mrp = driver.findElement(By.xpath("//span[text()='MRP:']/span")).getText();
		System.out.println("MRP of the product: "+mrp);
		
		driver.findElement(By.xpath("//button/span[text()='ADD TO BAG']")).click();
		
		driver.findElement(By.xpath("//span[text()='Account']//following::button")).click();
		
		String grandTotal = driver.findElement(By.xpath("//span[text()='Grand Total']/following::div")).getText();
		System.out.println("The Grand Total Amount is : "+grandTotal);
		
		
	}
}
