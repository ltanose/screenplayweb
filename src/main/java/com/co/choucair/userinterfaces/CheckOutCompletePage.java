package com.co.choucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CheckOutCompletePage {

    public static final Target FINISH_MESSAGE = Target.the("click in te button cart")
            .located(By.xpath("//*[contains(text(), 'Thank you for your order!')]"));
}
