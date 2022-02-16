package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Pages.cardPage;
import Pages.loginPage;
import env.env;

public class loginTest {

	WebDriver driver;
	loginPage login;
	cardPage card;

	@BeforeTest
	public void setup() {
		System.setProperty(env.navegadorChrome, env.driverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(env.URL_PRODUCT);
	}
	
	@Test
	public void testGoHome() {
		login = new loginPage(driver);
		card = new cardPage(driver);

		login.login("Julio", "#$vsdf");		
		
		Assert.assertEquals("Bienvenido: Julio", card.isLoaded(),
				"Fallo, no llego a la pagina correcta.");

	}
	
	
}
