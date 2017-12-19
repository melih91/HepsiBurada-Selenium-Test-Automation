package com.saha.test.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.saha.test.contants.General_Contants;
import com.saha.test.util.BasePageUtil;

public class SignUpPage extends BasePageUtil implements General_Contants {

	public SignUpPage(WebDriver driver) {
		super(driver);
	}

	public void signUp() {
		click(By.xpath(
				"/html//div[@id='login-container']/section//div[@class='login-selections']/div[2]/div[@class='controls']/label[@class='text']"));
		sendKey(FIRSTNAME_TEXTBOX, "Melih");
		sendKey(LASTNAME_TEXTBOX, "Karaçomak");
		sendKey(EMAIL_REGISTER_TEXTBOX, "melihkaracomak91@gmail.com");
		sendKey(PASSWORD_REGISTER_TEXTBOX, "melih1991");
		sendKey(PASSWORD_REPEAT_TEXTBOX, "melih1991");
		click(By.cssSelector("[for=\"subscribe-email\"]"));
		click(By.cssSelector("[for=\"subscribe-sms\"]"));
		click(By.cssSelector("#form-user button"));
	}
}
