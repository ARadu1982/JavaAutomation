package OOP.Abstractizare.Interfete;

public class Patrat implements FormeGeometrice{

    private int latura;

    @Override
    public void calculeazaAria() {
        System.out.println("Aria patratului este:"+latura*latura);
    }

    @Override
    public void deseneaza() {

        System.out.println("Deseneaza un patrat!");

    }

    public int getLatura() {
        return latura;
    }

    public void setLatura(int latura) {
        this.latura = latura;
    }

}
