package VariabilaMetoda;

import java.util.Scanner;

public class StructuriRepetitive {

    public static void main(String[] args)
    {
//        citireNote();
//        printareValoriWhile();
//        printareValoriDoWhile();
        printareValoriFor();
    }


    public static void citireNote(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu o nota:");
        int nota = scanner.nextInt();

        while (nota <0 || nota >10)
        {
            System.out.println("Ai ales "+nota+". Nota trebuie sa fie intre 1 si 10. Introdu o valoare valida!");
            nota = scanner.nextInt();
        }

        System.out.println("Nota "+nota+" este valida!");
    }

    public static void printareValoriWhile(){
        int valoare = 6;

        while(valoare<=5){
            System.out.println("Valoare este: "+valoare);
            valoare++;
        }
        System.out.println("Valoarea variabilei dupa while: "+valoare);

    }

    public static void printareValoriDoWhile(){
        int valoare = 6;
        do{
            System.out.println("Valoare este: "+valoare);
            valoare++;
        }while (valoare <=5);
        System.out.println("Valoarea variabilei dupa do while: "+valoare);
    }

    public static void printareValoriFor(){
//        int valoare = 1;

        for(int valoare = 1;valoare<=5; valoare++){

            System.out.println("Valoarea este: "+valoare);
//            valoare++;

        }
    }
}
