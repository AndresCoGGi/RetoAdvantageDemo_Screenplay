package com.tcs.certificacion.appadvantagedemo.tasks;

import org.openqa.selenium.Keys;

import com.tcs.certificacion.appadvantagedemo.models.HU2NombreCampos;
import com.tcs.certificacion.appadvantagedemo.userinterfaces.HU2CreacionUsuario;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

public class HU2Validar implements Task{
	
	private String valor;
	private String nombreCampo;
	
	public HU2Validar(String valor) {
		this.valor = valor;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(valor)
				                .into(HU2CreacionUsuario.CAMPO
				                   .of(HU2NombreCampos.devolverNombreCampo(nombreCampo)))
				                       .thenHit(Keys.TAB));
	}
	
	public static HU2Validar conValor(String valor) {
		return Tasks.instrumented(HU2Validar.class, valor);
	}
	
	public HU2Validar yEnElCampo(String nombreCampo) {
		this.nombreCampo = nombreCampo;
		return this;
	}

}
