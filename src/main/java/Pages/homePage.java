package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import env.*;

public class homePage {

	WebDriver driver;

	By inputHome = By.xpath("/html/body/app-root/app-nav-bar/header/div/nav/ul/li[1]/a");
	By inputFormulario = By.xpath("/html/body/app-root/app-nav-bar/header/div/nav/ul/li[2]/a");
	By inputSolicitar = By.name("card-clasica");
	By inputVermas = By.name("card-clasica");

	By textValidacion = By.xpath("/html/body/app-root/app-home/h2");

	public homePage(WebDriver driver) {
		this.driver = driver;

	}

	public void open() {
		driver.get(env.URL_HOME);
	}

	public void clickHome() {
		driver.findElement(inputHome).click();
	}

	public void clickFormulario() {
		driver.findElement(inputFormulario).click();
	}

	public void clickSolicitar() {
		driver.findElement(inputSolicitar).click();
	}

	public void clickVermas() {
		driver.findElement(inputVermas).click();
	}

	public String isLoaded() {
		return driver.findElement(textValidacion).getText();
	}
	

}
