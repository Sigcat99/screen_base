# author: stivensIbarra
# date: 12/03/202
# language: es

Característica: Añadir productos al carrito
  Yo como analista
  necesito añadir productos al carro de compras
  para validar el carrito de compras  .




  #@InicioSesionExitoso
  Escenario: Añadir productos al Carrito
    Dado que el usuario desea navegar a la pagina "https://www.demoblaze.com/"
    Cuando agregra un producto
    Entonces deberia ir al carrito y ver el procuto agregado



