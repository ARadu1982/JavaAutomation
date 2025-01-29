package VariabilaMetoda;

import org.testng.annotations.Test;

import java.util.Scanner;

public class DataTypeExercises {
//    Scanner scanner = new Scanner(System.in);
//    int length = rectangleLength();
//    int width = rectangleWidth();

    @Test
    public void executeExercises(){

        int length = 5;
        int width = 4;
        int minutes = 30;
        int side = 20;

        //      System.out.println("Ai selectat lungimea "+length+" si latimea: "+width);
        System.out.println("Valoarea perimetrului este:"+calculateRectanglePerimeter(length,width));
        System.out.println("Conversie minute in secunde: "+convertsMinutesIntoSeconds(minutes));
        System.out.println("Arie patrat: "+calculateSquareArea(side));
//       scanner.close();

    }

//    public int rectangleLength(){
//        System.out.println("Introdu lungimea: ");
//        return scanner.nextInt();
//    }

//    public int rectangleWidth(){
//        System.out.println("Introdu latimea: ");
//        return scanner.nextInt();
//    }

    public int calculateRectanglePerimeter(int length, int width){
        return 2*length + 2*width;
    }

    public int convertsMinutesIntoSeconds(int minutes){
        return minutes * 60;
    }

    public int calculateSquareArea(int side){
        return 4 * side;
    }
}
