package com.tcs.certificacion.appadvantagedemo.questions;

import com.tcs.certificacion.appadvantagedemo.userinterfaces.HU8ProductosInventario;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class HU8Validar implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(HU8ProductosInventario.MENSAJE_ERROR).viewedBy(actor).asString();
	}
	
	public static HU8Validar mensaje() {
		return new HU8Validar();
	}

}
