package Rongdhonu_PageAction;

import org.testng.Assert;

import Rongdhonu_PageLocator.Rongdhonu_cartPageLocator;
import Rongdhonu_Utility.Rongdhonu_Base;
import Rongdhonu_Utility.Rongdhonu_Utiliti;

public class Rongdhonu_cartPageAction extends Rongdhonu_Base{
	
	 Rongdhonu_cartPageLocator  RongcartPageLocator = new  Rongdhonu_cartPageLocator();
	 
	public void VerifyRongusercanadditemincart() {
		boolean cartsuccess = RongcartPageLocator.cartpage.isDisplayed();
		Assert.assertTrue(cartsuccess);
		Rongdhonu_Utiliti.takeMyScreenshot(driver, "cart page");
	}

}
