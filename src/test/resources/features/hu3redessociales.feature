@Redes_Sociales
Feature: Redes sociales
  Yo como mercadista de DEMO
  Necesito que en la parte inferior de la pagina web aparezcan los link de redes sociales
  Para que el usuario tenga la opcion de seguirnos en las diferentes redes sociales

  @Linkedin
  Scenario: Linkedin
    Given que el usuario se encuentra en la pagina inicial de DEMO
    When el seleccion la red social Linkedin
    Then se redireccionara a la url de la pagina Linkedin
       | url | https://www.linkedin.com/showcase/micro-focus-software |
  
  @Facebook
  Scenario: Facebook
    Given que el usuario se encuentra en la pagina inicial de DEMO
    When el seleccion la red social Facebook
    Then se redireccionara a la url de la pagina Facebook
       | url | https://www.facebook.com/pages/HP-Application-Lifecycle-Management/142893435778219?fref=ts |
  
  @Twitter
  Scenario: Twitter
    Given que el usuario se encuentra en la pagina inicial de DEMO
    When el seleccion la red social Twitter
    Then se redireccionara a la url de la pagina Twitter
       | url | https://twitter.com/search?q=HPE_ALM |   