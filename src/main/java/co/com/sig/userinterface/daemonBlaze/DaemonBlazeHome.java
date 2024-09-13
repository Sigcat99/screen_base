package co.com.sig.userinterface.daemonBlaze;

import net.serenitybdd.screenplay.targets.Target;

public class DaemonBlazeHome {

    public static final Target   PRIMER_ELEMENTO = Target.the("Primer producto").locatedBy("//*[@class = 'col-lg-4 col-md-6 mb-4'][1]");
    public static final Target   BTN_MONITOR = Target.the("Btn productos monitor").locatedBy("//*[@id= 'itemc' and contains(text(),'Monitors')]");
    public static final Target   BTN_LAPTOP = Target.the("Btn productos laptop").locatedBy("//*[@id= 'itemc' and contains(text(),'Laptops')]");



}
