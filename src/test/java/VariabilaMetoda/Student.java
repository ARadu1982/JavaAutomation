package VariabilaMetoda;

import com.google.errorprone.annotations.Var;
import org.testng.annotations.Test;

public class Student {

    public String Nume;

    public String Prenume;

    public Integer Varsta;

    public String Adresa;

    public Double Inaltime;

    public Float Greutate;

    public char Sex;

    public boolean AreDiploma;

    //metoda = actiunea unei clase

    // exista 2 tipuri de metode: void si return

    @Test
    public void prezentareStudent(){
        Nume = "Amaritei";
        Prenume = "Radu";
        Varsta = 42;
        Adresa = "Titan";
        Inaltime = 1.7;
        Greutate = 68.00f;
        Sex = 'M';
        AreDiploma = true;

//        System.out.println(Nume+" "+Prenume+" "+Varsta+" "+Adresa);
//        System.out.println(Inaltime);
        System.out.println("Numele studentului este: "+Nume);
        System.out.println("Prenume studentului este: "+Prenume);
        System.out.println("Varsta studentului este: "+Varsta);
        System.out.println("Adresa studentului este: "+Adresa);
        System.out.println("Inaltimea studentului este: "+Inaltime);
        System.out.println("Greutatea studentului este: "+Greutate);
        System.out.println("Sexul studentului este: "+Sex);
        System.out.println("Are studentul diploma? "+AreDiploma);

        calculMedie();
        System.out.println(getSalariu());

    }

    public void calculMedie(){
        Integer nota1 = 8;
        Integer nota2 = 9;
        Integer nota3 = 7;

        Integer medie = (nota1 + nota2 +nota3) / 3;

        System.out.println("Media studentului este "+medie);
    }

    //metoda cu return
    public Integer getSalariu(){
        Integer Salariu = 5000;
        return Salariu;
    }
}
