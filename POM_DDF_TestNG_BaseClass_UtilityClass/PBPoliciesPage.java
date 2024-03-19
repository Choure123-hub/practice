package POM_DDF_TestNG_BaseClass_UtilityClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class PBPoliciesPage 
{
@FindBy(xpath="//p[text()='Policies']")private WebElement polic;
@FindBy(xpath="//p[text()='Bhagvan']")private WebElement titile;

public PBPoliciesPage (WebDriver driver) 
{
	PageFactory.initElements(driver, this);
}
public void clickOnPolicies() 
{
	polic.click();
}
public void Policiesgettitle() 
{
	String text = titile.getText();
	System.out.println(text);
}
}
