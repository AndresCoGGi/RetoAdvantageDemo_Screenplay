package com.tcs.certificacion.appadvantagedemo.questions;

import com.tcs.certificacion.appadvantagedemo.userinterfaces.HU2CreacionUsuario;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class HU2MensajeError implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
	    return Text.of(HU2CreacionUsuario.LONGITUD_INCORRECTA).viewedBy(actor).asString();
	}
	
	public static HU2MensajeError longitud() {
		return new HU2MensajeError();
	}
}
