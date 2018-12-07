package com.tcs.certificacion.appadvantagedemo.userinterfaces;
import net.serenitybdd.screenplay.targets.Target;

public class HU2CreacionUsuario{
	
	//ir hasta formualrio
	public static final Target BTN_USUARIO = Target.the("Boton de usuario")
			.locatedBy("//a[@icon-user-svg]");
	public static final Target CREAR_CUENTA = Target.the("Crear nueva cuenta")
			.locatedBy("//a[.='CREATE NEW ACCOUNT']");
   
	//formulario
	public static final Target NOMBRE_USUARIO = Target.the("Nombre de usuario")
			.locatedBy("//input[@name='usernameRegisterPage']");
	public static final Target CORREO = Target.the("Correo")
			.locatedBy("//input[@name='emailRegisterPage']");
	public static final Target CLAVE = Target.the("Contraseña")
			.locatedBy("//input[@name='passwordRegisterPage']");
	public static final Target CONFIRMAR_CLAVE = Target.the("Repetir contraseña")
			.locatedBy("//input[@name='confirm_passwordRegisterPage']");
	public static final Target NOMBRE = Target.the("Primer nombre")
			.locatedBy("//input[@name='first_nameRegisterPage']");
	public static final Target APELLIDO = Target.the("Apellido")
			.locatedBy("//input[@name='last_nameRegisterPage']");
	public static final Target NUMERO_CELULAR = Target.the("Telefono celular")
			.locatedBy("//input[@name='phone_numberRegisterPage']");
	public static final Target PAIS = Target.the("Pais")
			.locatedBy("//select[@name='countryListboxRegisterPage']//option[contains(text(),'{0}')]");
	public static final Target CIUDAD = Target.the("Ciudad")
			.locatedBy("//input[@name='cityRegisterPage']");
	public static final Target DIRECCION = Target.the("Direccion")
			.locatedBy("//input[@name='addressRegisterPage']");
	public static final Target REGION = Target.the("Region")
			.locatedBy("//input[@name='state_/_province_/_regionRegisterPage']");
	public static final Target CODIGO_POSTAL  = Target.the("Codigo postal")
			.locatedBy("//input[@name='postal_codeRegisterPage']");
	public static final Target RECIBIR_INFO = Target.the("Recibir informacion")
			.locatedBy("//input[@name='allowOffersPromotion']");
	public static final Target ACEPTAR_POLITICAS = Target.the("Aceptar politicas de privacidad")
			.locatedBy("//input[@name='i_agree']");
	public static final Target BTN_REGISTRO = Target.the("Boton registrar")
			.locatedBy("//button[@id='register_btnundefined']");
	public static final Target USERNAME_RESULTADO = Target.the("Usuario registrado")
			.locatedBy("//header//span[@data-ng-show='userCookie.response']");
	
    //xpath dinamico input
	public static final Target CAMPO = Target.the("campo")
			.locatedBy("//input[@name='{0}']");
	
	//mensajes error longitud
	public static final Target LONGITUD_INCORRECTA = Target.the("Longitud campo registrado")
			.locatedBy("//label[@class='animated invalid']");
	
	//secciones
	public static final Target SECCION_ONE = Target.the("Segmento uno")
			.locatedBy("//h3[@translate='ACCOUNT_DETAILS']");
	public static final Target SECCION_DOS = Target.the("Segmento dos")
			.locatedBy("//h3[@translate='PERSONAL_DETAILS']");
	public static final Target SECCION_TRES = Target.the("Segmento tres")
			.locatedBy("//h3[@translate='ADDRESS']");
	
}
