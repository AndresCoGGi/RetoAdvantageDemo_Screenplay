@Comprar_productos
Feature: Comprar productos
  Yo como usuario del portal DEMO
  Necesito realizar la compra en linea de productos de tecnologia
  Para seleccionar articulos de tecnologia de la pagina, realizando el pago en linea
  
  @Canasto
  Scenario Outline: Verificar canasto
   Given que el usuario a seleccionado un producto <nombreProducto> de la categoria <categoria>
   When el ingresa al canasto de compras
   Then el podra ver el detalle del producto
    | NombreProducto       | Cantidad  | Color  | Precio  |
    | <nombreProducto>     | <cantidad>| <color>| <precio>|   
    
    Examples:
    | categoria | nombreProducto      | cantidad | color | precio |
    | tablets   | HP Pro Tablet 608 G1|    1     | BLACK | 479.00 |     
    
  @Editar_Campos
  Scenario: Editar Campos
     Given que el usuario se encuentra logueado en la pagina de DEMO
       | username   | password|
       | andrescogi | Abc123  |
     And con un producto agregado
       | Categoria     | tablets                   |
       | nombreProducto| HP Elite x2 1011 G1 Tablet|
     And en la vista ORDER PAYMENT
     When el edite los campos de Shipping details
       | phoneNumber | City     | address            | region    | postalCode | 
       |  3104567812 | Cali     | calle 21 Nro 23-88 | Antioquia |         50 | 
     Then el vera la pestaña de metodo de pago con el mensaje Choose payment method below
     
    @Pago_con_SafePay
    Scenario:  Pagar con Safepay
      	Given que el usuario se encuentra logueado en la pagina de DEMO
          | username   | password|
          | andrescogi | Abc123  |
         And con un producto agregado
          | Categoria     | tablets                   |
          | nombreProducto| HP Elite x2 1011 G1 Tablet|
         And el esta en la vista de PAYMENT METHOD
         When el diligencia los datos 
          | metodoDePago | safepay    | 
          | username     | andrescogi |
          | password     | Abc123     |
         Then el podra ver el mensaje Thank you for buying with Advantage
         
     @Pago_MasterCredit
     Scenario:  Pagar con Master Credit
      	Given que el usuario se encuentra logueado en la pagina de DEMO
          | username   | password|
          | andrescogi | Abc123  |
         And con un producto agregado
          | Categoria     | tablets                   |
          | nombreProducto| HP Elite x2 1011 G1 Tablet|
         And el esta en la vista de PAYMENT METHOD
         When el edita los datos 
          | metodoDePago   | masterCredit | 
          | cardNumber     | 234567891234 | 
          | cvvNumber      | 234          |
          | Month          | 08           |
          | Year           | 2020         |
          | cardHolderName | Andres       |
         Then el podra ver el mensaje Thank you for buying with Advantage  
  
     
       
     
       