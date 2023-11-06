package Rongdhonu_PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Rongdhonu_Utility.Rongdhonu_Base;

public class Rongdhonu_LegoPageLocator extends Rongdhonu_Base{
	
	public Rongdhonu_LegoPageLocator() { 
		PageFactory.initElements(driver, this);
		
		}
	
	@FindBy(css = "#search > div.s-desktop-width-max.s-desktop-content.s-wide-grid-style-t1.s-opposite-dir.s-wide-grid-style.sg-row > div.sg-col-20-of-24.s-matching-dir.sg-col-16-of-20.sg-col.sg-col-8-of-12.sg-col-12-of-16 > div > span.rush-component.s-latency-cf-section > div.s-main-slot.s-result-list.s-search-results.sg-row > div:nth-child(9) > div > div > div > div > div.s-product-image-container.aok-relative.s-text-center.s-image-overlay-grey.puis-image-overlay-grey.s-padding-left-small.s-padding-right-small.puis-spacing-small.s-height-equalized.puis.puis-v3vtwxgppca0z12v18v51zrqona > span > a > div > img")
	public WebElement lego;
	
	
	@FindBy(id = "add-to-cart-button")
	public WebElement cart;

}
