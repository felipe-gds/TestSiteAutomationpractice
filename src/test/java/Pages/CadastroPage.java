package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import runner.RunCucumberTest;
import support.Utils;

public class CadastroPage extends RunCucumberTest {
    private By tituloM = By.id("id_gender1");
    private By tituloF = By.id("id_gender2");
    private By campo_primeiro_nome = By.id("customer_firstname");
    private By campo_ultimo_nome = By.id("customer_lastname");
    private By campo_senha = By.id("passwd");
    private By campo_dia = By.id("days");
    private By campo_mes = By.id("months");
    private By campo_ano = By.id("years");
    private By botao_registrar = By.id("submitAccount");
    private By mensagem_sucesso = By.className("alert-success");

    public void selecionarTitulo(int titulo) {
        Utils.waitElementBePresent(tituloM, 20);
        if(titulo == 1) {
            getDriver().findElement(tituloM).click();
        } else if(titulo == 2) {
            getDriver().findElement(tituloF).click();
        }
    }
    public void preencherPrimeiroNome(String nome) {
        getDriver().findElement(campo_primeiro_nome).sendKeys(nome);
    }
    public void preencherUltimoNome(String ultimo_nome) {
        getDriver().findElement(campo_ultimo_nome).sendKeys(ultimo_nome);
    }
    public void preencherSenha(String senha) {
        getDriver().findElement(campo_senha).sendKeys(senha);
    }

    public void preencherNascimento(int dia, int mes, String ano) {
        Select selecionar_dia = new Select(getDriver().findElement(campo_dia));
        selecionar_dia.selectByIndex(dia);
        Select selecionar_mes = new Select(getDriver().findElement(campo_mes));
        selecionar_mes.selectByIndex(mes);
        Select selecionar_ano = new Select(getDriver().findElement(campo_ano));
        selecionar_ano.selectByValue(ano);
    }

    public void limparCampoSobrenome() {
        getDriver().findElement(campo_ultimo_nome).clear();
    }
    public void botaoRegistrar() {
        getDriver().findElement(botao_registrar).click();
    }

    public void validarRegistro() {
        Utils.waitElementBePresent(mensagem_sucesso, 20);
        String sucessoRegistro = getDriver().findElement(mensagem_sucesso).getText();
        Assert.assertEquals("Mensagem não apresentada corretamente", "Your account has been created.", sucessoRegistro);
    }

    public void apresentarErro01() {
        Utils.waitElementBePresent(By.className("alert-danger"), 20);
        String erroRegistro = getDriver().findElement(By.className("alert-danger")).getText();
        Assert.assertEquals("Mensagem não apresentada corretamente", "There is 1 error\n" +
                "lastname is required.", erroRegistro);
    }


}
