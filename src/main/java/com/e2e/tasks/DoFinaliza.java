package com.e2e.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.e2e.ui.FinalizaForm;

public class DoFinaliza implements Task {
    public static Performable withoptions(){
        return instrumented(DoFinaliza.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
    	String mensaje = "Thank you for your purchase!";
    	actor.attemptsTo(
                Click.on(FinalizaForm.CONFIRM_BUTTON)
        );
    }
}