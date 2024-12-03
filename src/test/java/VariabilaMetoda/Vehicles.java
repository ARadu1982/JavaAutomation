package VariabilaMetoda;

public class Vehicles {

    public String Marca;
    public  String Model;
    public String Culoare;
    public Integer NrPasageri;
    public Integer AnFabricatie;
    public Integer PutereMotor;
    public String Combustibil;

    public void prezentareMasina() {

         Marca = "Dacia";
         Model = "Logan";
         Culoare = "Rosu";
         NrPasageri = 4;
         AnFabricatie = 2024;
         PutereMotor = 90;
         Combustibil = "Benzina";

         System.out.println("Marca masinii este: " + Marca);
        System.out.println("Modelul de masina este: " + Model);
        System.out.println("Culoarea masinii este: " + Culoare);
        System.out.println("Numarul de pasageri este: " + NrPasageri);
        System.out.println("Anul de fabricatie este: " + AnFabricatie);
        System.out.println("Ce combustibil foloseste? " + Combustibil);
        System.out.println("Puterea motorului este: " + PutereMotor);
    }
}
