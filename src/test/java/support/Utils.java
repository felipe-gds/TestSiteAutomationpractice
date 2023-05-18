package support;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import runner.RunCucumberTest;
import java.util.Random;

public class Utils extends RunCucumberTest {

    public static void waitElementBePresent(By element, int tempo) {
        WebDriverWait wait = new WebDriverWait(getDriver(), tempo);
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }
    public static String getRandomEmail() {
        String email = "testando_";
        String email_final = "@testando.com.br";

        Random random = new Random();
            int min = 1;
            int max = 999;
            int resultado = random.nextInt(max-min) + min;

            return(email + resultado + email_final);
    }
}

// lembrar de fazer script de geração de nome e senha aleatória