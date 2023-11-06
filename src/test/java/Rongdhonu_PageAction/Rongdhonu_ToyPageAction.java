package Rongdhonu_PageAction;

import org.openqa.selenium.JavascriptExecutor;

import Rongdhonu_PageLocator.Rongdhonu_ToyPageLocator;
import Rongdhonu_Utility.Rongdhonu_Base;

public class Rongdhonu_ToyPageAction extends Rongdhonu_Base{
	
	Rongdhonu_ToyPageLocator RongToyPageLocator = new Rongdhonu_ToyPageLocator();
	
	
	public void ScrolldownandCheckedonlegobox() throws Exception {
		((JavascriptExecutor)driver).executeScript("scroll(0,700)");
		RongToyPageLocator.chkbx.click();
		Thread.sleep(2000);
	}

}
