package com.co.choucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class finishBuyPage {

    public static final Target FINISH_BUTTON = Target.the("click in the finish button")
            .located(By.id("finish"));
}
