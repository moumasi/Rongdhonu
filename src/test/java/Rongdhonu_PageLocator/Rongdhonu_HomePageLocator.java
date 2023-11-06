package Rongdhonu_PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Rongdhonu_Utility.Rongdhonu_Base;

public class Rongdhonu_HomePageLocator extends Rongdhonu_Base {
	
	public Rongdhonu_HomePageLocator() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[text()='Sign in']")
	public WebElement Ronglink;
	
	
	@FindBy(css="#listaccountNav-signIn > a > span")
	public WebElement Rongsignin;
	
	@FindBy(id = "twotabsearchtextbox")
	public WebElement Rongsearch;
	
	
	@FindBy(id = "nav-search-submit-button")
	public WebElement RongSicon;

}
