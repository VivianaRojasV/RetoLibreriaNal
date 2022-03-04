#language: es

Característica: Cerrar sesion
  Antecedentes:

    Dado que el usuario se encuentra en la pagina principal
    Cuando da en el boton de inicio sesion
    Y escribe las credenciales

  @Cerrar

  Escenario: Cerrar sesion
    Cuando  selecciono el boton cerrar sesion
    Entonces cierro sesion exitosamente




