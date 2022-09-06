package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComputerScienceStudentTest {

    @Test
    void getDegreeTestForTrue(){
        //GIVEN

        ComputerScienceStudent csstudent = new ComputerScienceStudent("John", "1",
                "Java", "BA", "Musterstr. 18", 1234567);

        //WHEN
        boolean actual = "BA".equals(csstudent.getDegree());
        //THEN
        assertTrue(actual);
    }

    @Test
    void getDegreeTestForFalse(){
        //GIVEN

        ComputerScienceStudent csstudent = new ComputerScienceStudent("John", "1",
                "Java", "BA", "Musterstr. 18", 1234567);

        //WHEN
        boolean actual = "MA".equals(csstudent.getDegree());
        //THEN
        assertFalse(actual);
    }

    @Test
    void getIdTestForTrue(){
        //GIVEN

        ComputerScienceStudent csstudent = new ComputerScienceStudent("John", "1",
                "Java", "BA", "Musterstr. 18", 1234567);

        //WHEN
        boolean actual = "1".equals(csstudent.getId());
        //THEN
        assertTrue(actual);
    }
    @Test
    void getIdTestForFalse(){
        //GIVEN

        ComputerScienceStudent csstudent = new ComputerScienceStudent("John", "1",
                "Java", "BA", "Musterstr. 18", 1234567);

        //WHEN
        boolean actual = "2".equals(csstudent.getId());
        //THEN
        assertFalse(actual);
    }
    @Test
    void getNameTestForTrue(){
        //GIVEN

        ComputerScienceStudent csstudent = new ComputerScienceStudent("John", "1",
                "Java", "BA", "Musterstr. 18", 1234567);

        //WHEN
        boolean actual = "John".equals(csstudent.getName());
        //THEN
        assertTrue(actual);
    }
    @Test
    void getNameTestForFalse(){
        //GIVEN

        ComputerScienceStudent csstudent = new ComputerScienceStudent("John", "1",
                "Java", "BA", "Musterstr. 18", 1234567);

        //WHEN
        boolean actual = "john".equals(csstudent.getName());
        //THEN
        assertFalse(actual);
    }

    @Test
    void getAdressTestForTrue(){
        //GIVEN

        ComputerScienceStudent csstudent = new ComputerScienceStudent("John", "1",
                "Java", "BA", "Musterstr. 18", 1234567);

        //WHEN
        boolean actual = "Musterstr. 18".equals(csstudent.getAddress());
        //THEN
        assertTrue(actual);
    }
    @Test
    void getAdressTestForFalse(){
        //GIVEN

        ComputerScienceStudent csstudent = new ComputerScienceStudent("John", "1",
                "Java", "BA", "Musterstr. 18", 1234567);

        //WHEN
        boolean actual = "Musterstr. 17".equals(csstudent.getAddress());
        //THEN
        assertFalse(actual);
    }
    @Test
    void getIdentifyCardNumberTestForTrue(){
        //GIVEN

        ComputerScienceStudent csstudent = new ComputerScienceStudent("John", "1",
                "Java", "BA", "Musterstr. 18", 1234567);

        //WHEN
        boolean actual = 1234567==csstudent.getIdentifyCardNumber();
        //THEN
        assertTrue(actual);
    }
    @Test
    void getIdentifyCardNumberTestForFalse(){
        //GIVEN

        ComputerScienceStudent csstudent = new ComputerScienceStudent("John", "1",
                "Java", "BA", "Musterstr. 18", 1234567);

        //WHEN
        boolean actual = 12345678 == csstudent.getIdentifyCardNumber();
        //THEN
        assertFalse(actual);
    }

}