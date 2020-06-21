package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

public class PageLoginPosIntroducao extends BasePage {

	protected PageLoginPosIntroducao(AppiumDriver<?> driver) {
		super(driver);
	}
	
	@iOSFindBy(xpath = "")
	@AndroidFindBy(id = "burgerking.com.br.appandroid:id/imageTop")
	public MobileElement imgLogo;
	
	
	@iOSFindBy(xpath = "")
	@AndroidFindBy(id = "burgerking.com.br.appandroid:id/principal_message")
	public MobileElement lblPmessage;

	@iOSFindBy(xpath = "")
	@AndroidFindBy(id = "burgerking.com.br.appandroid:id/btn_register_facebook")
	public MobileElement btnRegistroFace;
	
	@iOSFindBy(xpath = "")
	@AndroidFindBy(id = "burgerking.com.br.appandroid:id/btn_register_email")
	public MobileElement btnEmail;
	
	@iOSFindBy(xpath = "")
	@AndroidFindBy(id = "burgerking.com.br.appandroid:id/already_registered")
	public MobileElement btnJaCadastrado;
	
	@iOSFindBy(xpath = "")
	@AndroidFindBy(id = "burgerking.com.br.appandroid:id/btn_login")
	public MobileElement btnLogin;
	
	@iOSFindBy(xpath = "")
	@AndroidFindBy(id = "burgerking.com.br.appandroid:id/jump")
	public MobileElement btnPular;

}
