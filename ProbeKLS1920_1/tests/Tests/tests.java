package Tests;

import Rechner.Rechner;
import Rechner.RechnerImpl;
import Speicher.Speicher;
import Speicher.SpeicherImpl;
import org.junit.Assert;
import org.junit.Test;

public class tests {

    @Test
    public void goodAddition() {

        Rechner r = new RechnerImpl();
        Speicher s = new SpeicherImpl();

        int x = 1;
        int y = 13;

        int ergebnis = r.addiere(x);
        Assert.assertEquals(14, ergebnis);
    }

    @Test
    public void randAddiMax() {

        Rechner r = new RechnerImpl();
        Speicher s = new SpeicherImpl();

        int x = Integer.MAX_VALUE;
        int y = 0;

        int ergebnis = r.addiere(x);
        Assert.assertEquals(Integer.MAX_VALUE,  ergebnis);
    }

    @Test(expected = Exception.class)
    public void badAddition(){
        Rechner r = new RechnerImpl();
        Speicher s = new SpeicherImpl();

        int x = Integer.MAX_VALUE;
        int y = 0;

        int ergebnis = r.addiere(x);
        Assert.assertEquals(Integer.MAX_VALUE,  ergebnis);
    }
}
