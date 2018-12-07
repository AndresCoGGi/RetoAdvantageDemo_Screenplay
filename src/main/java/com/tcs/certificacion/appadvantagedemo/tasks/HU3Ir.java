package com.tcs.certificacion.appadvantagedemo.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.tcs.certificacion.appadvantagedemo.interactions.HU3Cambiar;
import com.tcs.certificacion.appadvantagedemo.userinterfaces.HU3HomePage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class HU3Ir implements Task{
	
	private String redSocial;

	public HU3Ir(String redSocial) {
		this.redSocial = redSocial;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(HU3HomePage.RED_SOCIAL.of(redSocial)),HU3Cambiar.aVentana());
	}
	
	public static HU3Ir aLaRedSocial(String redSocial) {
		return instrumented(HU3Ir.class, redSocial);
	}

}
