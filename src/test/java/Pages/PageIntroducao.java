package Pages;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

public class PageIntroducao extends BasePage {

	public PageIntroducao(AppiumDriver<?> driver) {
		super(driver);
	}

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@name=\"PULAR INTRODUÇÃO\"]")
	@AndroidFindBy(id = "burgerking.com.br.appandroid:id/tutorialSkip")
	public MobileElement btnPularIntroducao;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@name=\"JÁ CONHECE O BK EXPRESS ?\"]")
	@AndroidFindBy(id = "burgerking.com.br.appandroid:id/tutorial_title")
	public MobileElement lblTitulo;

	@AndroidFindBy(id = "burgerking.com.br.appandroid:id/tutorial_subtitle")
	public MobileElement lblSubTitulo;

	@AndroidFindBy(id = "burgerking.com.br.appandroid:id/tutorial_image")
	public MobileElement imgPonto;
	
	@AndroidFindBy(id = "burgerking.com.br.appandroid:id/tutorial_description")
	public MobileElement lblDescription;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.View[1]")
	public MobileElement numPage;
	
	@AndroidFindBy(id = "burgerking.com.br.appandroid:id/tutorial_title")
	public MobileElement lblTituloDois;
	
	public void validaTelaIntroducao() throws IOException {
		btnPularIntroducao.isDisplayed();
		assertEquals("PULAR INTRODUÇÃO", btnPularIntroducao.getText());
	}

	public void validaTextos() throws IOException, InterruptedException {
		String bkExpress = lblTitulo.getText();
		bkExpress.contains("JÁ CONHECE O BK EXPRESS");
		assertEquals("Com ele você pode fazer o seu pedido e pagar pelo APP. Depois é só retirar em qualquer restaurante sem pegar fila. Muito fácil, né?", lblSubTitulo.getText());
		imgPonto.isDisplayed();
		assertEquals("Escolha o restaurante que você vai fazer o pedido.", lblDescription.getText());
		btnPularIntroducao.isDisplayed();
		assertEquals("PULAR INTRODUÇÃO", btnPularIntroducao.getText());
		tirarScreenShot();
		swipeHorizontalElementExample(lblTituloDois);
		tirarScreenShot();
	}

}
