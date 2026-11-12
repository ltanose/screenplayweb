package com.co.choucair.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.co.choucair.userinterfaces.finishBuyPage.FINISH_BUTTON;

public class FinishTheBuy implements Task {


    public static FinishTheBuy inTheBuy() {
        return Tasks.instrumented(FinishTheBuy.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(FINISH_BUTTON)
        );
    }
}
