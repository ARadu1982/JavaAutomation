package OOP.Abstractizare.Interfete;
import org.testng.annotations.Test;

public class OOPAbstractizareTest {

    @Test
    public void metodaTest() {

        Cerc formaCerc = new Cerc();
        Patrat formaPatrat = new Patrat();

        formaCerc.setRaza(12);
        formaCerc.calculeazaAria();

        formaPatrat.setLatura(4);
        formaPatrat.calculeazaAria();


    }
}
