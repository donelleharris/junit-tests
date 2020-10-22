import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Student {
    private String name;
    private Long id;
    private ArrayList<Integer> grades;

    Scanner entry = new Scanner(System.in);

    public Student(String name, Long id){
        this.name = name;
        this.id = id;
        this.grades = new ArrayList<>();
    }
    /*Setters... */
    public void setName(){
        this.name = name;
    }
    public void setId(){
        this.id = id;
    }

    /*Getters... */
    public long getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public ArrayList<Integer> getGrades(){
        return this.grades;
    }

    public double getGradeAverage(){
        double average= 0.0;
        for(int grade: this.grades){
            average += grade;
        }
        average /= grades.size();
        return average;
    }

    public String printAllGrades(){

        for(int i = 0; i < grades.size(); i++){
            //System.out.println(grades(i));
        }
    }
    /*Add, Edit, Delete... */
    public void addGrade(int grade){
            this.grades.add(grade);
    }

    public void updateGrade(){

    }

    /* Delete grade method should ask for the student and then the grade to be deleted.
    * It should then find the index of that grade and create a new list minus that index item. */
    public void deleteGrade(){
        System.out.println("Enter student name: ");
        String student = entry.next();
        //getStudent(student);
        //print student and grades array
        System.out.println("Enter grade to be deleted: ");
        int deletedGrade = entry.nextInt();
        grades.indexOf(deletedGrade);
        //remove deletedGrade from array
    }


}
