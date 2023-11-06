package Rongdhonu_PageAction;

import org.testng.Assert;

import Rongdhonu_PageLocator.Rongdhonu_LoginPageLocator;
import Rongdhonu_Utility.Rongdhonu_Base;

public class Rongdhonu_LoginPageAction extends Rongdhonu_Base{
	
	Rongdhonu_LoginPageLocator  RongLoginPageLocator = new  Rongdhonu_LoginPageLocator();
	
    public void EnterRongusernamepasswardandclicksigninbutton(String s,String h) throws Exception {
    	Thread.sleep(5000);
    	RongLoginPageLocator.Ronguser.sendKeys(s);
    	RongLoginPageLocator.Rongpassward.sendKeys(h);
    	Thread.sleep(5000);
    	 RongLoginPageLocator.Rongbutton.click();
	  
  }
    public void  VerifyRongusercannotsigninsuccessfully() throws Exception {
    	boolean verifynotsuccess=RongLoginPageLocator.verifyprl.isDisplayed();
    	Assert.assertTrue(verifynotsuccess);
    	Thread.sleep(2000);
    }
  
  }




