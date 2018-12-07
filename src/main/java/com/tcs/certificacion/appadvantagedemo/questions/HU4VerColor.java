package com.tcs.certificacion.appadvantagedemo.questions;

import com.tcs.certificacion.appadvantagedemo.userinterfaces.HU4Productos;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class HU4VerColor implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		return HU4Productos.COLOR_SELECCIONADO.resolveFor(actor).getAttribute("title");
	}
	
	public static HU4VerColor deProducto() {
		return new HU4VerColor();
	}

}
