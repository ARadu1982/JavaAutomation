package OOP.Session20.valueVsReferenceType.Ex2;

public class MainRefTest {

    public static void main(String[] args) {

        RefTest ref=new RefTest();
        System.out.println("prima referinta:"+ref);

        RefTest ref2 = new RefTest();
        System.out.println("a doua referinta:"+ref2);

        if (ref==ref2){
            System.out.println("Referintele sunt egale!");
        }else {
            System.out.println("Nu sunt egale!");
        }
    }
}
