package steps;

import Pages.CadastroPage;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import runner.RunCucumberTest;

public class CadastroSteps extends RunCucumberTest {
    CadastroPage cadastroPage = new CadastroPage();
    @Quando("^eu preencho o formulario de cadastro$")
    public void eu_preencho_o_formulario_de_cadastro() {
        cadastroPage.selecionarTitulo(1);
        cadastroPage.preencherPrimeiroNome("João");
        cadastroPage.preencherUltimoNome("das Couves");
        cadastroPage.preencherSenha("123456");
        cadastroPage.preencherNascimento(07,07,"1997");
    }

    @Quando("^clico em registrar$")
    public void clico_em_registrar() {
        cadastroPage.botaoRegistrar();
    }

    @Entao("^vejo a mensagem de cadastro realizado com sucesso$")
    public void vejo_a_mensagem_de_cadastro_realizado_com_sucesso() {
        cadastroPage.validarRegistro();
    }

    @Quando("^deixo de preencher o campo sobrenome$")
    public void deixo_de_preencher_o_campo_sobrenome() {
        cadastroPage.limparCampoSobrenome();
    }

    @Entao("^vejo a mensagem de alerta$")
    public void vejo_a_mensagem_de_alerta() {
        cadastroPage.apresentarErro01();
   }


}
