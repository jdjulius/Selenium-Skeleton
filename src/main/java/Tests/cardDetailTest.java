package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.cardDetailPage;
import Pages.homePage;
import env.env;

public class cardDetailTest {

	WebDriver driver;
	homePage home;
	cardDetailPage card;

	@BeforeTest
	public void setup() {
		System.setProperty(env.navegadorChrome, env.driverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(env.URL_CARD);
	}
	
	@Test
	public void testGoHome() {
		home = new homePage(driver);
		card = new cardDetailPage(driver);
		
		card.clickSolicitar();		
		
		Assert.assertEquals("Un mundo de posibilidades\nen tus manos", home.isLoaded(),
				"Fallo, no llego a la pagina correcta.");

	}
	
}
