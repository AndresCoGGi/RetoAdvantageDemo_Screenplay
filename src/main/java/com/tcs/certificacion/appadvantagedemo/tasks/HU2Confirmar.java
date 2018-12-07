package com.tcs.certificacion.appadvantagedemo.tasks;

import org.openqa.selenium.Keys;

import com.tcs.certificacion.appadvantagedemo.userinterfaces.HU2CreacionUsuario;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

public class HU2Confirmar implements Task{
	
	private String password;
	private String confirm_Password;

	public HU2Confirmar(String password) {
		this.password = password;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(password).into(HU2CreacionUsuario.CLAVE),
							Enter.theValue(confirm_Password).into(HU2CreacionUsuario.CONFIRMAR_CLAVE).thenHit(Keys.TAB));
		
	}
	
	public static HU2Confirmar conPassword(String password) {
		return Tasks.instrumented(HU2Confirmar.class, password);
	}
	
	public HU2Confirmar yConConfirmPassword(String confirm_password) {
		this.confirm_Password = confirm_password;
		return this;
	}

}
