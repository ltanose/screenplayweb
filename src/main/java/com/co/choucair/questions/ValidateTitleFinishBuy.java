package com.co.choucair.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.choucair.userinterfaces.CheckOutCompletePage.FINISH_MESSAGE;

public class ValidateTitleFinishBuy implements Question<String> {

    public static ValidateTitleFinishBuy inThePage() {

        return new ValidateTitleFinishBuy();
    }

    @Override
    public String answeredBy(Actor actor) {
        return FINISH_MESSAGE.resolveFor(actor).getText();
    }
}
