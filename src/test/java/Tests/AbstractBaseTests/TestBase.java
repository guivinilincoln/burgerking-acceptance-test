package Tests.AbstractBaseTests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import cucumber.api.testng.AbstractTestNGCucumberTests;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;


public abstract class TestBase extends AbstractTestNGCucumberTests {
	public static AppiumDriver<MobileElement> driver;

	public abstract String getName();

	@BeforeTest
	public abstract void setUpPage();

	@BeforeMethod
	public void abrirApp() {
		driver.resetApp();
	}

	@BeforeSuite
	public void setUpAppium() throws MalformedURLException {

		final String URL_STRING = "http://0.0.0.0:4723/wd/hub";
		URL url = new URL(URL_STRING);
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		if (driver == null) {
			if (Plataforma.OS.equals("ANDROID")) {
				capabilities.setCapability("platformName", "Android");
				capabilities.setCapability("deviceName", "Android Emulator");
//				capabilities.setCapability("appPackage", "");
//				capabilities.setCapability("appActivity", "");
				capabilities.setCapability("app", "E:\\estudos\\appium\\burgerking-acceptance-test\\src\\app\\Android\\Burger King.apk");
				capabilities.setCapability("autoGrantPermissions", true);
				capabilities.setCapability("disableWindowAnimation", true);
				driver = new AndroidDriver<MobileElement>(url, capabilities);
				driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
			} else if (Plataforma.OS.equals("IOS")) {
				capabilities.setCapability("platformName", "IOS");
				capabilities.setCapability("platformVersion", "12.4");
				capabilities.setCapability("deviceName", "");
				capabilities.setCapability("automationName", "XCUITest");
				capabilities.setCapability("app",						"");
				capabilities.setCapability("autoGrantPermissions", true);
				capabilities.setCapability("autoAcceptAlerts", true);
				// capabilities.setCapability("noReset", true);
				driver = new IOSDriver<MobileElement>(url, capabilities);
			}
		}
	}

	public JSONObject getJsonDataObject(String jsonFileName, String dataGroup)
			throws ParseException, org.json.simple.parser.ParseException {
		Object jsonFileObject;
		BufferedReader reader;
		// criando um parses para utilizamos no momento da leitura do arquivo json
		JSONParser parser = new JSONParser();

		// criando um objeto json que vai receber os dados do arquivo json
		JSONObject jsonDataObject = null;
		try {
			// inserindo o arquivo json em um objeto
			reader = new BufferedReader(
					new InputStreamReader(getClass().getResourceAsStream("/" + jsonFileName + ".json")));
			jsonFileObject = parser.parse(reader);
			// convertendo o objeto com o arquivo json para o formato de objeto json
			jsonDataObject = (JSONObject) jsonFileObject;
		} catch (IOException e) {
			e.printStackTrace();
		}

		// garantindo que o objeto json n?o est? nulo
		assert jsonDataObject != null;

		// retornando o objeto json, filtrando pelo grupo de dados desejado
		return (JSONObject) jsonDataObject.get(dataGroup);
	}

	/**
	 * Always remember to quit
	 */
	@AfterSuite
	public void tearDownAppium() {
		driver.quit();
	}

//	@AfterClass
//	public void restartApp() {
//		driver.resetApp();
//	}

}