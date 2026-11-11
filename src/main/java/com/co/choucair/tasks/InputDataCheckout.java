package com.co.choucair.tasks;

import com.co.choucair.models.CheckOutData;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


import static com.co.choucair.userinterfaces.DataCheckOutPage.*;

@AllArgsConstructor
public class InputDataCheckout implements Task {

    private CheckOutData checkOutData;

    public static InputDataCheckout inTheBuy(CheckOutData checkOutData) {

        return Tasks.instrumented(InputDataCheckout.class, checkOutData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(checkOutData.getFirstName()).into(FIRST_USERNAME),
                Enter.theValue(checkOutData.getLastName()).into(LAST_USERNAME),
                Enter.theValue(checkOutData.getPostalCode()).into(POSTAL_CODE),
                Click.on(CONTINUE_BUTTON)
        );
    }
}
