package Exceptii;

public class Exceptia1 {
    //Exceptiile reprezinta situatii care apar in timpul executiei unui program care determina oprirea acestuia

    // Ofera un mecanism eficient de identificare si rezolvare a erorilor

    // Sunt modelate sub forma de clase: class Error, exception, runtime exception, clase personalizate

    // exceptiile sunt gestionate folosind cuvinte predefinite in java: try catch si finally

    // sunt 2 tipuri de exceptii: checked si unchecked

    // erorile checked: sunt exceptii de compilare (nu se poate build sau rula proiectul).
    // Example: SQLException, IOException, ClassNotFoundException;

    // Erorile unchecked: sunt exceptii de runtime care sunt ignorate in timpul compilarii dar care sunt aruncate in timpul executiei programului
    // Ex: NullPointerException, ArrayIndexOutOfBound, ArithmeticException

    // throw : este un cuvant cheie care arunca exceptia in mod explicit de la o metoda sau un bloc de cod;

    // throws: este un cuvant cheie care se foloseste odata cu metoda care poate arunca un tip sau mai multe exceptii

public static void main(String[] args)  throws ExceptieCustom{

//    try {
//        System.out.println(12/0);
//    }catch (ArithmeticException e){
//        System.out.println("Error arithmetic exception thrown: "+e.getMessage());
//    }

    try {

        int[] numbers = new int[10];

        numbers[11] = 5;

        Thread.sleep(5000);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }catch (ArrayIndexOutOfBoundsException e){
//        System.out.println(e.getMessage());
        throw new ExceptieCustom("Eroare custom pt array index out of bound");
    }finally {
        System.out.println("Aceasta linie se executa indiferent daca exceptia este prinsa!");
    }

}

}
