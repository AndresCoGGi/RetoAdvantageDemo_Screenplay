package com.tcs.certificacion.appadvantagedemo.questions;


import com.tcs.certificacion.appadvantagedemo.userinterfaces.HU2CreacionUsuario;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class HU2Leer implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(HU2CreacionUsuario.USERNAME_RESULTADO).viewedBy(actor).asString();
	}
	
	public static HU2Leer NombreDeUsuario() {
		return new HU2Leer();
	}

}
