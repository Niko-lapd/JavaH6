import java.applet.*;
import java.awt.*;

public class mensenBerekening extends Applet {

    int a;
    int b;
    int uitkomst;

    public void init() {
        a = 113;
        b = 4;
        uitkomst = a / b;

    }

    public void paint(Graphics graphics) {
        graphics.drawString("De uitkomst is: " + uitkomst, 20, 20);


    }

}
