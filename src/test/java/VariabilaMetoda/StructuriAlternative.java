package VariabilaMetoda;

import org.testng.annotations.Test;

public class StructuriAlternative {

    //structuri alternative = if-then-else;switch-case
    @Test
    public void metodaTest(){
        metodaVerificareNumar(7);
        metodaVerificareNumar(3);
        metodaVerificareNumar(5);
        metodaVerificareNumarParPozitiv(0);
        metodaVerificareNumarParPozitiv(4);
        metodaVerificareNumarParPozitiv(3);

    }

    //verifica un numar mai mare decat 5
    public void metodaVerificareNumar(int Valoare){
        if (Valoare>5) {
            System.out.println("Numarul "+Valoare+" este mai mare decat 5");
        }
        else if (Valoare<5) {
            System.out.println("Numarul " +Valoare+" este mai mic decat 5");
        }
        else {
            System.out.println("Numarul " +Valoare+" este egal cu 5");

        }
    }

    //verificam daca un numar este par pozitiv sau negativ

    public void metodaVerificareNumarParPozitiv(int Valoare){
        if (Valoare > 0) {
            if (Valoare % 2 == 0) {
                System.out.println("Numarul " + Valoare + " este par pozitiv!");
            } else {
                System.out.println("Numarul " + Valoare + " este impar pozitiv!");
            }
        } else if (Valoare < 0) {
            if (Valoare % 2 == 0) {
                System.out.println("Numarul " + Valoare + " este par negativ!");
            } else {
                System.out.println("Numarul " + Valoare + " este impar negativ!");
            }
        } else System.out.println("Numarul este 0!");

    }
}

