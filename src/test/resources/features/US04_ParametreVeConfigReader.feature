Feature: Parametre ve ConfigReader kullanimi
  @ConfigReader
  Scenario: TC01 Parametre kullaniminda ConfigReader kullanimi
    Given kullanici "faceURL" sayfasına gider
    Then kullanici 2 saniye bekler
    When url in "facebook" icerdigini test eder
    And sayfayi kapatir

  Scenario: TC02 Parametre kullaniminda ConfigReader kullanimi
    Given kullanici "googleURL" sayfasına gider
    Then kullanici 2 saniye bekler
    When url in "google" icerdigini test eder
    And sayfayi kapatir

  Scenario: TC02 Parametre kullaniminda ConfigReader kullanimi
    Given kullanici "amazonUrl" sayfasına gider
    Then kullanici 2 saniye bekler
    When url in "amazon" icerdigini test eder
    And sayfayi kapatir