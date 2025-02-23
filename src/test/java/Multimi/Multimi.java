package Multimi;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Multimi {

    // multimi : array, list, map

    @Test
    public void metodaTest(){
//        colegiCurs();
//        colegiCursLista();
//        categoriiObiecte();
        tariOrase();
    }

    //exemplu array

    public void colegiCurs(){

        String[] colegi = new String[6];
        colegi[0] = "Radu";
        colegi[1] = "ANdrei";
        colegi[2] = "Costy";
        colegi[3] = "Mihai";
        colegi[4] = "Sorin";
        colegi[5] = "Traian";

        for (int index = 0; index < colegi.length;index++){

            System.out.println("Numele colegului este: "+colegi[index]);
        }

    }

    // exemplu lista

    public void colegiCursLista(){
        List<String> colegi = new ArrayList<>();
        colegi.add("Ana-Maria");
        colegi.add("Alex");
        colegi.add("Paul");
        colegi.add("Gabi");
        colegi.add("Corina");
        colegi.add("Ionut");

        int index = 0;
        while (index< colegi.size() )
        {
            System.out.println("Numele colegului este: "+colegi.get(index));
            index++;
        }

    }

    // exemplu map
    // map -> cheie = valoare

    public void  categoriiObiecte(){

        HashMap<String, String> obiecte = new HashMap<>();

        obiecte.put("obiect","laptop");
        obiecte.put("fruct","mar");
        obiecte.put("floare","trandafir");

        for(String key: obiecte.keySet())
        {
            System.out.println("Cheia este: "+key);
            System.out.println("Valoarea este: "+obiecte.get(key));
        }
    }

    public void tariOrase(){
        HashMap<String, List<String>> clasificare = new HashMap<>();

        List<String> oraseRomania = new ArrayList<>();
        oraseRomania.add("Braila");
        oraseRomania.add("Bucuresti");
        oraseRomania.add("Vaslui");

        List<String> oraseItalia = new ArrayList<>();
        oraseItalia.add("Roma");
        oraseItalia.add("Milano");
        oraseItalia.add("Torino");

        List<String> oraseSpania = new ArrayList<>();
        oraseSpania.add("Madrid");
        oraseSpania.add("Barcelona");
        oraseSpania.add("Valencia");

        clasificare.put("Romania",oraseRomania);
        clasificare.put("Italia",oraseItalia);
        clasificare.put("Spania",oraseSpania);

        for(String key: clasificare.keySet())
        {
            System.out.println("Tara este: "+key);
            System.out.println("Orasele sunt: "+clasificare.get(key));
        }

    }

}
