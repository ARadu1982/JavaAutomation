package OOP.Session20.syncronizedEx;

public class Counter {

    int count;

    // synchronized este folosit pentru thread safety
    // synchronized poate fi aplicat la metode si blocks
    //

    synchronized void increment(){
        count++;
    }
}
