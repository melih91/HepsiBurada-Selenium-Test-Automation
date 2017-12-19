package com.saha.test.page;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.saha.test.util.BasePageUtil;

public class HomePage extends BasePageUtil {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	public LoginPage callLoginPage() {
		clickElement(By.className("insider-opt-in-notification-button"));
		thread(2);
		clickElement(By.cssSelector(".icon-track-order:nth-of-type(1) span"));
//		clickElement(By.xpath("//div[@id='myAccount']/a[2]"));
//		Thread.sleep(1000);
//		clickElement(By.xpath("/html//a[@id='login']"));
		Assert.assertTrue("Uye girisi yapilamadi", getTitle().contains("Üye Giriş Sayfası"));
	        System.out.println("Uye girisi basarili.");
		return new LoginPage(driver);
	}

	public SignUpPage callSignUpPage() {
		clickElement(By.className("insider-opt-in-notification-button"));
		thread(2);
		clickElement(By.cssSelector(".icon-track-order:nth-of-type(1) span"));
		Assert.assertTrue("Uye kaydi yapilamadi", getTitle().contains("Üye Giriş Sayfası"));
        System.out.println("Uye kaydi basarili.");
		return new SignUpPage(driver);
	}

	public SearchPage callSearching() {
		clickElement(By.className("insider-opt-in-notification-button"));
		return new SearchPage(driver);
	}

	public SepeteEklePage callSepeteEkle() {
		clickElement(By.className("insider-opt-in-notification-button"));
		return new SepeteEklePage(driver);
	}

	public IphonePage callIphonebuy() {
		clickElement(By.className("insider-opt-in-notification-button"));
		return new IphonePage(driver);
	}

	public ShoesPage callShoesBuy() {
		clickElement(By.className("insider-opt-in-notification-button"));
		return new ShoesPage(driver);
	}
}
