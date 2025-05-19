package OOP;

public class Persoana {

    // OOP = programare orientata obiect
    // 4 principii: mostenire, incapsulare, polimorfism, abstractizare
    // mostenire = conceptul prin care o clasa (copil) mosteneste o alta clasa (parinte)
    // in java putem mosteni o singura clasa
    // in momentul cand o clasa mosteneste o alta clasa, clasa copil trebuie sa apeleze constructorul din parinte
    // in momentul in care se aplica mostenirea copilul are vizibilitate asupra variabilelor/ metodelor din parinte
    // constructorul din parinte in copil se apeleaza cu super

    // Incapsulare = procesul prin care limitam accesul pentru a nu fi modificat la anumite informatii
    // Acest lucru se face schimband accesul catre variabile/metode din public in private
    // Toate variabilele dintr-o clasa trebuie facute private implicit urmand a schimba accesul folosing getter / setter

    // private = restrictionarea accesului doar in interiorul clasei
    // Pentru a extrage/modifica o informatie privata folosim metodele get/set

    // POLIMORFISM =  procesul prin care definim mai multe implementari pt o metoda
    // Acesta poate fi de 2 feluri: dinamic (override) si static (overload)
    // Polimorfismul dinamic = intr-o ierarhie de clase obtinute prin mostenire , o metoda poate avea implementari diferite
    // POLIMORFISMUl static = posibilitatea prin care o metoda are mai multe implementari prin diferentierea numarului de implementari


    // ABSTRACTIZAREA =  reducerea unui element compelx la un element mai simplu
    // (reducerea completa a implementarii metodelor, lasand doar numele functiilor, parametrii si tipul returnat)
    // Abstractizarea se poate obtine folosind clase abstracte si/sau interfete
    // Clasele abstracte sunt utilizate pentru a declara caracteristici comune ale unor subclase
    // o clasa abstracta nu poate fi instantiata
    // ea poate fi utilizata doar ca si superclasa pentru alta clasa care extinde clasa abstracta
    // clasa abstracta poate fi definita folosind cuvantul cheie "abstract"
    // o clasa abstracta poate contine atribute si metode pe langa clasa abstracta


    // interfata ofera raspuns lipsei mostenirii multiple
    // interfata creeaza un protocol pe care clasele trebuie sa-l implementeze
    // interfata contine toate metodele abstracte (este o clasa pur abstracta)
    //

    private String nume;

    private String prenume;

    private Integer varsta;

    public Persoana(String nume, String prenume, Integer varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

     protected void infoPersoana(){

        System.out.println("Numele este: "+nume);
        System.out.println("Prenumele este: "+prenume);
        System.out.println("Varsta este: "+varsta);
    }

    // definim prima implementare pt o metoda (polimorfism dinamic)

    public void mananca(){
        System.out.println("O persoana mananca cand ii este foame!");

    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public Integer getVarsta() {
        return varsta;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setVarsta(Integer varsta) {
        this.varsta = varsta;
    }
}
