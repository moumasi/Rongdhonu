package Rongdhonu_PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Rongdhonu_Utility.Rongdhonu_Base;

public class Rongdhonu_ToyPageLocator extends Rongdhonu_Base{
	
	public Rongdhonu_ToyPageLocator() { 
	PageFactory.initElements(driver, this);
	
	}
	
	
	@FindBy(css = "#p_89\\/LEGO > span > a > div > label > i")
	public WebElement chkbx;
	

}
