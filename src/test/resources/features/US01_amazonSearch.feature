Feature: Amazon Search Test
  Scenario: TC01 Kullanici searchbox test eder
    Given Kullanici amazon sayfasina gider
    When Kullanici Iphone aratir
    Then Kullanici sonuclarin Iphone icerdigini test eder
    And Kullanici sayfayi kapatir

Scenario: TC 02
  Given Kullanici amazon sayfasina gider
  When Kullanici Selenium aratir
  Then Kullanici sonuclarin Selenium icerdigini test eder
  And Kullanici sayfayi kapatir

  Scenario: TC 03
    Given Kullanici amazon sayfasina gider
    When Kullanici Java aratir
    Then Kullanici sonuclarin Java icerdigini test eder
    And Kullanici sayfayi kapatir
