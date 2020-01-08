import java.applet.Applet;
import java.awt.*;

public class PoisitiefNaarNegatief extends Applet {
    int a;
    int b;
    int uitkomst1;

    public void init() {

        a = 2147483647;
        b = 2147483647;
        uitkomst1 = (a + b);

    }

    public void paint(Graphics graphics) {

        graphics.drawString("Het resultaat van twee positieve getallen wat negatief worden zijn: " + uitkomst1, 20, 20);

    }

}
