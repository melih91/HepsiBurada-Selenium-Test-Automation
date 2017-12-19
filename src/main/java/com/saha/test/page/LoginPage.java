package com.saha.test.page;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.saha.test.contants.General_Contants;
import com.saha.test.util.BasePageUtil;

public class LoginPage extends BasePageUtil implements General_Contants {

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public void login(String email, String password) {
		click(By.cssSelector(".login-selections .control-group:nth-of-type(1) .text"));
		sendKey(EMAIL_TEXTBOX, email);
		sendKey(PASSWORD_TEXTBOX, password);
		click(By.className("btn-login-submit"));
		Assert.assertTrue("Login sayfası yüklenemedi.", getTitle().contains("Üye Giriş Sayfası"));
        System.out.println("Login sayfası yüklendi.");
	}

}
