package Rongdhonu_Stepdefination;


import Rongdhonu_PageAction.Rongdhonu_HomePageAction;
import Rongdhonu_PageAction.Rongdhonu_LoginPageAction;

import Rongdhonu_Utility.Rongdhonu_Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Rongdhonu_Login extends Rongdhonu_Base{
	
	Rongdhonu_HomePageAction RongHomePageAction = new Rongdhonu_HomePageAction();
	Rongdhonu_LoginPageAction RongLoginPageAction = new Rongdhonu_LoginPageAction();
	
	
	@Given("^Launch <\"([^\"]*)\"> pro$")
	public void launch_pro(String url) throws Throwable {
		rongLaunchurl(url);
	
	}

	@Then("^Click on sign in link$")
	public void click_on_sign_in_link() throws Throwable {
		RongHomePageAction.Clickonsigninlink();
	}

	@Then("^click Signin$")
	public void click_Signin() throws Throwable {
		RongHomePageAction.clickSignin();
	}
	
    @Then("^Enter Rongusername passward and click signin button$")
	public void enter_Rongusername_passward_and_click_signin_button() throws Throwable {
    	RongLoginPageAction.EnterRongusernamepasswardandclicksigninbutton(prorong.getProperty("RongUsername"), prorong.getProperty("RongPassward"));
	   
	}

    @Then("^Verify Ronguser cannot sign in successfully$")
    public void verify_Ronguser_cannot_sign_in_successfully() throws Throwable {
    	RongLoginPageAction.VerifyRongusercannotsigninsuccessfully();
    }

}
