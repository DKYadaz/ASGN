package com.testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.BasePage;
import com.pages.AFWebPage;

public class TestCase001 extends BasePage {
	
	AFWebPage aFWebPage;
	@BeforeMethod
	public void setUp(){
		initialization();
		aFWebPage = new AFWebPage();	
	}
	
	@Test()
	public void loginPageTitleTest(){
		double amazonPrice = aFWebPage.navigateToAmazonAndGetPrice("Apple iPhone XR (64GB) - Yellow");
		double flipKartPrice = aFWebPage.navigateToFlipKartAndGetPrice("Apple iPhone XR (Yellow, 64 GB)");
		Assert.assertEquals(amazonPrice, flipKartPrice);
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
