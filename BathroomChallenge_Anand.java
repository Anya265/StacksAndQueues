package Challenge_1;

public class BathroomChallenge_Anand {
    public static void main(String[] args){

        //Bathrooms 1 and 2
        Bathroom_Anand bathroom1 = new Bathroom_Anand(3);
        Bathroom_Anand bathroom2 = new Bathroom_Anand(2);

        //Adding students to the roster
        Student_Anand james = new Student_Anand(1, "James", "Washington");
        Student_Anand david = new Student_Anand(2, "David", "Monte");
        Student_Anand charile = new Student_Anand(3, "Charlie", "Jackson");
        Student_Anand johnny = new Student_Anand(4, "Johnny", "Johnson");
        Student_Anand davis = new Student_Anand(5, "Davis", "Davidson");
        Student_Anand rachel = new Student_Anand(6, "Rachel", "Bobson");
        Student_Anand chuck = new Student_Anand(7, "Chuck", "Gary");
        Student_Anand johnS = new Student_Anand(8,"John", "Smith");
        Student_Anand johnD = new Student_Anand(9, "John", "Doe");
        Student_Anand jane = new Student_Anand(10, "Jane", "Doe");
        Student_Anand janette = new Student_Anand(11, "Janette", "Reed");
        Student_Anand michele = new Student_Anand(12, "Michele", "Mickey");

        //Adding students to bathroom 1
        bathroom1.addStudentToLine(james);
        bathroom1.addStudentToLine(david);
        bathroom1.addStudentToLine(johnD);
        bathroom1.addStudentToLine(johnS);
        bathroom1.addStudentToLine(chuck);

        //Adding students to bathroom 1:
        bathroom2.addStudentToLine(janette);
        bathroom2.addStudentToLine(jane);
        bathroom2.addStudentToLine(rachel);
        bathroom2.addStudentToLine(michele);

        //Who is in the bathrooms
        //print out using a loop
        System.out.println(bathroom1.fetchStudents());
        System.out.println(bathroom2.fetchStudents());

        //Find student
        System.out.println(bathroom1.searchStudent(james));
        System.out.println(bathroom1.searchStudent(chuck));
        System.out.println(bathroom2.searchStudent(james));
        System.out.println(bathroom1.searchStudent(davis));

        //Leaves bathroom
        bathroom1.studentLeftBathroom(james);
        bathroom2.studentLeftBathroom(jane);

        //Testing
        System.out.println(bathroom1.test());
        System.out.println(bathroom2.test());

        //Clear
        bathroom1.clearData();

        //Testing
        System.out.println(bathroom1.test());

        //Setting bathroom1 to 15 people
        bathroom1.setMax(15);



    }
}
