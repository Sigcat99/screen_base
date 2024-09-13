package co.com.sig.userinterface.daemonBlaze;

import net.serenitybdd.screenplay.targets.Target;

public class Carview {
    public static final Target BTN_CARRITO = Target.the("BOTON del carrito ").locatedBy("//*[@id= 'cartur']");
    public static final Target FIRST_ELEMENT_TABLE = Target.the("Primer elemento de la tabla ").locatedBy("//*[@class = 'success']");
    public static final Target BTN_DELETE_FIRST_ELEMENT = Target.the("BOTON DE ELIMINAR EL PRIMER ELEMENTO ").locatedBy("//*[@href='#' and contains(text(),'Delete') ][1]");

}

//*[@class = 'success']