package Rongdhonu_PageAction;



import org.openqa.selenium.JavascriptExecutor;

import Rongdhonu_PageLocator.Rongdhonu_LegoPageLocator;
import Rongdhonu_Utility.Rongdhonu_Base;

public class Rongdhonu_LegoPageAction extends Rongdhonu_Base{
	
	Rongdhonu_LegoPageLocator RongLegoPageLocator = new Rongdhonu_LegoPageLocator();
	
	public void ClickonLegocitytoy() throws Exception {
		((JavascriptExecutor)driver).executeScript("scroll(0,500)");
		RongLegoPageLocator.lego.click();
		Thread.sleep(2000);
	}
	public void Clickonaddtocart() {
		((JavascriptExecutor)driver).executeScript("scroll(0,600)");
		RongLegoPageLocator.cart.click();
	}

}
