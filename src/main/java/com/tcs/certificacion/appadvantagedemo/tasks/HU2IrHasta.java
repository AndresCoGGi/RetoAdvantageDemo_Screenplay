package com.tcs.certificacion.appadvantagedemo.tasks;


import com.tcs.certificacion.appadvantagedemo.userinterfaces.HU2CreacionUsuario;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class HU2IrHasta implements Task{
	

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(HU2CreacionUsuario.BTN_USUARIO));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		actor.attemptsTo(Click.on(HU2CreacionUsuario.CREAR_CUENTA));
	}
	
	public static HU2IrHasta formularioDeRegistro() {
		return Tasks.instrumented(HU2IrHasta.class);
	}
	
	

}
