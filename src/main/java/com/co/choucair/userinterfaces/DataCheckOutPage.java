package com.co.choucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DataCheckOutPage {

    public static final Target FIRST_USERNAME = Target.the("")
            .located(By.id("first-name"));

    public static final Target LAST_USERNAME = Target.the("input firt name")
            .located(By.id("last-name"));

    public static final Target POSTAL_CODE = Target.the("input last name")
            .located(By.id("postal-code"));

    public static final Target CONTINUE_BUTTON = Target.the("input postal code")
            .located(By.id("continue"));

    public static final Target MESSAGE_FAIL_FIRST_USERNAME = Target.the("input postal code")
            .located(By.xpath("//*[contains(text(), 'Error:')]"));


}
