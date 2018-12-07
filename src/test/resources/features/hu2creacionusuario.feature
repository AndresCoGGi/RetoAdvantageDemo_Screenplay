@Creacion_usuarios_nuevos
Feature: Creacion de usuarios nuevos
  Yo como administrador del portal DEMO
  Necesito la creacion de la cuenta de nuevos usuarios 
  Para la fidelizacion de los clientes y que estos puedan hacer sus compras online

  @Registro_exitoso
  Scenario: Registro exitoso
    Given que el administrador se encuentra en la pantalla Create Account
    When el diligencia los datos del formulario
      | username | email              | password | confirmPassword | firstName | lastName | phoneNumber | Country  | City | address            | region    | postalCode | iAgree |
      | ANDEWS10 | tan458@hotmail.com | AbC12385 | AbC12385        | Daniel    | Nelson   |  3104567812 | Colombia | Cali | calle 21 Nro 23-88 | Antioquia |         50 | si     |
    Then el se redirecciona a la pagina principal con su nombre de usuario
      | usernameResult |
      | ANDEWS10       |

  @Obligatoriedad_Username
  Scenario: Obligatoriedad username
    Given que el administrador se encuentra en la pantalla Create Account
    When el diligencia los datos del formulario exceptuando el campo username
      | username | email              | password | confirmPassword | firstName | lastName | phoneNumber | Country  | City | address            | region    | postalCode | iAgree |
      |          | tan458@hotmail.com | AbC12385 | AbC12385        | Daniel    | Nelson   |  3104567812 | Colombia | Cali | calle 21 Nro 23-88 | Antioquia |         50 | si     |
    Then el boton de Register se encuentra Desahabilitado

  @Obligatoriedad_Email
  Scenario: Obligatoriedad Email
    Given que el administrador se encuentra en la pantalla Create Account
    When el diligencia los datos del formulario exceptuando el campo Email
      | username | email | password | confirmPassword | firstName | lastName | phoneNumber | Country  | City | address            | region    | postalCode | iAgree |
      | tan4568  |       | AbC12385 | AbC12385        | Daniel    | Nelson   |  3104567812 | Colombia | Cali | calle 21 Nro 23-88 | Antioquia |         50 | si     |
    Then el boton de Register se encuentra Desahabilitado

  @Obligatoriedad_Password
  Scenario: Obligatoriedad Password
    Given que el administrador se encuentra en la pantalla Create Account
    When el diligencia los datos del formulario exceptuando el campo password
      | username | email        | password | confirmPassword | firstName | lastName | phoneNumber | Country  | City | address            | region    | postalCode | iAgree |
      | tan4568  | ftt@237h.com |          | AbC12385        | Daniel    | Nelson   |  3104567812 | Colombia | Cali | calle 21 Nro 23-88 | Antioquia |         50 | si     |
    Then el boton de Register se encuentra Desahabilitado

  @Obligatoriedad_IAgree
  Scenario: Obligatoriedad IAgree
    Given que el administrador se encuentra en la pantalla Create Account
    When el diligencia los datos del formulario exceptuando el campo IAgree
      | username | email        | password | confirmPassword | firstName | lastName | phoneNumber | Country  | City | address            | region    | postalCode | iAgree |
      | tan4568  | ftt@237h.com | AbC12385 | AbC12385        | Daniel    | Nelson   |  3104567812 | Colombia | Cali | calle 21 Nro 23-88 | Antioquia |         50 | no     |
    Then el boton de Register se encuentra Desahabilitado

  @Longitud_campo_username
  Scenario Outline: Longitud Campo Username
    Given que el administrador se encuentra en la pantalla Create Account
    When el diligencia el campo username con una longitud invalida
      | Username | <username> |
      | Campo    | <campo>    |
    Then se muestra un mensaje de error
      | Mensaje | <mensaje> |

    Examples: 
      | username                   | campo    | mensaje                   |
      | asdfgetcfe4567ftyu6A456567 | username | Use maximum 15 character  |
      | sda                        | username | Use 4 character or longer |

  @Longitud_campo_email
  Scenario Outline: Longitud Campo Email
    Given que el administrador se encuentra en la pantalla Create Account
    When el diligencia el campo Email con una longitud invalida
      | Email | <email> |
      | Campo | <campo> |
    Then se muestra un mensaje de error
      | Mensaje | <mensaje> |

    Examples: 
      | email                    | campo | mensaje                  |
      | andres199410@hotmail.com | email | Use maximum 15 character |

  @Longitud_campo_password
  Scenario Outline: Longitud Campo Password
    Given que el administrador se encuentra en la pantalla Create Account
    When el diligencia el campo Password con una longitud invalida
      | Password | <password> |
      | Campo    | <campo>    |
    Then se muestra un mensaje de error
      | Mensaje | <mensaje> |

    Examples: 
      | password      | campo    | mensaje                   |
      | Abc151234243s | password | Use maximum 12 character  |
      | sda           | password | Use 4 character or longer |

  @confirm_password
  Scenario Outline: Contraseñas no coinciden
    Given que el administrador se encuentra en la pantalla Create Account
    When el diligencia el campo Password y Confirm Password que no coinciden
      | Password         | <password>         |
      | Confirm Password | <confirm_password> |
    Then se muestra un mensaje de error
      | Mensaje | <mensaje> |

    Examples: 
      | password | confirm_password | mensaje                |
      | Abc151   | Abc150           | Passwords do not match |

  @Longitud_Primer_Nombre
  Scenario Outline: Longitud Campo First Name
    Given que el administrador se encuentra en la pantalla Create Account
    When el diligencia el campo First Name con una longitud invalida
      | First Name | <first_name> |
      | Campo      | <campo>      |
    Then se muestra un mensaje de error
      | Mensaje | <mensaje> |

    Examples: 
      | first_name                         | campo      | mensaje                   |
      | Abcdfghjlkhjyrvfddfgt56tgfghjhjmyh | first_name | Use maximum 30 character  |
      | s                                  | first_name | Use 2 character or longer |

  @Longitud_campo_last_name
  Scenario Outline: Longitud Campo Last Name
    Given que el administrador se encuentra en la pantalla Create Account
    When el diligencia el campo Last Name con una longitud invalida
      | Last Name | <last_name> |
      | Campo     | <campo>     |
    Then se muestra un mensaje de error
      | Mensaje | <mensaje> |

    Examples: 
      | last_name                          | campo     | mensaje                   |
      | Abcdfghjlkhjyrvfddfgt56tgfghjhjmyh | last_name | Use maximum 30 character  |
      | s                                  | last_name | Use 2 character or longer |

  @Longitud_campo_Phone_number
  Scenario Outline: Longitud Campo Phone Number
    Given que el administrador se encuentra en la pantalla Create Account
    When el diligencia el campo Phone Number con una longitud invalida
      | Phone Name | <phone_number> |
      | Campo      | <campo>        |
    Then se muestra un mensaje de error
      | Mensaje | <mensaje> |

    Examples: 
      | phone_number          | campo        | mensaje                  |
      | 312345645676754323454 | phone_number | Use maximum 20 character |

  @Longitud_campo_city
  Scenario Outline: Longitud Campo City
    Given que el administrador se encuentra en la pantalla Create Account
    When el diligencia el campo City con una longitud invalida
      | City  | <city>  |
      | Campo | <campo> |
    Then se muestra un mensaje de error
      | Mensaje | <mensaje> |

    Examples: 
      | city                        | campo | mensaje                  |
      | Medellinqqwertyuiolkjhygftd | city  | Use maximum 25 character |

  @Longitud_campo_address
  Scenario Outline: Longitud Campo Address
    Given que el administrador se encuentra en la pantalla Create Account
    When el diligencia el campo Address con una longitud invalida
      | Address | <address> |
      | Campo   | <campo>   |
    Then se muestra un mensaje de error
      | Mensaje | <mensaje> |

    Examples: 
      | address                                                  | campo   | mensaje                  |
      | Medellinqqwertyuiolkjhygftdtfsfdcfstyiejskskskjxjmskckjs | address | Use maximum 50 character |

  @Longitud_campo_region
  Scenario Outline: Longitud Campo Region
    Given que el administrador se encuentra en la pantalla Create Account
    When el diligencia el campo Region con una longitud invalida
      | Region | <region> |
      | Campo  | <campo>  |
    Then se muestra un mensaje de error
      | Mensaje | <mensaje> |

    Examples: 
      | region                      | campo  | mensaje                  |
      | MedellinTolimaIbagueAntioqi | region | Use maximum 10 character |

  @Longitud_campo_postal_code
  Scenario Outline: Longitud Campo Postal Code
    Given que el administrador se encuentra en la pantalla Create Account
    When el diligencia el campo Postal Code con una longitud invalida
      | Postal Code | <postalCode> |
      | Campo       | <campo>      |
    Then se muestra un mensaje de error
      | Mensaje | <mensaje> |

    Examples: 
      | postalCode                  | campo       | mensaje                  |
      | MedellinTolimaIbagueAntioqi | postal_code | Use maximum 10 character |

  @Formato_correo
  Scenario Outline: Formato Email
    Given que el administrador se encuentra en la pantalla Create Account
    When el diligencia un email que no cumple con el formato
      | Email | <email> |
      | Campo | <campo> |
    Then se muestra un mensaje de error
      | Mensaje | <mensaje> |

    Examples: 
      | email    | campo | mensaje                                      |
      | tsrwrqr6 | email | Your email address isn't formatted correctly |

  @Formato_contrasenia
  Scenario Outline: formato Password
    Given que el administrador se encuentra en la pantalla Create Account
    When el diligencia una Password que no cumple con el formato
      | Password | <password> |
      | Campo    | <campo>    |
    Then se muestra un mensaje de error
      | Mensaje | <mensaje> |

    Examples: 
      | password | campo    | mensaje                   |
      | tsrwrqr6 | password | One upper letter required |
      | ABSASS5  | password | One lower letter required |
      | dftrA    | password | One number required       |
      | Afrd56   | password | One special characters    |

  @Secciones
  Scenario: Division de tres secciones
    Given que el administrador se encuentra en la pantalla Create Account
    Then el podra ver el formulario dividido en tres secciones
      | seccion1 | ACCOUNT DETAILS  |
      | seccion2 | PERSONAL DETAILS |
      | seccion3 | ADDRESS          |
