#language: es

Característica: Busqueda de tema
  Antecedentes:

Dado que el usuario se encuentra en la pagina principal
Cuando da en el boton de inicio sesion
Y escribe las credenciales

@Busqueda

  Escenario: Realizar busqueda de libro
  Cuando  digito el nombre del libro

  Entonces encuentra el libro exitosamente
