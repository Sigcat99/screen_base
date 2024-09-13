package co.com.sig.runners.demonblaze;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity .class) //-> Para trabajar con Cucumber y Serenity
@CucumberOptions(
        features = "src/test/resources/features/demoblaze",
        glue = "co.com.sig.stepdefinitions", //Screenplay
        snippets = CucumberOptions.SnippetType.CAMELCASE, //navegarPaginaWeb
        plugin = "pretty"
        //       tags = "@InicioSesionExitoso"
)
public class DaemonBlazeRunner {
}


