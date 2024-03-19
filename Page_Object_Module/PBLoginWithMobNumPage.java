package Page_Object_Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBLoginWithMobNumPage {
@FindBy(xpath="//input[@id='mobileNo']") private WebElement mobNum;
@FindBy(xpath="//span[text()='LOGIN WITH PASSWORD']")private WebElement loginWithPwd;

public PBLoginWithMobNumPage(WebDriver driver)
{
PageFactory.initElements(driver,this);	
}
public void inpPBLoginWithMobNumPageMobNum () {
	
mobNum.sendKeys("9637515958");
}
public void ClickPBLoginWithMobNumPageloginWithPwd () {
	loginWithPwd.click();
}

}
