package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest1 {
	WebDriver driver;
	  @Test
	  public void test() throws InterruptedException {
		  driver.findElement(By.xpath("//*[@name='uname']")).sendKeys("admin");
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//*[@name='psw']")).sendKeys("pass");
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//*[@type='submit']")).click();
		  Thread.sleep(5000);
	  }
	  @BeforeTest
	  public void beforeTest() throws InterruptedException {
		  System.setProperty("webdriver.gecko.driver","C:\\Test\\geckodriver.exe");
		  driver=new FirefoxDriver();
		  driver.get("http://ec2-18-188-209-6.us-east-2.compute.amazonaws.com:8090/TestWebapp/");
		  Thread.sleep(5000);
	  }

	  @AfterTest
	  public void afterTest() {
		 // driver.close();
		 System.out.println("Running");
	  }
}
