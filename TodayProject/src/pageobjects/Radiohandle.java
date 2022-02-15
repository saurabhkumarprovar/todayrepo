package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage(connection = "SF_Training", title = "Radiohandle")
public class Radiohandle {

public WebDriver driver;
 public Radiohandle(WebDriver driver)
{
this.driver=driver;
}

public String checkradio()
{
WebElement radio1 = driver.findElement(By.xpath("//*[@id=\"0121t000000kEPcAAM\"]"));
WebElement radio2 = driver.findElement(By.xpath("//*[@id=\"0121t000000kEPbAAM\"]"));

if(radio1.isSelected())
{
 return driver.findElement(By.xpath("//*[@id=\"content_892:0\"]/div/div/div[1]/div/div/div[1]/fieldset/div[1]/div[1]/label/div[2]")).getText();
 }
 else return "kuchbhi";

//*[contains(text(),'Employee')]
			
}
}
