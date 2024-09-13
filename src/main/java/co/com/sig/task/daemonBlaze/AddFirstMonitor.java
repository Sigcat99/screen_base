package co.com.sig.task.daemonBlaze;

import co.com.sig.userinterface.daemonBlaze.Carview;
import co.com.sig.userinterface.daemonBlaze.DaemonBlazeHome;
import co.com.sig.userinterface.daemonBlaze.Producview;
import co.com.sig.util.Utils;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.Duration;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AddFirstMonitor implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DaemonBlazeHome.BTN_MONITOR.waitingForNoMoreThan(Duration.ofSeconds(5))),
                WaitUntil.the(DaemonBlazeHome.PRIMER_ELEMENTO,isVisible()).forNoMoreThan(10).seconds(),
                Click.on(DaemonBlazeHome.PRIMER_ELEMENTO.waitingForNoMoreThan(Duration.ofSeconds(5))),
                Click.on(Producview.BTN_ADD_CARRITO.waitingForNoMoreThan(Duration.ofSeconds(5)))

        );
        Utils.pressEnter();
    }
    public static AddFirstMonitor in() {
        return Tasks.instrumented(AddFirstMonitor.class);
    }
}
