package OOP.Abstractizare.ClaseAbstracte;

public class Cerc extends FormeGeometrice{ // nu poate fi extended decat o singura clasa abstracta

    private int raza;

    @Override
    public void calculeazaAria() // metoda din clasa abstracta trebuie implementata
    {

        System.out.println("Aria cercului este:"+Math.PI*Math.pow(raza,2));

    }

    public int getRaza() {
        return raza;
    }

    public void setRaza(int raza) {
        this.raza = raza;
    }
}
