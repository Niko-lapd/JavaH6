import java.applet.*;
import java.awt.*;

public class tijdBerekening extends Applet {

    int a;
    int b;
    int c;
    int d;
    int e;
    int f;
    int uitkomst1;
    int uitkomst2;
    int uitkomst3;

    public void init() {

        a = 1;
        b = 60;
        c = 60;
        d = 24;
        e = 7;
        f = 51;
        uitkomst1 = (a * b) * c;
        uitkomst2 = (a * b) * (c * d);
        uitkomst3 = (a * b) * (c * d) * (e * f);

    }

    public void paint(Graphics graphics) {

        graphics.drawString("De hoeveelheid seconden in een uur zijn: " + uitkomst1, 20, 20);
        graphics.drawString("De hoeveelheid seoncden in een dag zijn: " + uitkomst2, 20, 40);
        graphics.drawString("De hoeveelheid seconden in een jaar zijn: " + uitkomst3, 20, 60);
    }
}
