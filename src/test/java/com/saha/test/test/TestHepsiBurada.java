package com.saha.test.test;

import org.junit.Test;

import com.saha.test.base.BaseTest;
import com.saha.test.page.HomePage;

public class TestHepsiBurada extends BaseTest {

	@Test
	public void successLogin() {
		new HomePage(driver).callLoginPage().login("melihkaracomak91@gmail.com", "melih1991");
	}

	@Test
	public void successSignUp() {
		new HomePage(driver).callSignUpPage().signUp();
	}

	@Test
	public void searching() throws InterruptedException {
		new HomePage(driver).callSearching().search();
	}

	@Test
	public void sepeteEkleme() {
		new HomePage(driver).callSepeteEkle().sepeteEkle();
	}

	@Test
	public void shoesbuy() throws InterruptedException {
		new HomePage(driver).callShoesBuy().shoesBuy();
	}

	@Test
	public void iphonebuy() {
		new HomePage(driver).callIphonebuy().iPhoneBuy();
	}

}
