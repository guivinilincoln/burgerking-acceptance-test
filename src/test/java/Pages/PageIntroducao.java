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

//	@iOSFindBy()
	@AndroidFindBy(id = "burgerking.com.br.appandroid:id/tutorial_subtitle")
	public MobileElement lblSubTitulo;

//	@iOSFindBy()
	@AndroidFindBy(id = "burgerking.com.br.appandroid:id/tutorial_image")
	public MobileElement imgPonto;
	
//	@iOSFindBy()
	@AndroidFindBy(id = "burgerking.com.br.appandroid:id/tutorial_description")
	public MobileElement lblDescription;
	
	
//	@iOSFindBy()
	@AndroidFindBy(id = "burgerking.com.br.appandroid:id/tutorial_title")
	public MobileElement lblTituloDois;
	
//	@iOSFindBy()
	@AndroidFindBy(id = "burgerking.com.br.appandroid:id/tutorial_description")
	public MobileElement lblSubTituloDois;
	
//	@iOSFindBy()
	@AndroidFindBy(xpath = "//*[contains(@text, \"TERCEIRA ETAPA\")]")
	public MobileElement lblTituloTres;
	
//	@iOSFindBy()
	@AndroidFindBy(id = "burgerking.com.br.appandroid:id/tutorial_description")
	public MobileElement lblSubTituloTres;
			
//	@iOSFindBy()
	@AndroidFindBy(id = "burgerking.com.br.appandroid:id/tutorial_image")
	public MobileElement imgSmartPhone;
	
//	@iOSFindBy()
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.ImageView")
	public MobileElement imgSaco;
	
//	@iOSFindBy()
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.ImageView")
	public MobileElement imgHamburguer;
	
//	@iOSFindBy()
	@AndroidFindBy(id = "burgerking.com.br.appandroid:id/tutorial_title")
	public MobileElement lblTituloQuatro;

//	@iOSFindBy()
	@AndroidFindBy(xpath  = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.TextView[2]")
	public MobileElement lblSubTituloQuatro;
	
//	@iOSFindBy()
	@AndroidFindBy(xpath  = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.TextView[1]")
	public MobileElement lblTituloUltimo;
	
//	@iOSFindBy()
	@AndroidFindBy(xpath  = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.TextView[2]")
	public MobileElement lblSubTituloUltimo;
	
	
//	@iOSFindBy()
	@AndroidFindBy(id = "burgerking.com.br.appandroid:id/imageTop")
	public MobileElement imgBk;
	
	
	
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
		assertEquals("SEGUNDA ETAPA", lblTituloDois.getText());
		assertEquals("Faça o seu pedido.", lblSubTituloDois.getText());
		tirarScreenShot();	
		swipeHorizontalElementExample(imgSmartPhone);
		assertEquals("TERCEIRA ETAPA", lblTituloTres.getText());
		assertEquals("Ao chegar no restaurante, faça o scan do QR code do seu pedido. Seu lanche será feito na hora.", lblSubTituloTres.getText());
		tirarScreenShot();
		swipeHorizontalElementExample(imgSaco);
		assertEquals("QUARTA ETAPA", lblTituloQuatro.getText());
		assertEquals("Espere ser chamado para retirar o pedido.", lblSubTituloQuatro.getText());
		tirarScreenShot();
		swipeHorizontalElementExample(imgHamburguer);
		assertEquals("E POR ÚLTIMO", lblTituloUltimo.getText());
		assertEquals("Depois é só aproveitar mais um delicioso lanche do BK.", lblSubTituloUltimo.getText());
		tirarScreenShot();

	}

	public void btnPularIntroducao() throws IOException {
		btnPularIntroducao.click();
		imgBk.isDisplayed();
		tirarScreenShot();
	}

}
