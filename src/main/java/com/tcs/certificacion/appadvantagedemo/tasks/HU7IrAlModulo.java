package com.tcs.certificacion.appadvantagedemo.tasks;

import com.tcs.certificacion.appadvantagedemo.userinterfaces.HU7CarritoCompras;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class HU7IrAlModulo implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(HU7CarritoCompras.BTN_CHECKOUT));
	}
	
	public static HU7IrAlModulo orderPayment() {
		return new HU7IrAlModulo();
	}

}
