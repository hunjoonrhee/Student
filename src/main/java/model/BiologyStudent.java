package model;

import java.util.Objects;

public class BiologyStudent extends Student implements Citizen{

    private String degree;
    private String address;
    private int identifyCardNumber;

    public BiologyStudent(String name, String id,
                          String degree, String address, int identifyCardNumber){
        super(name, id);
        this.degree = degree;
        this.address = address;
        this.identifyCardNumber = identifyCardNumber;
    }
    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public int getIdentifyCardNumber() {
        return identifyCardNumber;
    }

    @Override
    String getDegree() {
        return degree;
    }

    //super equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BiologyStudent that = (BiologyStudent) o;

        if (identifyCardNumber != that.identifyCardNumber) return false;
        if (!Objects.equals(degree, that.degree)) return false;
        return Objects.equals(address, that.address);
    }

    @Override
    public int hashCode() {
        int result = degree != null ? degree.hashCode() : 0;
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + identifyCardNumber;
        return result;
    }

    @Override
    public String toString() {
        return "BiologyStudent{" +
                "Name=" + getName() +
                ", id=" + getId() +
                ", degree='" + degree + '\'' +
                ", address='" + address + '\'' +
                ", identifyCardNumber=" + identifyCardNumber +
                '}';
    }
}
