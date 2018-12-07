package com.tcs.certificacion.appadvantagedemo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HU3HomePage {
	
	public static final Target RED_SOCIAL = Target.the("Link de redes sociales")
			.locatedBy("//img[@name='{0}']");
	
	public static final Target CATEGORIA = Target.the("Seleccionar categoria")
			.locatedBy("//div[@id='{0}Img']");
	
	public static final Target CANASTO = Target.the("Canasto de compras")
			.locatedBy("//a[@id='shoppingCartLink']");
	
	public static final Target USERNAME = Target.the("Nombre de usuario")
			.locatedBy("//input[@name='username']");
	
	public static final Target PASSWORD = Target.the("Contraseña")
			.locatedBy("//input[@name='password']");
	
	public static final Target BTN_INGRESAR = Target.the("Boton ingresar")
			.locatedBy("//button[@id='sign_in_btnundefined']");
	
}
