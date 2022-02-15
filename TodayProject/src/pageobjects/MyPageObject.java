package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="MyPageObject"                                
     , summary=""
     , relativeUrl=""
     , connection="SF_Training"
     )             
public class MyPageObject {

	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='New']")
	public WebElement new_;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//input[@id='input-214']")
	public WebElement salutation;
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//input[@id='input-217']")
	@TextType()
	public WebElement firstName;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//input[@id='input-218']")
	public WebElement lastName;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//input[@id='input-224']")
	public WebElement company;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//input[@id='input-262']")
	public WebElement leadSource;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[@name='SaveEdit']")
	public WebElement save;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//input[@id='input-286']")
	public WebElement salutation1;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//input[@id='input-289']")
	public WebElement firstName1;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//input[@id='input-290']")
	public WebElement lastName1;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//input[@id='input-296']")
	public WebElement company1;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//input[@id='input-334']")
	public WebElement leadSource1;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Leads']")
	public WebElement leads;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//input[@id='input-215']")
	public WebElement firstName2;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//input[@id='input-216']")
	public WebElement lastName2;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//input[@id='input-222']")
	public WebElement company2;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//input[@id='input-260']")
	public WebElement leadSource2;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//input[@id='input-213']")
	public WebElement firstName3;
	@LinkType()
	@FindBy(xpath = "//div[@id='nav-xshop']/a[normalize-space(.)='Mobiles']")
	public WebElement mobiles;
	@TextType()
	@FindBy(xpath = "//span[@id='popoverData']")
	public WebElement loan_amount;
	@TextType()
	@FindBy(xpath = "//span[normalize-space(.)='Loan Amount:']")
	public WebElement loan_amount1;
	@TextType()
	@FindBy(xpath = "//*[@id=\"popoverData\"]")
	public WebElement tooltipmsg;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Use the Online Calculator Full Screen']")
	public WebElement useTheOnlineCalculatorFullScreen;
	
	@LinkType()
	@FindBy(xpath = "/html/body/lightning-primitive-bubble/div")
	public WebElement iconwalamsg;
	
	
	@PageFrame()
	public static class Frame {

		@LinkType()
		@FindBy(xpath = "//div[1]/a")
		public WebElement imagefield;
		@LinkType()
		@FindBy(xpath = "//*[@id=\"ui-id-8\"]/div")
		public WebElement hovermsg;
	}
	@FindBy(xpath = "//div[contains(@class, \"resp-tabs-container\")]/div[1]/p[1]//iframe")
	public Frame frame;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Help']")
	public WebElement help;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='Adobe PDFCNT00019737-QXY RESOURCES PTE_ LTD_-SGD-2022-01-15']")
	public WebElement pdf_data;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Property Finder']")
	public WebElement propertyFinder;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='No Items']")
	public WebElement noItems;
	@LinkType()
	@JavascriptBy(jspath = "return document.querySelector('tr:nth-child(1) > th > span > a')")
	public WebElement ACCOUNT_NAME;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneWorkspace') and (ancestor::div[contains(@class,'active') and contains(@class,'main-content')]//div[contains(@class, 'oneGlobalNav') or contains(@class, 'tabBarContainer')]//div[contains(@class, 'tabContainer') and contains(@class, 'active')] )]//a[@name='ContactHierarchy']")
	public WebElement ContactHierarchy;
	@TextType()
	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	public WebElement Search;
	@ButtonType()
	@FindBy(xpath = "//input[@id='nav-search-submit-button']")
	public WebElement go;
	@ChoiceListType()
	@FindBy(xpath = "//select[@id='searchDropdownBox']")
	public WebElement maindrop;
	@LinkType()
	@FindBy(xpath = "//li[@id='p_90/20912642031']/span/a")
	public WebElement getItIn2Days;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Samsung']")
	public WebElement samsung;
	@TextType()
	@FindBy(xpath = "//span[normalize-space(.)='Sort by:']")
	public WebElement onemoredrop;
	@LinkType()
	@FindBy(xpath = "//a[@id='s-result-sort-select_2']")
	public WebElement priceHighToLow;
	@LinkType()
	@FindBy(xpath = "//li[@id='p_n_pct-off-with-tax/2665399031']/span/a")
	public WebElement _10OffOrMore;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Mobiles & Accessories']")
	public WebElement mobilesAndAccessories;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Power Banks']")
	public WebElement powerBanks;
	@LinkType()
	@FindBy(xpath = "//div[@id='nav-flyout-icp']//a[normalize-space(.)='हिन्दी - HI']")
	public WebElement hI;
	@LinkType()
	@FindBy(xpath = "//a[@id='icp-nav-flyout']")
	public WebElement flag;
	@LinkType()
	@FindBy(xpath = "//div[@id='nav-flyout-icp']//a[@id='icp-flyout-mkt-change']")
	public WebElement changeCountryRegion;
	@TextType()
	@FindBy(xpath = "//span[@id='a-autoid-0-announce']/span")
	public WebElement onelasdrop;
	@LinkType()
	@FindBy(xpath = "//a[@id='icp-selected-country_20']")
	public WebElement unitedStates;
	@ButtonType()
	@FindBy(xpath = "//span[@id='a-autoid-2']/span/input")
	public WebElement goto_;
	@ButtonType()
	@FindBy(xpath = "//span[normalize-space(.)=concat('Don',\"'\",'t Change')]/input")
	public WebElement dont;
	@ButtonType()
	@FindBy(xpath = "//span[normalize-space(.)=concat('Don',\"'\",'t Change')]/input")
	public WebElement dontt;
	@TextType()
	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	public WebElement newfield;
	@TextType()
	@FindBy(xpath = "//img[@id='angular']")
	public WebElement dragobject;
	@TextType()
	@FindBy(xpath = "//div[@id='droparea']")
	public WebElement dropobject;
	
	public WebDriver driver;
	public MyPageObject(WebDriver driver)
{
this.driver=driver;
}
	

public boolean checkradio()
{
return driver.findElement(By.xpath("//*[contains(text(),'Employee')]")).isSelected();
}
			
}
	
			

