package Challenge_1;
import java.util.*;
import java.util.concurrent.LinkedTransferQueue;

public class Student_Anand {
    private int ID;
    private String firstName;
    private String lastName;
    public Student_Anand(int ID, String firstName, String lastName){
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public int getID(){

        return ID;
    }
    public String getFirstName(){

        return firstName;
    }
    public String getLastName(){

        return lastName;
    }

    public boolean equals(Student_Anand student){

        return this.ID == student.ID;
    }



}
