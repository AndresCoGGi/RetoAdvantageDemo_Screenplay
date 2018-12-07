package com.tcs.certificacion.appadvantagedemo.questions;

import com.tcs.certificacion.appadvantagedemo.userinterfaces.HU8ProductosInventario;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class HU8Ver implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		if(HU8ProductosInventario.BTN_ADD.resolveFor(actor).isPresent()) {
			return "no disponible";
		}else {
			return "disponible";
		}
	}
	
	public static HU8Ver botonAddToCart() {
		return new HU8Ver();
	}

}
