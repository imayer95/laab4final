package test;

import model.Student;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ingridmayer on 29/03/2017.
 */

public class StudentTest {
    private Student s1;
    private Student s2;
    @Before
    public void setUp() throws Exception {
        s1 = new Student("studentu1 nr 1","Ingrid Mayer",731);
        s2 = new Student( "studentul nr 2", "Ingrid Mayer", 721);
    }
    // constructor

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getRegNumber() throws Exception {

    }

    @Test
    public void setRegNumber() throws Exception {
        s1.setRegNumber("studentul1");
        assertEquals("setRegNumber crapat", "studentul1",s1.getRegNumber());

        s1.setRegNumber("studentul2");
        assertEquals("setRegNumber crapat", "studentul2",s1.getRegNumber());

        //s1.setRegNumber("studentul3");
        //assertEquals("setRegNumber crapat", "studentul1",s1.getRegNumber());
    }

    @Test
    public void getName() throws Exception {

    }

    @Test
    public void setName() throws Exception {

    }

    @Test
    public void getGroup() throws Exception {

    }

    @Test
    public void setGroup() throws Exception {
        s1.setGroup(363);
        assertEquals("setGroup crapat", 363, s1.getGroup());

        s1.setGroup(345);
        assertEquals("setGroup crapat", 345, s1.getGroup());

    }

}