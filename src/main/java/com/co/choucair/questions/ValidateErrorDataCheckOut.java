package com.co.choucair.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.choucair.userinterfaces.DataCheckOutPage.MESSAGE_FAIL_FIRST_USERNAME;

public class ValidateErrorDataCheckOut implements Question<String> {

    public static ValidateErrorDataCheckOut inTheForm() {
        return new ValidateErrorDataCheckOut();
    }

    @Override
    public String answeredBy(Actor actor) {
        return MESSAGE_FAIL_FIRST_USERNAME.resolveFor(actor).getText();
    }
}
