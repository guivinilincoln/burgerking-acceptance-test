@introducao
Feature: Validacao textos da tela de introdução

  Background: Tela de introdução
    Given Navego ate a pagina de indrucao

  Scenario: Realizar validação dos textos da tela de indrucao
    Given que estou na tela inicial do aplicativo
    When realizo a validacao das tela de walkthrough
    Then clico em quero conhecer
