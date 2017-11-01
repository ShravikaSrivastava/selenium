package asert;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Ast {

	    public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","E:\\selenium-java-3.5.3\\geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.navigate().to("http://www.facebook.com");
		 WebElement text=driver.findElement(By.xpath(".//*[@id='login_form']/table/tbody/tr[1]/td[2]/label"));
		 System.out.println(text.getText());
	     Assert.assertEquals("Password", (text.getText()));
	     System.out.println("Assertion Done ! !");
	}

}
