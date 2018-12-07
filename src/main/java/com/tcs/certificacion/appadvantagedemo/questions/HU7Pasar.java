package com.tcs.certificacion.appadvantagedemo.questions;

import com.tcs.certificacion.appadvantagedemo.userinterfaces.HU7CarritoCompras;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class HU7Pasar implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(HU7CarritoCompras.MENSAJE_METODO_PAGO).viewedBy(actor).asString();
	}
	
	public static HU7Pasar aSeccion() {
		return new HU7Pasar();
	}

}
