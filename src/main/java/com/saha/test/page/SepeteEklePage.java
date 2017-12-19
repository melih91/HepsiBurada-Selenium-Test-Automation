package com.saha.test.page;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.saha.test.util.BasePageUtil;

public class SepeteEklePage extends BasePageUtil {

	public SepeteEklePage(WebDriver driver) {
		super(driver);
	}

	public void sepeteEkle() {
		sendKey(By.id("productSearch"), "BD300723");
		submit(By.id("productSearch"));
		click(By.xpath(
				"//div[@id='productresults']/div[2]/div/div/div[@class='box-container loader']//ul/li[1]//a[@href='/logitech-m185-nano-optik-kablosuz-mouse-mavi-910-002236-p-BD300723']//span[@class='price product-price']"));
		click(By.cssSelector(".icon-plus"));
		click(By.cssSelector(".icon-plus"));
		click(By.id("addToCart"));
		Assert.assertTrue("Sepete eklenemedi.", getTitle().contains("Sepetim"));
		System.out.println("Sepete eklendi.");
	}
}
