package com.saha.test.page;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.saha.test.util.BasePageUtil;

public class IphonePage extends BasePageUtil {

	public IphonePage(WebDriver driver) {
		super(driver);
	}

	public void iPhoneBuy() {
		sendKey(By.id("productSearch"), "HBV000007PV9M");
		submit(By.id("productSearch"));
		click(By.xpath(
				"//div[@id='productresults']/div[2]/div/div/div[@class='box-container loader']//ul/li[1]//a[@href='/apple-iphone-8-plus-64-gb-apple-turkiye-garantili-p-HBV000007PV9M']//span[@class='price product-price']"));
		Assert.assertTrue("Sayfa yüklenemedi.", getTitle().contains("Apple iPhone 8 Plus 64 GB (Apple Türkiye Garantili) Fiyatı"));
		System.out.println("Apple iPhone 8 Plus 64 GB");
		((JavascriptExecutor) driver).executeScript("scroll(0,300)");
		click(By.id("addToCart"));
		Assert.assertTrue("Sepete eklenemedi.", getTitle().contains("Sepetim"));
		System.out.println("Sepete eklendi.");
		thread(3);
		click(By.xpath("//div[@id='short-summary']//button[@class='btn btn-primary full']/span[@class='text']"));
		click(By.xpath(
				"/html//div[@id='login-container']/section//div[@class='login-selections']/div[3]/div[@class='controls']/label[@class='text']"));
		sendKey(By.id("lazy-email"), "melihkaracomak91@gmail.com");
		click(By.xpath("//form[@id='form-lazy-login']//button[@type='submit']"));
		sendKey(By.id("first-name"), "melih");
		sendKey(By.id("last-name"), "karacomak");
		click(By.xpath(
				"//form[@id='form-address']//div[@class='box-content']/section[2]/div[3]/div[@class='controls']/div/div/ul[@role='menu']/li[@rel='24']/a[@class='']/span[@class='text']"));
		click(By.xpath(
				"//form[@id='form-address']//div[@class='box-content']/section[2]/div[4]/div[@class='controls']/div/div/ul[@role='menu']/li[@rel='1']/a[@class='']/span[@class='text']"));
		sendKey(By.id("address"), "çağlayan mahallesi bahar sokak	");
		sendKey(By.id("address-name"), "ev");
		sendKey(By.id("zip-code"), "34403");
		sendKey(By.id("phone"), "05312136991");
		click(By.xpath("/html//div[@id='short-summary']//button[@class='btn btn-primary full']"));
		sendKey(By.id("card-no"), "4532486438426702");
		sendKey(By.id("holder-Name"), "melih karacomak");
		click(By.xpath(
				"/html//form[@id='form-credit-card']//div[@class='date-col group']/div[1]/div/div/ul[@role='menu']/li[@rel='1']/a[@class='']"));
		click(By.xpath(
				"/html//form[@id='form-credit-card']//div[@class='date-col group']/div[2]/div/button[@title='2018']"));
		sendKey(By.id("cvc"), "123");
	}
}
