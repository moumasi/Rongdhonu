package Rongdhonu_PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Rongdhonu_Utility.Rongdhonu_Base;

public class Rongdhonu_LoginPageLocator extends Rongdhonu_Base{
	
	 public  Rongdhonu_LoginPageLocator() {
		PageFactory.initElements(driver, this); 
	 }
	
	@FindBy(id ="username")
	public WebElement Ronguser;

	@FindBy(id ="password")
	public WebElement Rongpassward;
	

	@FindBy(xpath ="//span[text()='Sign in']") 
	public WebElement Rongbutton;
	
	@FindBy(id ="username--ErrorMessage")
	public WebElement verifyprl;
	
}
