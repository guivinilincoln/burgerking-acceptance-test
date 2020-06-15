@introducao
Feature: Validacao textos da tela de introdução

  Background: Tela de introdução
    Given Navego ate a pagina de introducao

  Scenario: Realizar validação dos textos da tela de introducao
    Given que estou na tela inicial do aplicativo
    When realizo a validacao das tela de walkthrough
    Then clico em pular intraducao
