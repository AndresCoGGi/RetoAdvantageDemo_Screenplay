package com.tcs.certificacion.appadvantagedemo.questions;

import com.tcs.certificacion.appadvantagedemo.userinterfaces.HU4Productos;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;


public class HU4ObtenerCantidad implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		return HU4Productos.CANTIDAD.resolveFor(actor).getTextValue();
	}
	
	public static HU4ObtenerCantidad deProductos() {
		return new HU4ObtenerCantidad();
	}

}
