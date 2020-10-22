import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentTest {

    private Student donelle;
    private ArrayList<Integer> grades;

    @Before
    public void setUp(){
        Student donelle = new Student("Donelle", 1234567890L);
        donelle.addGrade(90);
        donelle.addGrade(95);
        donelle.addGrade(85);
    }
    @Test
    public void testCreateStudentInstance(){
        Student donelle = new Student("Donelle", 1234567890L);
        Student jocelyn = new Student("Jocelyn", 1234567891L);
        assertNotNull(donelle);
        assertNotNull(jocelyn);
    }

    @Test
    public void testStudentNameAndId(){
        Student donelle = new Student("Donelle", 1234567890L);

        assertEquals("Donelle", donelle.getName());
        assertEquals(1234567890L, donelle.getId());
    }

    @Test
    public void testAddGrade(){
        Student donelle = new Student("Donelle", 1234567890L);
        donelle.addGrade(95);
    }

    @Test
    public void testAverageGrade(){
        Student donelle = new Student("Donelle", 1234567890L);
        donelle.addGrade(90);
        donelle.addGrade(95);
        donelle.addGrade(85);

        assertEquals(90.0, donelle.getGradeAverage(), 0.0);
    }

    @Test
    public void testDeleteGrade(){
        //write deleteGrade method
    }

    @Test
    public void testUpdateGrade(){
        //write updateGrade method
    }

}
