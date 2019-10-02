package com.adactin.helper;

import org.openqa.selenium.WebDriver;

import com.adactin.pom.AdactinBookHotelPage;
import com.adactin.pom.AdactinBookedItenaryPage;
import com.adactin.pom.AdactinBookingConfirmationPage;
import com.adactin.pom.AdactinHomePage;
import com.adactin.pom.AdactinHotelPage;
import com.adactin.pom.AdactinLoginPage;

public class PageObjectManager {

	public WebDriver driver;
	
	private AdactinLoginPage lp;
	private AdactinHomePage hp;
	private AdactinHotelPage hop;
	private AdactinBookHotelPage bhp;
	private AdactinBookingConfirmationPage bcp;
	private AdactinBookedItenaryPage bip;
		
	public AdactinBookedItenaryPage getBip() {
		if (bip==null) {
			bip = new AdactinBookedItenaryPage(driver);
		}
		return bip;
	}

	public AdactinBookingConfirmationPage getBcp() {
		if (bcp==null) {
			bcp = new AdactinBookingConfirmationPage(driver);
		}
		return bcp;
	}

	public AdactinBookHotelPage getBhp() {
		if (bhp==null) {
			bhp = new AdactinBookHotelPage(driver);
		}
		return bhp;
	}

	public AdactinHotelPage getHop() {
		if (hop==null) {
			hop = new AdactinHotelPage(driver);
		}
		return hop;
	}

	public AdactinHomePage getHp() {
		if (hp==null) {
			hp = new AdactinHomePage(driver);
		}
		return hp;
	}

	public PageObjectManager(WebDriver pdriver) {
		this.driver = pdriver;
		
	}

	public AdactinLoginPage getLp() {
		if (lp==null) {
			lp = new AdactinLoginPage(driver);
		}
		return lp;
	}
}
