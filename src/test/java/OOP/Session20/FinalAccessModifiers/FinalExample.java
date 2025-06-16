package OOP.Session20.FinalAccessModifiers;

public class FinalExample {

    // final keyword poate fi aplicat pentru outer class, variabile/field si metode
    // nu poate fi aplicat la interfete, constructori, blocuri si enum
    // final class nu poate fi extinsa/mostenita
    // final method nu poate fi suprascrisa
    // o variabila declarata si initializata final nu poate fi schimbata

    static final int A = 120;
    static final int ROTI_MASINA=4;

    public static void main(String[] args) {
        System.out.println("A = "+A);
//        A++;
    }
}
