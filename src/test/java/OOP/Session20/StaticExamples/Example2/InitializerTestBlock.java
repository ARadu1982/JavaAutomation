package OOP.Session20.StaticExamples.Example2;

public class InitializerTestBlock {
    private String name = "Ana";

    // structuri de initializare
    static {
        System.out.println("setting field");
//        name = "Test";
    }

    public InitializerTestBlock(){
        name="Serena";
        System.out.println("setting constructor");
    }

    public static void main(String[] args) {
        InitializerTestBlock test = new InitializerTestBlock();
        System.out.println(test.name);

    }}
