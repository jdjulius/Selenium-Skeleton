package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Pages.formPage;
import env.*;

public class formTest {

	WebDriver driver;
	formPage objForm;

	@BeforeTest
	public void setup() {
		System.setProperty(env.navegadorChrome, env.driverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(env.URL_FORM);
	}

	@Test
	public void testFormFill() {
		objForm = new formPage(driver);
		objForm.formFill("Julio Velasquez", "2181792350101", "Ciudad Capital", "julio.david.velasquez@gmail.com",
				"54784848");
	}

	@Deprecated
	public void testCriterioAceptacion1() {

		objForm = new formPage(driver);
		objForm.formFill("Julio Velasquez", "2181792350101", "Ciudad Capital", "julio.david.velasquez@gmail.com",
				"54784848");

	}

	@Deprecated
	public void testCriterioAceptacion2() {
		objForm = new formPage(driver);
		objForm.formFill("Julio Velasquez", "2925", "Ciudad Capital", "julio@gmail.com", "54784848");
		
		Assert.assertEquals(1 , 0 , "Correct status code returned");

	}

	@Deprecated
	public void testCriterioAceptacion3() {
		objForm = new formPage(driver);
		objForm.formFill("", "2925", "", "julio", "adsfasdf");
		
	}

	@Deprecated
	public void testCriterioAceptacion4() {
		objForm = new formPage(driver);
		objForm.formFill("julio!!)( Velasquez", "2925-123-123", "", "julio", "adsfasdf");
		
	}

	@Deprecated
	public void testCriterioAceptacion5() {
		objForm = new formPage(driver);
		boolean data = objForm.getValidacionNombre();
		Assert.assertEquals(data, 1, "Correct status code returned");
		
	}
}
