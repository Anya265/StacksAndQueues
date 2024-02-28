package Challenge_1;


import java.sql.Array;
import java.util.concurrent.LinkedTransferQueue;
import java.util.*;

//private instance variables(1)
public class Bathroom_Anand {
private LinkedTransferQueue<Student_Anand> bathroomLine;
private ArrayList<Student_Anand>studentsInBathroom;
private ArrayList<Student_Anand> recentlyInBathroom;


private int max;

    //Bathroom being an object etc. (2)
    public Bathroom_Anand(int max){
        this.max = max;
        this.bathroomLine = new LinkedTransferQueue<>();
        this.studentsInBathroom = new ArrayList<>();
        this.recentlyInBathroom = new ArrayList<>();

    }
    //clearing all the data(3)
    public void clearData(){
        bathroomLine.clear();
        studentsInBathroom.clear();
        recentlyInBathroom.clear();
    }

    //Getting and setting
    public int getMax(){
        return max;
    }
    public void setMax(int max){
        this.max=max;
    }

    //Adding student into the Bathroom (4)
    public void addStudentToLine(Student_Anand student){
        if(recentlyInBathroom.contains(student)){
            return;
        }
        if(studentsInBathroom.size() < max){
            studentsInBathroom.add(student);
            System.out.println(student.getFirstName() + " " + student.getLastName() + " is in the bathroom");
        }
        else{
            bathroomLine.add(student);
            System.out.println(student.getFirstName() + " " + student.getLastName() + " " + " has to wait in line for there turn.");
        }
    }

    public void studentLeftBathroom(Student_Anand student) {
        if(studentsInBathroom.contains(student)) {
            studentsInBathroom.remove(student);
            recentlyInBathroom.add(student);
            System.out.println(student.getFirstName() + " " + student.getLastName() + " has left the bathroom.");
        }
    }

    //See if they are currently in bathroom (6)
    public String fetchStudents(){

        for(Student_Anand student : studentsInBathroom){
            System.out.println(student.getFirstName() + " " +student.getLastName());
        }
        return " ";
    }

    //search for a student(7)
    public String searchStudent(Student_Anand student){
        if(bathroomLine.contains(student)){
            return student.getFirstName() + " " + student.getLastName() + " is in line.";
        }
        else if(studentsInBathroom.contains(student)){
            return student.getFirstName() + " " + student.getLastName() + " is in the bathroom.";
        }
        else{
            return student.getFirstName() + " " + student.getLastName() + " is not in the bathroom or in line.";
        }
    }
    //Bathroom Line Length(8)
    public int bathroomLineLength(){
        return bathroomLine.size();
    }

    public String test(){
        return null;
    }




}
