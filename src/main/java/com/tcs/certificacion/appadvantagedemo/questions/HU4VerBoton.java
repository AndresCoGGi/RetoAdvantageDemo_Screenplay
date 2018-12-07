package com.tcs.certificacion.appadvantagedemo.questions;

import com.tcs.certificacion.appadvantagedemo.userinterfaces.HU4Productos;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class HU4VerBoton implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(HU4Productos.BTN_ADDTOCART).viewedBy(actor).asString();
	}
	
	public static HU4VerBoton addToCart() {
		return new HU4VerBoton();
	}

}
