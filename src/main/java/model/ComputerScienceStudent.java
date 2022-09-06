package model;

public class ComputerScienceStudent extends Student{

    private String programmingLang;

    public ComputerScienceStudent(String name, String id, String programmingLang){
        super(name, id);
        this.programmingLang = programmingLang;

    }


    public String getProgrammingLang (){
        return programmingLang;
    }

    @Override
    public String toString() {
        return "ComputerScienceStudent{" + "name " + getName() + " id " + getId()+ " " +
                "programmingLang='" + programmingLang + '\'' +
                '}';
    }
}
