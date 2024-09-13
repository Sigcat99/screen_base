package co.com.sig.stepdefinitions;

import co.com.sig.task.daemonBlaze.*;
import co.com.sig.userinterface.daemonBlaze.Carview;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.questions.Visibility;


public class deamonStepdefitions {
private Actor stivens;

    @Before
    public void setup() {

        OnStage.setTheStage(new OnlineCast());
        this.stivens= OnStage.theActorCalled("stivens");
    }




    @Dado("que el usuario desea navegar a la pagina {string}")
    public void queElUsuarioDeseaNavegarALaPagina(String url) {
        this.stivens.wasAbleTo(Open.url(url));
        //throw new io.cucumber.java.PendingException();
    }
    @Dado("agregra un producto")
    public void agregraUnProducto() {
        this.stivens.attemptsTo( AddFirtsProduct.in());

        // Write code here that turns the phrase above into concrete actions
       //  throw new io.cucumber.java.PendingException();
    }

    @Cuando("agregra un producto laptops")
    public void agregraUnProductoLaptops() {
        // Write code here that turns the phrase above into concrete actions
        this.stivens.attemptsTo(AddFirstLaptop.in());
    }

    @Dado("agregra un producto monitor")
    public void agregraUnProductoMonitor() {
        // Write code here that turns the phrase above into concrete actions
       this.stivens.attemptsTo((AddFirstMonitor.in()));
    }
    @Dado("deberia ir al carrito y ver el procuto agregado")
    public void deberiaIrAlCarritoYVerElProcutoAgregado() {
        this.stivens.attemptsTo(Cardshopping.in());
        stivens.asksFor(Visibility.of(Carview.FIRST_ELEMENT_TABLE));
        // Write code here that turns the phrase above into concrete actions

    }
    @Cuando("deberia ir al carrito")
    public void deberiaIrAlCarrito() {
        this.stivens.attemptsTo(Cardshopping.in());

    }
    @Dado("Deria Eliminar el producto")
    public void deriaEliminarElProducto() {
        // Write code here that turns the phrase above into concrete actions
        this.stivens.attemptsTo(DeleteFirstProduct.in());
        stivens.asksFor(Question.not(Visibility.of(Carview.FIRST_ELEMENT_TABLE)));
    }
}
