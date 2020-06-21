package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

public class PageCadastro extends BasePage {

	protected PageCadastro(AppiumDriver<?> driver) {
		super(driver);
	}
	
	@iOSFindBy(xpath = "")
	@AndroidFindBy(id = "burgerking.com.br.appandroid:id/imageTop")
	public MobileElement imgLogo;

}
