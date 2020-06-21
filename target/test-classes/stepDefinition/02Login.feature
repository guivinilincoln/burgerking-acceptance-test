# language: pt
@Login
Funcionalidade: Validacao textos da tela de introdução

  Contexto: Tela de introdução
    Dado Navego ate a pagina de introducao

  Cenário: Realizar validação dos textos da tela de introducao
    Dado que estou na tela inicial do aplicativo
    Quando realizo a validacao das tela de walkthrough
    Então clico em pular intraducao
