package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;


public class AmazonStepDefinitions {
    AmazonPage amazonPage =new AmazonPage();

    @Given("Kullanici amazon sayfasina gider")
    public void kullanici_amazon_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        ReusableMethods.wait(1);
        Driver.getDriver().navigate().refresh();
    }
    @When("Kullanici Iphone aratir")
    public void kullanici_ıphone_aratir() {
        amazonPage.searchbox.sendKeys("Iphone", Keys.ENTER);
    }
    @Then("Kullanici sonuclarin Iphone icerdigini test eder")
    public void kullanici_sonuclarin_ıphone_icerdigini_test_eder() {
        Assert.assertTrue(amazonPage.result.getText().contains("Iphone"));
    }
    @Then("Kullanici sayfayi kapatir")
    public void kullanici_sayfayi_kapatir() {
        Driver.closeDriver();
    }

    @When("Kullanici Selenium aratir")
    public void kullaniciSeleniumAratir() {
        amazonPage.searchbox.sendKeys("Selenium", Keys.ENTER);
    }

    @Then("Kullanici sonuclarin Selenium icerdigini test eder")
    public void kullaniciSonuclarinSeleniumIcerdiginiTestEder() {
        Assert.assertTrue(amazonPage.result.getText().contains("Selenium"));
    }

    @When("Kullanici Java aratir")
    public void kullaniciJavaAratir() {
        amazonPage.searchbox.sendKeys("Java", Keys.ENTER);
    }

    @Then("Kullanici sonuclarin Java icerdigini test eder")
    public void kullaniciSonuclarinJavaIcerdiginiTestEder() {
        Assert.assertTrue(amazonPage.result.getText().contains("Java"));
    }
}
