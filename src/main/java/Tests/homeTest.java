package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.cardDetailPage;
import Pages.formPage;
import Pages.homePage;
import env.*;

public class homeTest {

	WebDriver driver;
	homePage home;
	formPage form;
	cardDetailPage card;

	@BeforeTest
	public void setup() {
		System.setProperty(env.navegadorChrome, env.driverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(env.URL_HOME);
	}

	@AfterTest
	public void tearDown() {
		// driver.quit();
	}

	@Deprecated
	public void testMenuBar() {
		home = new homePage(driver);
		form = new formPage(driver);

		home.clickFormulario();
		Assert.assertEquals("Formulario Corto", form.isLoaded(), "Fallo, no llego a la pagina correcta.");

		form.clickHome();
		Assert.assertEquals("Un mundo de posibilidades\nen tus manos", home.isLoaded(),
				"Fallo, no llego a la pagina correcta.");

		home.clickHome();
		Assert.assertEquals("Un mundo de posibilidades\nen tus manos", home.isLoaded(),
				"Fallo, no llego a la pagina correcta.");
	}

	@Test
	public void testCard() {
		home = new homePage(driver);
		card = new cardDetailPage(driver);
		
		home.clickSolicitar();		
		
		Assert.assertEquals("Crédito Clásica", card.isLoaded(), "Fallo, no llego a la pagina correcta.");

	}

}
