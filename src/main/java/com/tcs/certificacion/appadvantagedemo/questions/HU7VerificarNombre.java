package com.tcs.certificacion.appadvantagedemo.questions;

import com.tcs.certificacion.appadvantagedemo.userinterfaces.HU7CarritoCompras;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class HU7VerificarNombre implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(HU7CarritoCompras.NOMBRE_PRODUCTO).viewedBy(actor).asString();
	}
	
	public static HU7VerificarNombre delProducto() {
		return new HU7VerificarNombre();
	}

}
