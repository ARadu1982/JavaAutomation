package OOP.Abstractizare.Interfete;

public class Cerc implements FormeGeometrice{ // Pot fi implementate mai multe interfaces daca sunt definite

    private int raza;

    @Override
    public void calculeazaAria() // metoda din clasa abstracta trebuie implementata
    {

        System.out.println("Aria cercului este:"+Math.PI*Math.pow(raza,2));

    }

    @Override
    public void deseneaza() {

        System.out.println("Deseneaza cerc!");

    }

    public int getRaza() {
        return raza;
    }

    public void setRaza(int raza) {
        this.raza = raza;
    }
}
