package OOP.Abstractizare.Interfete;

public interface FormeGeometrice {

    public static final String culoare = "verde"; // permite doar constante nu si variabile/fielduri care nu sunt initializate

    // toate metodele declarate intr-o intefata sunt by default abstracte
    // Nu sunt permise metode care implementeaza diverse actiuni

    void calculeazaAria();
    void deseneaza();


}
