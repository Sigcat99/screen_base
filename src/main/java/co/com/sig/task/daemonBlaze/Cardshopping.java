package co.com.sig.task.daemonBlaze;

import co.com.sig.userinterface.daemonBlaze.Carview;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;

import java.time.Duration;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Cardshopping implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(Carview.BTN_CARRITO,isVisible()).forNoMoreThan(10).seconds(),
                Click.on(Carview.BTN_CARRITO.waitingForNoMoreThan(Duration.ofSeconds(5))),
                WaitUntil.the(Carview.FIRST_ELEMENT_TABLE,isVisible()).forNoMoreThan(10).seconds()
                //WaitUntil.the(isVisible(By.xpath(Carview.FIRST_ELEMENT_TABLE)))

        );
    }
    public static Cardshopping in() {
        return Tasks.instrumented(Cardshopping.class);
    }
}
