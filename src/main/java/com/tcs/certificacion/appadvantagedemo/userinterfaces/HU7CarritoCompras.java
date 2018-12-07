package com.tcs.certificacion.appadvantagedemo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HU7CarritoCompras {
	
	public static final Target IMAGEN = Target.the("Imagen del producto")
			.locatedBy("(//img[@class='imageUrl'])[1]");
	public static final Target NOMBRE_PRODUCTO = Target.the("Nombre del producto")
			.locatedBy("(//h3[@class='ng-binding'])[1]");
	public static final Target CANTIDAD = Target.the("Cantidad")
			.locatedBy("(//label[@class='ng-binding'])[1]");
	public static final Target BTN_CHECKOUT = Target.the("Boton checkout")
			.locatedBy("//button[@id='checkOutButton']");
	public static final Target EDIT = Target.the("Link de editar")
			.locatedBy("//a[@translate='Edit_shipping_Details']");
	public static final Target BTN_NEXT = Target.the("Boton next")
			.locatedBy("//button[@id='next_btnundefined']");
	public static final Target NEXT_BTN = Target.the("Proximo")
			.locatedBy("//button[@id='next_btn']");
	public static final Target MENSAJE_METODO_PAGO = Target.the("Mensaje metodo pago")
			.locatedBy("//label[@class='Choose_payment roboto-medium ng-scope']");
	
	//campos a editar
	public static final Target NOMBRE = Target.the("Primer nombre")
			.locatedBy("//input[@name='first_name']");
	public static final Target APELLIDO = Target.the("Apellido")
			.locatedBy("//input[@name='last_name']");
	public static final Target NUMERO_CELULAR = Target.the("Telefono celular")
			.locatedBy("//input[@name='phone_number']");
	public static final Target CIUDAD = Target.the("Ciudad")
			.locatedBy("//input[@name='city']");
	public static final Target DIRECCION = Target.the("Direccion")
			.locatedBy("//input[@name='address']");
	public static final Target REGION = Target.the("Region")
			.locatedBy("//input[@name='state_/_province_/_region']");
	public static final Target CODIGO_POSTAL  = Target.the("Codigo postal")
			.locatedBy("//input[@name='postal_code']");
	
	//pagar -Safepay
	public static final Target METODO_PAGO = Target.the("Metodo de pago")
			.locatedBy("//input[@name='{0}']");
	public static final Target USERNAME_SAFEPAY = Target.the("Nombre de usuario Safepay")
			.locatedBy("//input[@name='safepay_username']");
	public static final Target PASSWORD_SAFEPAY = Target.the("Contrasenia Safepay")
			.locatedBy("//input[@name='safepay_password']");
	public static final Target BTN_PAY_NOW = Target.the("Boton de Pay Now")
			.locatedBy("//button[@id='pay_now_btn_SAFEPAY']");
	public static final Target MENSAJE_DE_COMPRA = Target.the("Mensaje de gracias por su compra")
			.locatedBy("//span[@translate='Thank_you_for_buying_with_Advantage']");
	
	//Pagar master credit
	public static final Target EDITAR_TARJETA = Target.the("Editar tarjeta")
			.locatedBy("//label[@class='edit  ng-scope']");
	public static final Target NUMERO_TARJETA = Target.the("Numero trajeta")
			.locatedBy("//input[@name='card_number']");
	public static final Target CLAVE = Target.the("Clave")
			.locatedBy("//input[@name='cvv_number']");
	public static final Target MES = Target.the("Mes")
			.locatedBy("//select[@name='mmListbox']//option[contains(text(),'{0}')]");
	public static final Target ANIO = Target.the("Anio")
			.locatedBy("//select[@name='yyyyListbox']//option[contains(text(),'{0}')]");
	public static final Target TITULAR_TARJETA = Target.the("Titular tarjeta")
			.locatedBy("//input[@name='cardholder_name']");
	public static final Target BTN_PAY_NOW_M = Target.the("Boton de Pay Now")
			.locatedBy("//button[@id='pay_now_btn_ManualPayment']");
}
