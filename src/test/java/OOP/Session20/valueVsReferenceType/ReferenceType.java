package OOP.Session20.valueVsReferenceType;

public class ReferenceType {

    public static void main(String[] args) {

        // Obiecte de tip String , referinte
        String str1 = new String("hello");
//        String str2 = new String("hello");
        String str2 = str1;

        // primitive
        int intreg1=10;
        int intreg2=10;

        if(intreg1==intreg2){
            System.out.println("Au aceeasi valoare!");
        }else {
            System.out.println("Int urile nu au aceeasi valoare!");
        }

        if (str1==str2)
        {
            System.out.println("Valorile sunt la fel!");
        }else {
            System.out.println("Valorile nu sunt la fel!");
        }
    }
}
