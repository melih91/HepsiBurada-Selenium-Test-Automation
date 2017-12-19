package com.saha.test.page;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.saha.test.util.BasePageUtil;

public class ShoesPage extends BasePageUtil {

	public ShoesPage(WebDriver driver) {
		super(driver);
	}

	public void shoesBuy() throws InterruptedException {
		sendKey(By.id("productSearch"), "ayakkabı");
		submit(By.id("productSearch"));
		click(By.xpath(
				"//div[@id='productResult']//section[@class='page-options']/div[@class='filter-box-container']/div[2]/div//div[@class='items-container']/ul[@class='items']/li[@alt='Erkek']/a[@href='/erkek-giyim-modelleri-c-12087177']/span[1]"));
		click(By.xpath(
				"/html//div[@id='productResult']//section[@class='page-options']/div[@class='filter-box-container']/div[2]/div//div[@class='items-container']/ul[@class='items']/li[@alt='Erkek Ayakkabı']/a[@href='/ayakkabi-c-60000117']"));
		click(By.className("ins-cancel"));
		((JavascriptExecutor) driver).executeScript("scroll(0,800)");
		Thread.sleep(2000);
		click(By.xpath(
				"//div[@id='productResult']//section[@class='page-options']/div[@class='filter-box-container']/div[3]/div//ol[@class='filters-container']/li[@class='box-container fiyat']/ol/li[@alt='250 - 500 TL']/label"));
		System.out.println("250-500 tl araligi secildi.");
		((JavascriptExecutor) driver).executeScript("scroll(0,2000)");
		click(By.xpath(
				"//div[@id='productResult']//section[@class='page-options']/div[@class='filter-box-container']/div[3]/div//ol[@class='filters-container']/li[@class='box-container satici']/ol/li[@alt='Hepsiburada']/label"));
		((JavascriptExecutor) driver).executeScript("scroll(0,400)");
		click(By.xpath(
				"//div[@id='productResult']//section[@class='page-options']/div[@class='filter-box-container']/div[3]/div/div[@class='loader']/ol[@class='filters-container']/li[@class='box-container brand']/ol/li[@title='Voile Blanche']/label"));
		click(By.xpath(
				"//div[@id='productResult']//section[@class='page-options']/div[@class='filter-box-container']/div[3]/div//ol[@class='filters-container']/li[@class='box-container color-palette renk']/ol/li[@alt='Kahverengi']/label"));
		System.out.println("Kahverengi secildi.");
		((JavascriptExecutor) driver).executeScript("scroll(0,600)");
		click(By.xpath(
				"//div[@id='productResult']//section[@class='page-options']/div[@class='filter-box-container']/div[3]/div//ol[@class='filters-container']/li[@class='box-container numara']/ol/li[@alt='44']/label"));
		System.out.println("44 numara secildi.");
		thread(2);
		click(By.xpath(
				"//div[@id='productresults']/div[3]/div/div/div[@class='box-container loader']//ul/div/li/div/a[@href='/voile-blanche-gotland-sneaker-p-AYKVOI21326-44?magaza=Hepsiburada']//span[@class='price product-price']"));

		Assert.assertTrue("Sayfa yüklenemedi.", getTitle().contains("Voile Blanche Gotland Sneaker Fiyatı"));
		System.out.println("Voile Blanche Gotland Sneaker ayakkabi.");

		click(By.id("addToCart"));

		Assert.assertTrue("Sepete eklenemedi.", getTitle().contains("Sepetim"));
		System.out.println("Sepete eklendi.");
	}
}
