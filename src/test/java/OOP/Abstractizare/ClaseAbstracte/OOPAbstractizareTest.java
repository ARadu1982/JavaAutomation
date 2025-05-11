package OOP.Abstractizare.ClaseAbstracte;

import org.testng.annotations.Test;

public class OOPAbstractizareTest {

    @Test
    public void metodaTest(){

        Cerc formaCerc = new Cerc();
        Patrat formaPatrat = new Patrat();

        formaCerc.setRaza(12);
        formaCerc.calculeazaAria();

        formaPatrat.setLatura(4);
        formaPatrat.calculeazaAria();

        // Tema
        // Abstractizare clasa animale cu metoda de sunet ... fiecare animal scoate un sunet specific

    }

}
