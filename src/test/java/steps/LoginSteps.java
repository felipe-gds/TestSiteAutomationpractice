package steps;

import Pages.LoginPage;
import cucumber.api.java.es.Dado;
import runner.RunBase;
import runner.RunCucumberTest;

public class LoginSteps extends RunCucumberTest {
    LoginPage loginPage = new LoginPage();
    @Dado("^que estou na tela de login$")
    public void que_estou_na_tela_de_login() {
        getDriver(RunBase.Browser.CHROME);
        loginPage.acessarTelaLogin();
    }
    @Dado("^acesso o cadastro de usuario$")
    public void acesso_o_cadastro_de_usuario() {
        loginPage.emailCadastro();
        loginPage.botaoCadastro();
    }
}
