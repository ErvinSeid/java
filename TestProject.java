package test_project;

public class TestProject {

    public static void main (String[] args) {
        // TODO Auto-generated method stub

        int marks = 99;
        if (marks<50) {

            System.out.println("fail");
        }
            else if (marks>=50 && marks<60) {
            System.out.println("Grade D");

        }
            else if(marks>=60 && marks<70) {
                System.out.println ( "Grade C");
        }
            else if (marks>=70 && marks<85) {
                System.out.println("Grade B");
        }
            else if (marks>=85 && marks<100) {
                System.out.println("Grade A");
        }
            else {System.out.println("Invalid Score");
        }
    }

}