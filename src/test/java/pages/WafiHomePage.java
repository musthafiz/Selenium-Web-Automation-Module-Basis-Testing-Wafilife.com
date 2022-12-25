package pages;

import org.openqa.selenium.By;

public class WafiHomePage extends WafiBasePage {
	public By POPUPCLOSE = By.xpath("//button[@class=\"pum-close popmake-close\"]");
	public By WRITER = By.xpath("//span[text()='লেখক']");
	public By CLICKNEXTPAGE = By.xpath("//a[@class='next page-numbers']");
	public By WRITERSECONDPAGE = By.xpath("//a[@href='/cat/books/author/']");
	public By AUTHORCLICK = By.xpath("//h3[contains(text(),'Abdul Malik Mujahid')]");

	public void clickPopupClose() {
		clickOnElement(POPUPCLOSE);
	}

	public void clickWriter() {
		clickOnElement(WRITER);
	}

	public void clickNextPage() {
		clickOnElement(CLICKNEXTPAGE);
	}

	public void clickSecondPageWriter() {
		clickOnElement(WRITERSECONDPAGE);
	}

	public void authorClick() {
		clickOnElement(AUTHORCLICK);
	}

}
