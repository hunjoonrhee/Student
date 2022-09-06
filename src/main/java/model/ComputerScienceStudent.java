package model;

public class ComputerScienceStudent extends Student{
    private String programmingLang;
    private String degree;

    public ComputerScienceStudent(String name, String id, String programmingLang, String degree){
        super(name, id);
        this.programmingLang = programmingLang;
        this.degree = degree;

    }


    public String getProgrammingLang (){
        return programmingLang;
    }

    @Override
    public String toString() {
        return "ComputerScienceStudent{" + "name " + getName() + " id " + getId()+ " " +
                "programmingLang='" + programmingLang + '\'' + "degree='" + degree + '\'' +
                '}';
    }


    @Override
    public String getDegree() {

        return degree;
    }
}
