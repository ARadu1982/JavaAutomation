package OOP;

import org.testng.annotations.Test;

public class OOPTest {

    @Test
    public void metodaTest(){
//        Student Cristi = new Student("Pop","Cristi",25,"UBB","2",true);
//        Cristi.infoStudent();
//        Cristi.mananca();

        Angajat Tudor = new Angajat("Popescu","Tudor",27,"Panemar",3, 20);
        Tudor.infoAngajat();
        Tudor.promovare();
        Tudor.mananca();
        Tudor.marire();
        Tudor.marire(10);
        Tudor.marire("Senior");
    }

}
