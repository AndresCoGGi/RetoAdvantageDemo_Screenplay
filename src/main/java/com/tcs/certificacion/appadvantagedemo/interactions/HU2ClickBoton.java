package com.tcs.certificacion.appadvantagedemo.interactions;

import com.tcs.certificacion.appadvantagedemo.userinterfaces.HU2CreacionUsuario;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

public class HU2ClickBoton implements Interaction{

	@Override
	public <T extends Actor> void performAs(T actor) {
		WebElementFacade elemento= HU2CreacionUsuario.BTN_REGISTRO.resolveFor(actor);
		if (elemento.isEnabled()) {
		     actor.attemptsTo(Click.on(HU2CreacionUsuario.BTN_REGISTRO));
		}
	}
	
	public static HU2ClickBoton register() {
		return new HU2ClickBoton();
	}
}
