package com.tcs.certificacion.appadvantagedemo.questions;

import com.tcs.certificacion.appadvantagedemo.userinterfaces.HU2CreacionUsuario;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class HU2ValidarBotonRegister implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		WebElementFacade elemento= HU2CreacionUsuario.BTN_REGISTRO.resolveFor(actor);
		if (elemento.isEnabled()) {
			return "Habilitado";
		}else {
			return "Desahabilitado";
		}
	}
	
	public static HU2ValidarBotonRegister deshabilitado() {
		return new HU2ValidarBotonRegister();
	}

}
