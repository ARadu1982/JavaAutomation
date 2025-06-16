package OOP.Session20.StaticExamples.Example3;

public class AngajatTest {

    public static void main(String[] args) {

        System.out.println("Numar initial de angajati: "+AngajatEx3.numarAngajat);

        AngajatEx3 angajat = new AngajatEx3();
        angajat.numarAngajatFirma();

        AngajatEx3 angajat2 = new AngajatEx3();
        angajat2.numarAngajatFirma();

    }
}
