package OOP;

public class Angajat extends Persoana implements AngajatInt{

    // modificatori de acces
    // public = codul se poate accesa de oriunde si de catre orice clasa
    // private = codul se poate accesa doar din clasa de unde a fost scris codeul
    // protected = codul se poate accesa doar din pachetul in care a fost scris codul, dar si de catre subclase (conceptul oop de mostenire)
    // default = codul se poate accesa doar din pachetul din care s-a scris codul.
    //           Se intra pe default daca nu este specificat un alt modificator de acces



    private String firma;

    private Integer experienta;

    private Integer zileConcediu;

    public Angajat(String nume, String prenume, Integer varsta, String firma,Integer experienta, Integer zileConcediu) {
        super(nume, prenume, varsta);
        this.firma = firma;
        this.experienta = experienta;
        this.zileConcediu = zileConcediu;
    }

    public void infoAngajat(){
        infoPersoana();
        System.out.println("Firma este: "+firma);
        System.out.println("Experienta este: "+experienta);
        System.out.println("Zile de concediu: "+zileConcediu);
    }

    // Suprascriem metoda din parinte (Polimorfism dinamic)

    public void mananca(){

        System.out.println("Angajatul mananca in pauza de masa!");

    }

    // Polimorfismul static
    public void marire(){

        System.out.println("Nu exista buget pentru marire!");

    }

    public void marire(Integer procent){

        System.out.println("Angajatul a primit o marire de: "+procent+ " %");

    }

    public void marire(String grad){

        System.out.println("Angajatul a primit gradul "+grad);

    }

    public void promovare(){
        System.out.println("Angajatul cu numele "+getNume()+"si prenumele "+getPrenume()+" a fost promovat!");
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public Integer getExperienta() {
        return experienta;
    }

    public void setExperienta(Integer experienta) {
        this.experienta = experienta;
    }

    public Integer getZileConcediu() {
        return zileConcediu;
    }

    public void setZileConcediu(Integer zileConcediu) {
        this.zileConcediu = zileConcediu;
    }

    @Override
    public void mergeLaMunca() {
        System.out.println("Angajatul merge la munca!");
    }

    @Override
    public void primesteSalariu() {
        System.out.println("Angajatul primeste salariu!");

    }

    @Override
    public void mergeInPauza() {
        System.out.println("Angajatul merge in pauza de masa!");

    }

    @Override
    public void prezintaDemisie() {
        System.out.println("Anfajatul prezinta demisia!");
    }
}
