package com.tcs.certificacion.appadvantagedemo.models;

public class HU2NombreCampos {

	public static String devolverNombreCampo(String nombreCampo) {

		switch (nombreCampo) {
		case "username":
			return "usernameRegisterPage";
		case "email":
			return "emailRegisterPage";
		case "password":
			return "passwordRegisterPage";
		case "confirm_password":
			return "confirm_passwordRegisterPage";
		case "first_name":
			return "first_nameRegisterPage";
		case "last_name":
			return "last_nameRegisterPage";
		case "phone_number":
			return "phone_numberRegisterPage";
		case "city":
			return "cityRegisterPage";
		case "address":
			return "addressRegisterPage";
		case "region":
			return "state_/_province_/_regionRegisterPage";
		case "postal_code":
			return "postal_codeRegisterPage";
		default:
			return "";
		}
	}

}
