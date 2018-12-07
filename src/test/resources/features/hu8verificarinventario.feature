@Verificacion_inventario
Feature: Verificacion inventario
  Yo como usuario del portal DEMO
  Necesito visualizar el estado de un articulo segun su inventario
  Para que el usuario no tenga opcion de comprar lo que no esta disponible
  
    
  @Maximo_inventario
  Scenario: Mensaje de productos agregados
    Given que el usuario haya seleccionado un producto
        | Categoria     | tablets                   |
        | nombreProducto| HP Elite x2 1011 G1 Tablet|
    When el ingrese una cantidad mayor a la disponible
        | cantidad | 99 |  
    Then el vera un mensaje Oops! We only have 10 in stock. We updated your order accordingly
    
  @Maximo_inventario_carrito
  Scenario: Agregados al carrito 
    Given que el usuario haya seleccionado un producto
        | Categoria     | tablets                   |
        | nombreProducto| HP Elite x2 1011 G1 Tablet|
    When el ingrese una cantidad mayor a la disponible
        | cantidad | 99 |  
    Then el vera agregados solo los productos disponibles
        | cantidadEsperada | 10 |
        
   @Disponibilidad
   Scenario: No agregar producto no disponibles
     Given que el usuario haya seleccionado un producto que no tenga disponiblidad
        | Categoria     | headphones                                      |
        | nombreProducto| Bose SoundLink Around-ear Wireless Headphones II|
     Then el boton de agregar al canasto aparece no disponible
      
     
     
   