package com.co.choucair.stepdefinitions;

import com.co.choucair.questions.ValidateCartEmpty;
import com.co.choucair.questions.ValidateProduct;
import com.co.choucair.tasks.RemoveProductCart;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

public class InTheCartStepDefinition {

    @Then("validate the name product in the cart (.*)$")
    public void validateTheNameProductInTheCartProduct_name(String product) {
        OnStage.theActorInTheSpotlight().should(seeThat(ValidateProduct.of(), equalTo(product)));
    }

    @When("the product is removed from the cart")
    public void theProductIsRemovedFromTheCart() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                RemoveProductCart.inTheCart()
        );
    }

    @Then("We verify that the cart is empty.")
    public void weVerifyThatTheCartIsEmpty() {
        OnStage.theActorInTheSpotlight().should(seeThat(ValidateCartEmpty.of(), is(true)));
    }
}
