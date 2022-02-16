package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class cardDetailPage {

	WebDriver driver;
	By buttonSolicitar = By.name("getcard");
	By textSolicitar = By.xpath("/html/body/app-root/app-card-detail/h1/p[2]"); // Crédito Clásica

	public cardDetailPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickSolicitar() {

		driver.findElement(buttonSolicitar).click();

	}

	public String isLoaded() {
		return driver.findElement(textSolicitar).getText();
	}

}
