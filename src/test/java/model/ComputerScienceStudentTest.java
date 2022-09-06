package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComputerScienceStudentTest {

    @Test
    void getDegreeTestForTrue(){
        //GIVEN

        ComputerScienceStudent csstudent = new ComputerScienceStudent("John", "1", "Java", "BA");

        //WHEN
        boolean actual = "BA".equals(csstudent.getDegree());
        //THEN
        assertTrue(actual);
    }

    @Test
    void getDegreeTestForFalse(){
        //GIVEN

        ComputerScienceStudent csstudent = new ComputerScienceStudent("John", "1", "Java", "BA");

        //WHEN
        boolean actual = "MA".equals(csstudent.getDegree());
        //THEN
        assertFalse(actual);
    }

    @Test
    void getIdTestForTrue(){
        //GIVEN

        ComputerScienceStudent csstudent = new ComputerScienceStudent("John", "1", "Java", "BA");

        //WHEN
        boolean actual = "1".equals(csstudent.getId());
        //THEN
        assertTrue(actual);
    }
    @Test
    void getIdTestForFalse(){
        //GIVEN

        ComputerScienceStudent csstudent = new ComputerScienceStudent("John", "1", "Java", "BA");

        //WHEN
        boolean actual = "2".equals(csstudent.getId());
        //THEN
        assertFalse(actual);
    }
    @Test
    void getNameTestForTrue(){
        //GIVEN

        ComputerScienceStudent csstudent = new ComputerScienceStudent("John", "1", "Java", "BA");

        //WHEN
        boolean actual = "John".equals(csstudent.getName());
        //THEN
        assertTrue(actual);
    }
    @Test
    void getNameTestForFalse(){
        //GIVEN

        ComputerScienceStudent csstudent = new ComputerScienceStudent("John", "1", "Java", "BA");

        //WHEN
        boolean actual = "john".equals(csstudent.getName());
        //THEN
        assertFalse(actual);
    }

}