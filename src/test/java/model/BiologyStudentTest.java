package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BiologyStudentTest {
    @Test
    void getDegreeTestForTrue(){
        //GIVEN

        BiologyStudent biologyStudent = new BiologyStudent("John", "1",
               "BA", "Musterstr. 18", 1234567);

        //WHEN
        boolean actual = "BA".equals(biologyStudent.getDegree());
        //THEN
        assertTrue(actual);
    }

    @Test
    void getDegreeTestForFalse(){
        //GIVEN

        BiologyStudent biologyStudent = new BiologyStudent("John", "1",
                "BA", "Musterstr. 18", 1234567);

        //WHEN
        boolean actual = "MA".equals(biologyStudent.getDegree());
        //THEN
        assertFalse(actual);
    }

    @Test
    void getAddressTestForTrue(){
        //GIVEN

        BiologyStudent biologyStudent = new BiologyStudent("John", "1",
                "BA", "Musterstr. 18", 1234567);
        //WHEN
        boolean actual = "Musterstr. 18".equals(biologyStudent.getAddress());
        //THEN
        assertTrue(actual);
    }

    @Test
    void getAddressTestForFalse(){
        //GIVEN

        BiologyStudent biologyStudent = new BiologyStudent("John", "1",
                "BA", "Musterstr. 18", 1234567);
        //WHEN
        boolean actual = "Musterstr. 17".equals(biologyStudent.getAddress());
        //THEN
        assertFalse(actual);
    }
    @Test
    void getIdentifyCardNumberTestForTrue(){
        //GIVEN

        BiologyStudent biologyStudent = new BiologyStudent("John", "1",
                "BA", "Musterstr. 18", 1234567);

        //WHEN
        boolean actual = 1234567==biologyStudent.getIdentifyCardNumber();
        //THEN
        assertTrue(actual);
    }
    @Test
    void getIdentifyCardNumberTestForFalse(){
        //GIVEN

        BiologyStudent biologyStudent = new BiologyStudent("John", "1",
                "BA", "Musterstr. 18", 1234567);

        //WHEN
        boolean actual = 12345678 == biologyStudent.getIdentifyCardNumber();
        //THEN
        assertFalse(actual);
    }

}