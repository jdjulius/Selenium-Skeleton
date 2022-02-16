package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class formPage{

	WebDriver driver;

	By inputName = By.name("name");
	By inputDNI = By.name("dni");
	By inputAdress = By.name("address");
	By inputEmail = By.name("email");
	By inputPhone = By.name("phonenumber");
	By buttonEnviar = By.name("enviar");
	
	By validacionName = By.xpath("/html/body/app-root/app-form-short/form/div[1]/p");
	By validacionDNI = By.xpath("/html/body/app-root/app-form-short/form/div[2]/p");
	By validacionEmail = By.xpath("/html/body/app-root/app-form-short/form/div[4]/p");
	By validacionPhone = By.xpath("/html/body/app-root/app-form-short/form/div[5]/p");

	By textValidacion = By.xpath("/html/body/app-root/app-form-short/h1");
	
	By inputHome = By.xpath("/html/body/app-root/app-nav-bar/header/div/nav/ul/li[1]/a");
	By inputFormulario = By.xpath("/html/body/app-root/app-nav-bar/header/div/nav/ul/li[2]/a");
	
	public formPage(WebDriver driver) {
		this.driver = driver;
	}

	public void setUserName(String strUserName) {

		driver.findElement(inputName).sendKeys(strUserName);

	}

	public void setDNI(String strDNI) {

		driver.findElement(inputDNI).sendKeys(strDNI);

	}

	public void setAdress(String strAdress) {

		driver.findElement(inputAdress).sendKeys(strAdress);

	}

	public void setEmail(String strEmail) {

		driver.findElement(inputEmail).sendKeys(strEmail);

	}

	public void setPhone(String strPhone) {

		driver.findElement(inputPhone).sendKeys(strPhone);

	}

	public void clickLogin() {

		driver.findElement(buttonEnviar).click();

	}
	
	public Boolean getValidacionNombre() {
		
		boolean isDisplayed = driver.findElement(validacionName).isDisplayed();
		return isDisplayed;
		
	}
	
	public void formFill(String strUserName, String strDNI, String strAdress, String strEmail, String strPhone) {

		this.setUserName(strUserName);
		this.setDNI(strDNI);
		this.setAdress(strAdress);
		this.setEmail(strEmail);
		this.setPhone(strPhone);

		this.clickLogin();
	}
	
	public String isLoaded() {
		return driver.findElement(textValidacion).getText();
	}
	
	public void clickHome() {
		driver.findElement(inputHome).click();
	}

	public void clickFormulario() {
		driver.findElement(inputFormulario).click();
	}
	

}
