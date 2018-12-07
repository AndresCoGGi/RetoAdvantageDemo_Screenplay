package com.tcs.certificacion.appadvantagedemo.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.tcs.certificacion.appadvantagedemo.userinterfaces.HU3HomePage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class HU4Seleccionar implements Task {
	
	private String categoria;

	public HU4Seleccionar(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(HU3HomePage.CATEGORIA.of(categoria)));
	}
	
	public static HU4Seleccionar categoria(String categoria) {
		return instrumented(HU4Seleccionar.class, categoria);
	}

}
