package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

public class Esperas {

    public void esperarCargaPagina (WebDriver driver){
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
    }
    public static void esperaExplicitaClick (By elemento, WebDriver driver) {
        WebDriverWait myWaitVar = new WebDriverWait(driver, 30);
        myWaitVar.until(ExpectedConditions.elementToBeClickable(elemento));
    }
    public void esperaImplicita ( int segundos){
        try {
            Thread.sleep(segundos);
        } catch (InterruptedException e) {
            e.printStackTrace(System.out);
        }
    }
}