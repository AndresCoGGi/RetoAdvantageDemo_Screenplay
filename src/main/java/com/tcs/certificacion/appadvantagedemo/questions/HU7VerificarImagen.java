package com.tcs.certificacion.appadvantagedemo.questions;

import com.tcs.certificacion.appadvantagedemo.userinterfaces.HU7CarritoCompras;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class HU7VerificarImagen implements Question<Boolean>{

	@Override
	public Boolean answeredBy(Actor actor) {
	   return HU7CarritoCompras.IMAGEN.resolveFor(actor).isVisible();
	}
	
	public static HU7VerificarImagen deProducto() {
		return new HU7VerificarImagen();
	}

}
