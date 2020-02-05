package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BasePage;

public class AFWebPage extends BasePage{


	@FindBy(id = "twotabsearchtextbox")
	WebElement amazonSearchBox;

	@FindBy(xpath = "//*[contains(text(),'Apple iPhone XR (64GB) - Yellow')]")
	WebElement amazonClickIphoneLink;

	@FindBy(xpath = "//span[@id='priceblock_ourprice']")
	WebElement agetPrice;
	//
	@FindBy(xpath = "//input[@placeholder='Search for products, brands and more']")
	WebElement flipKartSearchBox;

	@FindBy(xpath = "//div[contains(text(),'Apple iPhone XR (Yellow, 64 GB)')]")
	WebElement flipKartClickIphoneLink;

	@FindBy(xpath = "//span[@id='priceblock_ourprice']")
	WebElement fgetPrice;


	public AFWebPage(){
		PageFactory.initElements(driver, this);
	}

	public double navigateToAmazonAndGetPrice(String phoneName) {

		driver.get(prop.getProperty("urlAmazon"));
		
		amazonSearchBox.sendKeys(phoneName);
		amazonClickIphoneLink.click();
		
		String price  = agetPrice.getText().replace(",", "");
		double p = Double.parseDouble(price);
		
		return p;

	}

	public double navigateToFlipKartAndGetPrice(String phoneName) {

		driver.get(prop.getProperty("urlFlipkart"));
		
		amazonSearchBox.sendKeys(phoneName);
		amazonClickIphoneLink.click();
		
		String price  = agetPrice.getText().replace(",", "");
		double p = Double.parseDouble(price);
		
		return p;

	}

}
