package com.tcs.certificacion.appadvantagedemo.tasks;

import com.tcs.certificacion.appadvantagedemo.userinterfaces.HU2CreacionUsuario;
import com.tcs.certificacion.appadvantagedemo.userinterfaces.HU3HomePage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class IniciarSesion implements Task {

	private String username;
	private String password;
	
	public IniciarSesion(String username) {
		this.username = username;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
         actor.attemptsTo(Click.on(HU2CreacionUsuario.BTN_USUARIO)
        		 		  ,Enter.theValue(username).into(HU3HomePage.USERNAME)
        		 		  ,Enter.theValue(password).into(HU3HomePage.PASSWORD)
        		 		  ,Click.on(HU3HomePage.BTN_INGRESAR));
         
	}
	
	public static IniciarSesion conUsername(String username) {
		return Tasks.instrumented(IniciarSesion.class, username);
	}
	
	public IniciarSesion yConPassword(String password) {
		this.password = password;
		return this;
	}

}
