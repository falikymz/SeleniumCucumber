package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class FaceBookStepDefinition {
    @Given("kullanici {string} sayfasına gider")
    public void kullanici_sayfasına_gider(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }
    @Then("kullanici {int} saniye bekler")
    public void kullanici_saniye_bekler(Integer minute) {
        ReusableMethods.wait(minute);
    }
    @When("url in {string} icerdigini test eder")
    public void url_in_icerdigini_test_eder(String getUrl) {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(getUrl));
    }
    @When("sayfayi kapatir")
    public void sayfayi_kapatir() {
       Driver.closeDriver();

    }
}
