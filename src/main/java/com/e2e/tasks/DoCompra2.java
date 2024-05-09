package com.e2e.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.e2e.ui.SearchForms;


public class DoCompra2  implements Task {
    public static Performable withActor(){
        return instrumented(DoCompra2.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SearchForms.SEARCH_ITEM_2),
                Click.on(SearchForms.ADD_ITEM_2)
        );
    }
}
