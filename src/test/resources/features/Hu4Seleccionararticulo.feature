@Seleccionar_producto
Feature: Seleccionar productos
  Yo como administrador del portal DEMO
  Necesito realizar la seleccion en linea de productos de tecnologia
  Para seleccionar articulos de tecnolologia en linea para adicionar al canasto y luego realizar el pago
  

   @Categoria
   Scenario Outline: Seleccionar categoria
    Given que el administrador se encuentra en la pagina principal de DEMO
    When el selecciona una categoria 
      | Categoria | <categoria> |
    Then el podra ver el boton BUY NOW
    
    Examples:
    | categoria |
    | tablets   |
    | laptops   |
    
    @Producto
    Scenario: Seleccionar producto
     Given que el administrador ya selecciono una categoria
      | Categoria | tablets |
     When el selecciona un producto
      | nombreProducto             |
      | HP Elite x2 1011 G1 Tablet |
     Then el podra ver la imagen del producto en sus diferentes angulos
     
    @Color
    Scenario: Seleccionar color
     Given que el administrador ya selecciono un producto
      | Categoria     | tablets                   |
      | nombreProducto| HP Elite x2 1011 G1 Tablet|
     When el selecciona un color
      | color|
      | GRAY |
     Then el podra ver el color seleccionado
      | colorResultante| GRAY |
       
      @Seccion_especificacion 
      Scenario: Seccion especificaciones
       Given que el administrador ya selecciono un producto
        | Categoria     | tablets                   |
        | nombreProducto| HP Elite x2 1011 G1 Tablet|
       Then el podra ver una seccion llamada PRODUCT SPECIFICATIONS
       
      @ADD_TO_CART
      Scenario: Boton ADD TO CART
       Given que el administrador ya selecciono un producto
        | Categoria     | tablets                   |
        | nombreProducto| HP Elite x2 1011 G1 Tablet|
       Then el podra visualizar el boton ADD TO CART 
       
      @Cantidad
      Scenario: Cantidad articulos
       Given que el administrador ya selecciono un producto
        | Categoria     | tablets                   |
        | nombreProducto| HP Elite x2 1011 G1 Tablet|
       When el aumenta la cantidad de productos
        | Cantidad |
        |    3     |
       Then el vera el contador aumentado 
        | CantidadEsperada| 3 | 
      
      
      
      
        
      
      
    