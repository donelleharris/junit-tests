import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class CohortTest {
    Cohort emptyCohort;
    Cohort cohortWithOne;
    Cohort cohortWithMany;

    @Before
    public void setup(){
        emptyCohort = new Cohort();
        cohortWithOne = new Cohort();
        cohortWithMany = new Cohort();

        Student donelle = new Student(1L, "Donelle Harris");
        donelle.addGrade(95);
        donelle.addGrade(95);
        donelle.addGrade(95);

        Student jocelyn = new Student(2L, "Jocelyn Harris");
        jocelyn.addGrade(95);
        jocelyn.addGrade(95);
        jocelyn.addGrade(95);

        cohortWithOne.addStudent(jocelyn);
        cohortWithMany.addStudent(jocelyn);
        cohortWithMany.addStudent(donelle);
    }

    @Test
    public void testAddStudent(){
        Student jace = new Student(3L, "Jace Harris");
        cohortWithMany.addStudent(jace);
        assertEquals("Jace Harris", cohortWithMany.getStudents().get(2).getName());
        cohortWithMany.addStudent(new Student(4L, "Blossom Perez"));
        assertEquals(4, cohortWithMany.getStudents().size());
    }

    @Test
    public void testGetStudents(){
        assertEquals(0, emptyCohort.getStudents().size());
        assertEquals(1, cohortWithOne.getStudents().size());
    }

    @Test
    public void testGetCohortAverage(){
        assertEquals(Double.NaN, emptyCohort.getCohortAverage(), 0);
        assertEquals(95.0, cohortWithOne.getCohortAverage(), 0);
        assertEquals(95.0, cohortWithMany.getCohortAverage(), 0);
    }

//    @Test
//    public void testFindStudentById(){
//        assertEquals(1, cohortWithMany.getStudents().get(0).getId());
//    }

}
