package Rongdhonu_Stepdefination;

import Rongdhonu_PageAction.Rongdhonu_HomePageAction;
import Rongdhonu_PageAction.Rongdhonu_LegoPageAction;
import Rongdhonu_PageAction.Rongdhonu_ToyPageAction;
import Rongdhonu_PageAction.Rongdhonu_cartPageAction;
import Rongdhonu_Utility.Rongdhonu_Base;
import cucumber.api.java.en.Then;

public class amazon_cart extends Rongdhonu_Base{
	
	Rongdhonu_HomePageAction RongHomePageAction = new Rongdhonu_HomePageAction();
	Rongdhonu_ToyPageAction RongToyPageAction = new Rongdhonu_ToyPageAction();
	 Rongdhonu_LegoPageAction  RongLegoPageAction = new  Rongdhonu_LegoPageAction();
	 Rongdhonu_cartPageAction  RongcartPageAction = new  Rongdhonu_cartPageAction();
	 
	@Then("^Type Toys on search field and click icon$")
	public void type_Toys_on_search_field_and_click_icon() throws Throwable {
		RongHomePageAction.TypeToysonsearchfieldandclickicon(prorong.getProperty("RongSearch"));
	}

	@Then("^Scrolldown and Checked on lego box$")
	public void scrolldown_and_Checked_on_lego_box() throws Throwable {
		 RongToyPageAction.ScrolldownandCheckedonlegobox();
	}

	@Then("^Click on Lego city toy$")
	public void click_on_Lego_city_toy() throws Throwable {
		RongLegoPageAction.ClickonLegocitytoy();
	}

	@Then("^Click on add to cart$")
	public void click_on_add_to_cart() throws Throwable {
		RongLegoPageAction.Clickonaddtocart();
	}

	@Then("^Verify Ronguser can add item in cart$")
	public void verify_Ronguser_can_add_item_in_cart() throws Throwable {
		RongcartPageAction.VerifyRongusercanadditemincart();
	}



}
