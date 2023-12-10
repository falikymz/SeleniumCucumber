Feature: Background Kullanimi
  Background: Ortak adimlar
    Given Kullanici amazon sayfasina gider
  @senaryo1
  Scenario: TC01 Kullanici searchbox test eder

    When Kullanici Iphone aratir
    Then Kullanici sonuclarin Iphone icerdigini test eder


  Scenario: TC 02

    When Kullanici Selenium aratir
    Then Kullanici sonuclarin Selenium icerdigini test eder


  Scenario: TC 03

    When Kullanici Java aratir
    Then Kullanici sonuclarin Java icerdigini test eder
    And Kullanici sayfayi kapatir

