import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTest {
public static void main(String[] args) throws InterruptedException {
		
		// To open chrome browser and Navigate to Url
	    System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(" http://automationpractice.com");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		// To Perform a Login Function
		driver.findElement(By.className("login")).click();
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 400);");
		
		driver.findElement(By.id("email")).sendKeys("deokarshubham123@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("SHUBHAM");
		driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();
		
        //  To perform Mouse hover operation 
		WebElement element=driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a"));
		Actions action=new Actions(driver);
		action.moveToElement(element).perform();
		Thread.sleep(1000);
		
		// To click on T-shirt button
		driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a")).click();
		Thread.sleep(1000);
		
		// Mouse hover operation towards second product
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("scroll(0, 700);");
		
		WebElement element1=driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img"));
		action.moveToElement(element1).perform();
		
		// To click on "More" button
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[2]/span")).click();
		Thread.sleep(2000);
		
		js.executeScript("scroll(0, 400);");
		Thread.sleep(2000);
		
		// To increase quantity, size, selection of colour
		driver.findElement(By.xpath("//*[@id=\"quantity_wanted_p\"]/a[2]/span")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"group_1\"]/option[3]")).click();
		driver.findElement(By.name("Blue")).click();
		
		// To click on Add To Cart
		driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span")).click();
		Thread.sleep(1000);
		
		WebElement element2= driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]"));
		action.moveToElement(element2).perform();
		
		driver.findElement(By.cssSelector("#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a > span")).click();
		
		
		
	}

}



