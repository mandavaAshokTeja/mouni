package mouni;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class TFP {
	

	
	
public static 	WebDriver driver;
	@BeforeTest
	public void init()   {
		System.setProperty("webdriver.chrome.driver","F:\\javaselenium\\LiveTech Selenium Software\\Browsers\\New 95 chrome\\chromedriver.exe");
		 driver=new ChromeDriver();
		
		driver.get("https://tfptraining.net/");
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	//	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

	}

	
	@Test
	public void login() throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"ctl00_lblloginstatus\"]/a")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("ctl00_PageContent_txtUsername104")).sendKeys("pradeep");
		driver.findElement(By.id("ctl00_PageContent_txtPassword106")).sendKeys("123456");
		driver.findElement(By.id("ctl00_PageContent_btnSave")).click();
	}

	


	@Test
	public void logout() {
		
		driver.findElement(By.xpath("//*[@id=\"ctl00_divPrograms\"]/div[5]")).click();
		
	}

	@AfterTest
	public void quit() throws Throwable {
	
		Thread.sleep(3000);
	driver.close();
	
	}
}


