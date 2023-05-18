#language: pt

  @cadastro
  Funcionalidade: cadastro de usuario
    Eu como usuario
    Quero me cadastrar
    Para fazer minhas compras

    @cadastro_sucesso
    Cenario: Registrar um novo usuario com sucesso
      Dado que estou na tela de login
      E acesso o cadastro de usuario
      Quando eu preencho o formulario de cadastro
      E clico em registrar
      Entao vejo a mensagem de cadastro realizado com sucesso

    @cadastro_erro_01
    Cenario: Apresentar erro ao tentar cadastrar com campo sobrenome vazio
      Dado que estou na tela de login
      E acesso o cadastro de usuario
      Quando eu preencho o formulario de cadastro
      Mas deixo de preencher o campo sobrenome
      E clico em registrar
      Entao vejo a mensagem de alerta