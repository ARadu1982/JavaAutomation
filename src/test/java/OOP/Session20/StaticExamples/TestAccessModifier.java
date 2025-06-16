package OOP.Session20.StaticExamples;

public class TestAccessModifier {

    public static void main(String[] args){

//        StaticAccessModifier staticAccessModifier = new StaticAccessModifier();
        System.out.println(StaticAccessModifier.name);
//        staticAccessModifier.name = "new endava value";
        StaticAccessModifier.name = "new ENDAVA";
        System.out.println(StaticAccessModifier.name);
        StaticAccessModifier.printMessage();

        StaticAccessModifier staticAccessModifier2 = new StaticAccessModifier();
        System.out.println(staticAccessModifier2.name);

    }

}
