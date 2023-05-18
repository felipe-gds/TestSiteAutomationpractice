package Pages;

import org.openqa.selenium.By;
import runner.RunCucumberTest;
import support.Utils;
import static support.Utils.getRandomEmail;

public class LoginPage extends RunCucumberTest {
    private By criarContaEmail = By.id("email_create"); // variavel para abstrair o nome do ID caso mude
    private By criarContaBotao = By.id("SubmitCreate");

    public void acessarTelaLogin() {
        getDriver().get("http://automationpractice.pl/index.php?controller=authentication&back=my-account");
    }

    public void emailCadastro() {
        Utils.waitElementBePresent(criarContaEmail, 20);
        getDriver().findElement(criarContaEmail).sendKeys(getRandomEmail());
    }
    public void botaoCadastro() {
        getDriver().findElement(criarContaBotao).click();
    }

}
