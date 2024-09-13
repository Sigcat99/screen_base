package co.com.sig.util;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Utils {

    public static void   pressEnter(){
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_ENTER);
        }catch (AWTException e){}
    }

}
