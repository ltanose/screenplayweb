package com.co.choucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SauceLoginPage {
  public static final Target TXT_USER = Target.the("user name")
          .located(By.id("user-name"));
  public static final Target TXT_PASS = Target.the("pasword")
          .located(By.xpath("//input[@id='password']"));
  public static final Target BTN_SUBMIT = Target.the("txt")
          .located(By.xpath("//input[@id='login-button']"));
  public static final Target TXT_VALIDATION = Target.the("txt")
          .located(By.xpath("//div[contains(text(), 'Swag Labs')]"));

}