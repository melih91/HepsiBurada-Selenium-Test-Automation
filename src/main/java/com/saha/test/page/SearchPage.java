package com.saha.test.page;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.saha.test.util.BasePageUtil;

public class SearchPage extends BasePageUtil {

	public SearchPage(WebDriver driver) {
		super(driver);
	}

	public void search() throws InterruptedException {
		click(By.xpath("//li[@id='elektronik']//span[.='ELEKTRONİK']"));
		Thread.sleep(100);
		click(By.xpath(
				"//li[@id='elektronik']/div//ul[@class='nav-home']/li[1]/a[@href='/bilgisayarlar-c-2147483646']"));
		click(By.xpath(
				"/html//div[@id='productResult']//section[@class='page-options']/div[@class='filter-box-container']/div[2]/div//div[@class='items-container']/ul[@class='items']/li[@alt='Çevre Birimleri']/a[@href='/cevre-birimleri-c-3013120']"));
		click(By.xpath(
				"/html//div[@id='productResult']//section[@class='page-options']/div[@class='filter-box-container']/div[2]/div//div[@class='items-container']/ul[@class='items']/li[@alt='Mouse']/a[@href='/mouse-c-52']"));
		click(By.className("ins-cancel"));
		((JavascriptExecutor) driver).executeScript("scroll(0,2500)");
		Thread.sleep(1000);
		click(By.className("page-2 "));
		Assert.assertTrue("Sayfa 2 ye gidilemedi", getTitle().contains("Sayfa 2"));
        System.out.println("Sayfa 2");
		((JavascriptExecutor) driver).executeScript("scroll(0,2000)");
		click(By.className("page-3 "));
		Assert.assertTrue("Sayfa 3 ye gidilemedi", getTitle().contains("Sayfa 3"));
        System.out.println("Sayfa 3");
		((JavascriptExecutor) driver).executeScript("scroll(0,2000)");
		click(By.className("page-4 "));
		Assert.assertTrue("Sayfa 4 ye gidilemedi", getTitle().contains("Sayfa 4"));
        System.out.println("Sayfa 4");
		((JavascriptExecutor) driver).executeScript("scroll(0,2000)");
		click(By.className("page-5 "));
		Assert.assertTrue("Sayfa 5 ye gidilemedi", getTitle().contains("Sayfa 5"));
        System.out.println("Sayfa 5");
		((JavascriptExecutor) driver).executeScript("scroll(0,2000)");
		click(By.className("page-6 "));
		Assert.assertTrue("Sayfa 6 ye gidilemedi", getTitle().contains("Sayfa 6"));
        System.out.println("Sayfa 6");
		((JavascriptExecutor) driver).executeScript("scroll(0,2000)");
		click(By.className("page-7 "));
		Assert.assertTrue("Sayfa 7 ye gidilemedi", getTitle().contains("Sayfa 7"));
        System.out.println("Sayfa 7");
        ((JavascriptExecutor) driver).executeScript("scroll(0,500)");
		click(By.xpath(
				"//div[@id='productresults']/div[3]/div/div/div[@class='box-container loader']/div/ul/li[6]//a[@href='/apple-magic-mouse-2-mla02tu-a-p-BDTKNKMOUAPPLEMLA0']//span[@class='price product-price']"));
	}
}
