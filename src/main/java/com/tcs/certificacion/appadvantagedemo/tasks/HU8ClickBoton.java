package com.tcs.certificacion.appadvantagedemo.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.tcs.certificacion.appadvantagedemo.userinterfaces.HU4Productos;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class HU8ClickBoton implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(HU4Productos.BTN_ADDTOCART));
	}
	
	public static HU8ClickBoton addToCart() {
		return instrumented(HU8ClickBoton.class);
	}

}
