package Tests;

import java.io.IOException;

import Pages.PageIntroducao;
import Tests.AbstractBaseTests.TestBase;
import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

@CucumberOptions(features = "classpath:stepDefinition", 
				 glue = "Tests", 
				 plugin = { "pretty", "html:target/cucumber-pretty",
		"json:target/cucumber-html-reports/cucumber.json", "html:target/cucumber-html-reports",
		"json:target/cucumber.json" })

public class WalkthroughTest extends TestBase {

	PageIntroducao introd;
	
	@Override
	public String getName() {
		return "Walkthrough Test";
	}

	@Given("^Navego ate a pagina de introducao$")
	public void setUpPage() {
		introd = new PageIntroducao(driver);
	}

	@Given("^que estou na tela inicial do aplicativo$")
	public void que_estou_na_tela_inicial_do_aplicativo() throws IOException{
		introd.validaTelaIntroducao();
	}

	@When("^realizo a validacao das tela de walkthrough$")
	public void realizo_a_validacao_das_telas_de_walkthrough() throws IOException, InterruptedException {
		introd.validaTextos();
	}

	@Then("^clico em quero conhecer$")
	public void clico_em_quero_conhecer() throws InterruptedException, IOException {
	}

	
}