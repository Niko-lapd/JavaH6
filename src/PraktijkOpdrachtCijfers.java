import java.applet.Applet;
import java.awt.*;

public class PraktijkOpdrachtCijfers extends Applet {

    double a;
    double b;
    double c;
    double resultaat;

    public void init(){

        a = 5.9;
        b = 6.3;
        c = 6.9;
        resultaat = (a + b + c) / 3;
        resultaat = resultaat * 10;
        resultaat = (int) resultaat;
        resultaat = resultaat / 10;

    }

    public void paint(Graphics graphics){

        graphics.drawString("Het gemiddlede is: " + resultaat,20,20);

    }


}
