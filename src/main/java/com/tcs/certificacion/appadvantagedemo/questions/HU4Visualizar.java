package com.tcs.certificacion.appadvantagedemo.questions;

import com.tcs.certificacion.appadvantagedemo.userinterfaces.HU4Productos;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class HU4Visualizar implements Question<Boolean>{

	@Override
	public Boolean answeredBy(Actor actor) {
		return HU4Productos.VISTA_PRODUCTO.resolveFor(actor).isVisible();
	}
	
	public static HU4Visualizar producto() {
		return new HU4Visualizar();
	}

}
