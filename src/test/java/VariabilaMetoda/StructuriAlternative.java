package VariabilaMetoda;

import org.testng.annotations.Test;

public class StructuriAlternative {

    //structuri alternative = if-then-else;switch-case
    @Test
    public void metodaTest(){
//        metodaVerificareNumar(7);
//        metodaVerificareNumar(3);
//        metodaVerificareNumar(5);
//        metodaVerificareNumarParPozitiv(0);
//        metodaVerificareNumarParPozitiv(4);
//        metodaVerificareNumarParPozitiv(3);

        ZileSaptamana(9);

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

    //exemplu switch case
    public void ZileSaptamana(Integer zi){
        switch (zi)
        {
            case 1:
                System.out.println("Astazi este Luni");
                break;
            case 2:
                System.out.println("Astazi este Marti");
                break;
            case 3:
                System.out.println("Astazi este Miercuri");
                break;
            case 4:
                System.out.println("Astazi este Joi");
                break;
            case 5:
                System.out.println("Astazi este Vineri");
                break;
            case 6:
                System.out.println("Astazi este Sambata");
                break;
            case 7:
                System.out.println("Astazi este Duminica");
                break;
            default:
                System.out.println("Nu mai sunt zile!");
        }
    }
}

