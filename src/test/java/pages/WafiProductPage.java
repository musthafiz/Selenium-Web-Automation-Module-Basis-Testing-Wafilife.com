package pages;

import org.openqa.selenium.By;

public class WafiProductPage extends WafiBasePage {
	public By CLICKBOOK = By.xpath("//a[contains(text(),'A Day in the Life of Muslim Child')]");
	public By PLACEORDER = By.xpath("//button[@class='single_add_to_cart_button button alt ']");
	public By CONFIRMORDER = By.xpath("//span[contains(text(),'অর্ডার সম্পন্ন করুন')]");

	public void bookClick() {
		clickOnElement(CLICKBOOK);
	}

	public void palceOrder() {
		clickOnElement(PLACEORDER);
	}

	public void confirmOrder() {
		clickOnElement(CONFIRMORDER);
	}

}
