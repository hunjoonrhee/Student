import model.BiologyStudent;
import model.ComputerScienceStudent;

public class Main {
    public static void main(String[] args) {
//        Student student1 = new Student("Pascal", "1");
        ComputerScienceStudent Jonathen = new ComputerScienceStudent("Jonathen", "2",
                "Java", "BA", "Musterstr. 18", 1234567);
        System.out.println(Jonathen.getDegree());

        BiologyStudent Julia = new BiologyStudent("Julia", "4", "MA",
                "Maxmustermannstr. 1", 2345675);
        BiologyStudent Julia2 = new BiologyStudent("Julia", "5", "MA",
                "Maxmustermannstr. 1", 2345675);

        System.out.println(Jonathen);
        System.out.println(Julia);

        // Was nicht geht:
//        System.out.println(student1.getProgrammingLang());
    }
}
