package webtests;

//import static org.testng.Assert.assertEquals;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import pages.WafiBasePage;
import pages.WafiHomePage;
import pages.WafiProductPage;
import pages.WafiShopingCartPage;
import utilities.WafiDriverSetup;

public class WafiLoginTest extends WafiDriverSetup {
	WafiHomePage HomePage = new WafiHomePage();
	WafiBasePage BasePage = new WafiBasePage();
	WafiProductPage ProductPage = new WafiProductPage();
	WafiShopingCartPage ShopingCartPage = new WafiShopingCartPage();

	@Test
	public void loginTest() {
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		getDriver().get("https://www.wafilife.com/");
		HomePage.clickPopupClose();
		HomePage.clickWriter();
		js.executeScript("window.scrollBy(0,1000)");
		HomePage.getElement(HomePage.CLICKNEXTPAGE).click();
		HomePage.clickSecondPageWriter();
		HomePage.authorClick();
		ProductPage.bookClick();
		ProductPage.palceOrder();
		ProductPage.confirmOrder();
		ShopingCartPage.nameField("Abdus Salam");
		ShopingCartPage.phoneNumberField("01403937947");
		ShopingCartPage.emailField("unvalidemail@jmail.kom");
		ShopingCartPage.clickDistrict();
		ShopingCartPage.searchField("Joypurhat", ShopingCartPage.getElement(ShopingCartPage.SEARCHFIELD));
		ShopingCartPage.getElement(ShopingCartPage.SEARCHFIELD).sendKeys(Keys.ENTER);
		ShopingCartPage.clickArea();
		ShopingCartPage.clickArea2();
		ShopingCartPage.address("House-22, Road-30, Block-D");
		ShopingCartPage.payment();
//		ShopingCartPage.placeOrder();
		ShopingCartPage.getElement(ShopingCartPage.PLACEORDER).click();

	}

}
