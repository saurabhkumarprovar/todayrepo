package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="Amazonpage"                                
     , summary=""
     , relativeUrl=""
     , connection="Amazon_connection"
     )             
public class Amazonpage {
public WebDriver driver;
public Amazonpage(WebDriver driver)
{
this.driver = driver;
	}	
	public void enterData(String enterstr)
	{
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(enterstr);
	}	
}
