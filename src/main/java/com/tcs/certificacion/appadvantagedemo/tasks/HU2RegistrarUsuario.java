package com.tcs.certificacion.appadvantagedemo.tasks;

import com.tcs.certificacion.appadvantagedemo.interactions.HU2Aceptar;
import com.tcs.certificacion.appadvantagedemo.interactions.HU2ClickBoton;
import com.tcs.certificacion.appadvantagedemo.userinterfaces.HU2CreacionUsuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class HU2RegistrarUsuario implements Task {
	
	private String username;
	private String email;
	private String password;
	private String confirmPassword;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String country;
	private String city;
	private String address;
	private String region;
	private String postalCode;
	//private String receiveExclusive;
	private String iAgree;
	
	public HU2RegistrarUsuario(String username) {
		this.username = username;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(username).into(HU2CreacionUsuario.NOMBRE_USUARIO),
						 Enter.theValue(email).into(HU2CreacionUsuario.CORREO),
						 Enter.theValue(password).into(HU2CreacionUsuario.CLAVE),
						 Enter.theValue(confirmPassword).into(HU2CreacionUsuario.CONFIRMAR_CLAVE),
						 Enter.theValue(firstName).into(HU2CreacionUsuario.NOMBRE),
						 Enter.theValue(lastName).into(HU2CreacionUsuario.APELLIDO),
						 Enter.theValue(phoneNumber).into(HU2CreacionUsuario.NUMERO_CELULAR),
						 Click.on(HU2CreacionUsuario.PAIS.of(country)),
						 Enter.theValue(city).into(HU2CreacionUsuario.CIUDAD),
						 Enter.theValue(address).into(HU2CreacionUsuario.DIRECCION),
						 Enter.theValue(region).into(HU2CreacionUsuario.REGION),
						 Enter.theValue(postalCode).into(HU2CreacionUsuario.CODIGO_POSTAL),
						 HU2Aceptar.politicas(iAgree),
						 HU2ClickBoton.register()
						 );
	}
	
	public static HU2RegistrarUsuario conNombreUsuario(String username) {
		return Tasks.instrumented(HU2RegistrarUsuario.class, username);
	}
	
	public HU2RegistrarUsuario yConContrasenia(String password) {
		this.password  =password;
		return this;
	}
	
	public HU2RegistrarUsuario yConRepitaContrasenia(String confirmPassword) {
		this.confirmPassword = confirmPassword;
		return this;
	}
	
	public HU2RegistrarUsuario yConCorreo(String email) {
		this.email = email;
		return this;
	}
	
	public HU2RegistrarUsuario yConNombre(String firstName) {
		this.firstName = firstName;
		return this;
	}
	
	public HU2RegistrarUsuario yConApellido(String lastName) {
		this.lastName = lastName;
		return this;
	}
	
	public HU2RegistrarUsuario yConNumeroCelular(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		return this;
	}
	
	public HU2RegistrarUsuario yConPais(String country) {
		this.country = country;
		return this;
	}
	
	public HU2RegistrarUsuario yConCiudad(String city) {
		this.city = city;
		return this;
	}
	
	public HU2RegistrarUsuario yConDireccion(String address) {
		this.address = address;
		return this;
	}
	
	public HU2RegistrarUsuario yConRegion(String region) {
		this.region = region;
		return this;
	}
	
	public HU2RegistrarUsuario yConCodigoPostal(String postalCode) {
		this.postalCode = postalCode;
		return this;
	}
	
	/*public RegistrarUsuario yConRecibirNotificacion(String receiveExclusive) {
		this.receiveExclusive = receiveExclusive;
		return this;
	}*/
	
	public HU2RegistrarUsuario yConAceptarTerminos(String iAgree) {
		this.iAgree = iAgree;
		return this;
	}

}
