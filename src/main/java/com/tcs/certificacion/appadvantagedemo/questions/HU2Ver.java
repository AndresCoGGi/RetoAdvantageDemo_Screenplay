package com.tcs.certificacion.appadvantagedemo.questions;

import com.tcs.certificacion.appadvantagedemo.userinterfaces.HU2CreacionUsuario;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class HU2Ver implements Question<String>{
	
	private String seccion;

	public HU2Ver(String seccion) {
		this.seccion = seccion;
	}
	
	@Override
	public String answeredBy(Actor actor) {
		if(seccion.equals("uno")) {
			return Text.of(HU2CreacionUsuario.SECCION_ONE).viewedBy(actor).asString();
		}else if(seccion.equals("dos")) {
			return Text.of(HU2CreacionUsuario.SECCION_DOS).viewedBy(actor).asString();
		}else {
			return Text.of(HU2CreacionUsuario.SECCION_TRES).viewedBy(actor).asString();
		}
		
	}
	
	public static HU2Ver seccion(String seccion) {
		return new HU2Ver(seccion);
	}
	


}
