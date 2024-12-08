package VariabilaMetoda;

import org.testng.annotations.Test;

public class Vehicles {

    public String marca;
    public  String model;
    public String culoare;
    public Integer nrPasageri;
    public Integer anFabricatie;
    public Integer putereMotor;
    public String combustibil;

    @Test
    public void metodaTest(){
        dateMasina("Dacia","Logan","rosie",4,2023,40,"Benzina");
        dateMasina("Audi","quatro","rosie",4,2023,150,"Benzina");
        calculMedie(7.0,10.0);
        calculMedie(5.0,9.0);
    }

    public void dateMasina(String param1, String param2, String param3,Integer param4, Integer param5, Integer param6, String param7 ) {

         marca = param1;
         model = param2;
         culoare = param3;
         nrPasageri = param4;
         anFabricatie = param5;
         putereMotor = param6;
         combustibil = param7;

         System.out.println("Marca masinii este: " + marca);
        System.out.println("Modelul de masina este: " + model);
        System.out.println("Culoarea masinii este: " + culoare);
        System.out.println("Numarul de pasageri este: " + nrPasageri);
        System.out.println("Anul de fabricatie este: " + anFabricatie);
        System.out.println("Ce combustibil foloseste? " + combustibil);
        System.out.println("Puterea motorului este: " + putereMotor);
    }

    //calculam media la 2 numere

    public void calculMedie(Double nota1, Double nota2){
        Double rezultat = (nota1 + nota2)/2;
        System.out.println("Media este:"+rezultat);
    }
}
