package com.tcs.certificacion.appadvantagedemo.interactions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.tcs.certificacion.appadvantagedemo.userinterfaces.HU2CreacionUsuario;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

public class HU2Aceptar implements Interaction {
	
	private String aceptarPoliticas;
	
	public HU2Aceptar(String aceptarPoliticas) {
		this.aceptarPoliticas = aceptarPoliticas;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		if(aceptarPoliticas.equals("si")) {
			actor.attemptsTo(Click.on(HU2CreacionUsuario.ACEPTAR_POLITICAS));
		}
	}
	
	public static HU2Aceptar politicas(String aceptarPoliticas) {
		return instrumented(HU2Aceptar.class, aceptarPoliticas);
	}

}
