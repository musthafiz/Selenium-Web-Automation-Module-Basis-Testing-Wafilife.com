package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WafiShopingCartPage extends WafiBasePage {
	public By NAMEFIELD = By.xpath("//input[@id='billing_first_name']");
	public By PHONENUMBER = By.xpath("//input[@id='billing_phone']");
	public By EMAIL = By.xpath("//input[@id='billing_email']");
	public By CLICKDISTRICT = By.xpath("//span[@id='select2-billing_state-container']");
	public By SEARCHFIELD = By.xpath("//input[@role='combobox']");
	public By AREACLICK = By.xpath("//select[@id='billing_area']");
	public By AREA2CLICK = By.xpath("//select[@id='billing_area']//option[@value='151'][contains(text(),'কালাই')]");
	public By ADDRESS = By.id("billing_address_1");
	public By PAYMENT = By.id("payment_method_rocket");
	public By PLACEORDER = By.id("place_order");

	public void nameField(String username) {
		writeText(NAMEFIELD, username);
	}

	public void phoneNumberField(String number) {
		writeText(PHONENUMBER, number);
	}

	public void emailField(String email) {
		writeText(EMAIL, email);
	}

	public void clickDistrict() {
		clickOnElement(CLICKDISTRICT);
	}

	public void searchField(String text, WebElement enter) {
		writeText(SEARCHFIELD, text);
	}

	public void clickArea() {
		clickOnElement(AREACLICK);
	}

	public void clickArea2() {
		clickOnElement(AREA2CLICK);
	}

	public void address(String text) {
		writeText(ADDRESS, text);
	}

	public void payment() {
		clickOnElement(PAYMENT);
	}

	public void placeOrder() {
		clickOnElement(PLACEORDER);
	}
}
