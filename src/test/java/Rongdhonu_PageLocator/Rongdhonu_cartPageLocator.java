package Rongdhonu_PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Rongdhonu_Utility.Rongdhonu_Base;

public class Rongdhonu_cartPageLocator extends Rongdhonu_Base {
	
	public Rongdhonu_cartPageLocator() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[@class='a-size-medium-plus a-color-base sw-atc-text a-text-bold']")
	public WebElement cartpage;

}
