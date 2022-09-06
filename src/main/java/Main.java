import model.ComputerScienceStudent;
import model.Student;

public class Main {
    public static void main(String[] args) {
//        Student student1 = new Student("Pascal", "1");
        ComputerScienceStudent computerScienceStudent = new ComputerScienceStudent("Julia", "2",
                "Java", "BA");
        System.out.println(computerScienceStudent.getDegree());

        System.out.println(computerScienceStudent);
        System.out.println(computerScienceStudent.getName());
        System.out.println(computerScienceStudent.getId());
        System.out.println(computerScienceStudent.getProgrammingLang());

        // Was nicht geht:
//        System.out.println(student1.getProgrammingLang());
    }
}
