$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("stepDefinition/01Walkthrough.feature");
formatter.feature({
  "name": "Validacao textos da tela de introdução",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@introducao"
    }
  ]
});
formatter.background({
  "name": "Tela de introdução",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "Navego ate a pagina de introducao",
  "keyword": "Given "
});
formatter.match({
  "location": "WalkthroughTest.setUpPage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Realizar validação dos textos da tela de introducao",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@introducao"
    }
  ]
});
formatter.step({
  "name": "que estou na tela inicial do aplicativo",
  "keyword": "Given "
});
formatter.match({
  "location": "WalkthroughTest.que_estou_na_tela_inicial_do_aplicativo()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "realizo a validacao das tela de walkthrough",
  "keyword": "When "
});
formatter.match({
  "location": "WalkthroughTest.realizo_a_validacao_das_telas_de_walkthrough()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clico em quero conhecer",
  "keyword": "Then "
});
formatter.match({
  "location": "WalkthroughTest.clico_em_quero_conhecer()"
});
formatter.result({
  "status": "passed"
});
});