package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class cardPage {

	WebDriver driver;
	By inputVer = By.name("Ver");
	By textSolicitar = By.xpath("/html/body/app-root/app-card-detail/h1/p[2]"); // Bienvenido [USR]

	
	public cardPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickLogin() {
		driver.findElement(inputVer).click();
	}
	
	public String isLoaded() {
		return driver.findElement(textSolicitar).getText();
	}
	
}
