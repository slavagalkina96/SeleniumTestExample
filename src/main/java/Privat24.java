import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Privat24 {

    @Test
    public void paymentFromCardToCard (){

        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        driver.get("https://next.privat24.ua/money-transfer/card");

        By cardNumberA =  By.xpath("//input[@data-qa-node='numberdebitSource']");
        By expDate =  By.xpath("//input[@data-qa-node='expiredebitSource']");
        By cvv =  By.xpath("//input[@data-qa-node='cvvdebitSource']");
        By firstNameA =  By.xpath("//input[@data-qa-node='firstNamedebitSource']");
        By lastNameA =  By.xpath("//input[@data-qa-node='lastNamedebitSource']");
        By cardNumberB =  By.xpath("//input[@data-qa-node='numberreceiver']");
        By firstNameB =  By.xpath("//input[@data-qa-node='firstNamereceiver']");
        By lastNameB =  By.xpath("//input[@data-qa-node='lastNamereceiver']");
        By amount =  By.xpath("//input[@data-qa-node='amount']");
        By currency =  By.xpath("//button[@data-qa-value='UAH']");
        By currencyUSD =  By.xpath("//button[@data-qa-value='USD']");
        By span =  By.xpath("//span[@data-qa-node='toggle-comment']");
        By comment =  By.xpath("//textarea[@data-qa-node='comment']");
        By submitBtn =  By.xpath("//button[@type='submit']");

        driver.findElement(cardNumberA).sendKeys("5309 2330 3476 5085");
        driver.findElement(expDate).sendKeys("0124");
        driver.findElement(cvv).sendKeys("891");
        driver.findElement(firstNameA).sendKeys("Juliana");
        driver.findElement(lastNameA).sendKeys("Janssen");
        driver.findElement(cardNumberB).sendKeys("4004 1591 1544 9003");
        driver.findElement(firstNameB).sendKeys("Yaroslava");
        driver.findElement(lastNameB).sendKeys("Galkina");
        driver.findElement(amount).sendKeys("10");
        driver.findElement(currency).click();
        driver.findElement(currencyUSD).click();
        driver.findElement(span).click();
        driver.findElement(comment).sendKeys("Hello");
        driver.findElement(submitBtn).submit();

    }


}
