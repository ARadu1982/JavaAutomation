package OOP.Session20.StaticExamples;

public class StaticAccessModifier {

    // Static:
    // Un modificator static poate fi aplicat la nivel de variabila, metoda, bloc de initializare, la inner class sau la inner interface
    // O proprietate/metoda statica se poate apela prin numele clasei de exemplu: NumeleClasei.field, NumeleClasei.metoda
    // eficientizeaza folosirea memoriei

    static String name = "ENDAVA";

    public static void printMessage(){
        System.out.println("Printeaza metoda");
    }


}
