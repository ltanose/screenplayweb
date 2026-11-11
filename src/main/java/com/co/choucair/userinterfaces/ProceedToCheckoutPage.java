package com.co.choucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProceedToCheckoutPage {

    public static final Target CHECKOUT_BUTTON = Target.the("click in te button checkout")
            .located(By.id("checkout"));
}
