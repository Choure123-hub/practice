package POM_DDF_TestNG_BaseClass_UtilityClass;

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
public void inpPBLoginWithMobNumPageMobNum (String MobNumber) {
	
mobNum.sendKeys(MobNumber);
}
public void ClickPBLoginWithMobNumPageloginWithPwd () {
	loginWithPwd.click();
}

}
