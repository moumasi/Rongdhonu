package Rongdhonu_PageAction;

import Rongdhonu_PageLocator.Rongdhonu_HomePageLocator;
import Rongdhonu_Utility.Rongdhonu_Base;
import Rongdhonu_Utility.Rongdhonu_TestData;

public class Rongdhonu_HomePageAction extends Rongdhonu_Base{
	
	 Rongdhonu_HomePageLocator  RongHomePageLocator = new  Rongdhonu_HomePageLocator();
	 
	  public void  Clickonsigninlink () {
		  RongHomePageLocator.Ronglink.click();
		  
	  }
	  public void clickSignin() {
		  RongHomePageLocator.Rongsignin.click();
	  }
	  
	  
	  public void TypeToysonsearchfieldandclickicon(String t) throws Exception {
		  RongHomePageLocator.Rongsearch.sendKeys(Rongdhonu_TestData.RongSearch);
		  RongHomePageLocator.RongSicon.click();
		  Thread.sleep(3000);
	  }

}
