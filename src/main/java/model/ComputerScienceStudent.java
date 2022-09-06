package model;

public class ComputerScienceStudent extends Student implements Citizen{
    private String programmingLang;
    private String degree;
    private String adress;
    private int identifyCardNumber;

    public ComputerScienceStudent(String name, String id, String programmingLang,
                                  String degree, String adress, int identifyCardNumber){
        super(name, id);
        this.programmingLang = programmingLang;
        this.degree = degree;
        this.adress = adress;
        this.identifyCardNumber = identifyCardNumber;

    }


    public String getProgrammingLang (){
        return programmingLang;
    }

    @Override
    public String toString() {
        return "ComputerScienceStudent{" +
                "Name=" + getName() +
                ", id=" + getId() +
                ", programmingLang='" + programmingLang + '\'' +
                ", degree='" + degree + '\'' +
                ", adress='" + adress + '\'' +
                ", identifyCardNumber=" + identifyCardNumber +
                '}';
    }

    @Override
    public String getDegree() {

        return degree;
    }

    @Override
    public String getAddress() {
        return adress;
    }

    @Override
    public int getIdentifyCardNumber() {
        return identifyCardNumber;
    }
}
