package com.tcs.certificacion.appadvantagedemo.tasks;

import com.tcs.certificacion.appadvantagedemo.userinterfaces.HU7CarritoCompras;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class HU7IrHasta implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(HU7CarritoCompras.BTN_CHECKOUT));
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		actor.attemptsTo(Click.on(HU7CarritoCompras.NEXT_BTN));
	}
	
	public static HU7IrHasta paymentMethod() {
		return new HU7IrHasta();
	}

}
