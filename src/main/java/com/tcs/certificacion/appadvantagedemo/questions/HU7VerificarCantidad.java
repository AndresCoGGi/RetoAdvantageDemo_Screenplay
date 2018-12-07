package com.tcs.certificacion.appadvantagedemo.questions;

import com.tcs.certificacion.appadvantagedemo.userinterfaces.HU7CarritoCompras;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class HU7VerificarCantidad implements Question<String> {

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(HU7CarritoCompras.CANTIDAD).viewedBy(actor).asString();
	}
	
	public static HU7VerificarCantidad deProductos() {
		return new HU7VerificarCantidad();
	}

}
