package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
	
	WebDriver driver;
	By inputUser = By.name("usuario");
	By inputPass = By.name("password");
	By inputLogin = By.name("login");
	By textSolicitar = By.xpath("/html/body/app-root/app-card-detail/h1/p[2]"); // Iniciar Sesion

	
	public loginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void setUser(String strUser) {
		driver.findElement(inputUser).sendKeys(strUser);
	}

	
	public void setPassword(String strPassword) {
		driver.findElement(inputPass).sendKeys(strPassword);
	}
	
	public void clickLogin() {
		driver.findElement(inputLogin).click();
	}
	
	public String isLoaded() {
		return driver.findElement(textSolicitar).getText();
	}
	
	public void login(String usr, String pass) {
		
		setUser(usr);
		setPassword(pass);
		clickLogin();
		
	}
}
