package pckg_UML;

import java.util.ArrayList;

public class Professor extends Person {
    private ArrayList<Student> students;


    public Professor(String userName, String password) {
        super(userName, password);
        students = new ArrayList<>();
        System.out.println(this.getClass().getSimpleName() + " constructor called");

    }


    public void performConsultation(){
        System.out.println(this.getClass().getSimpleName() + " gives consultative lecture to students...");
        for (Student student : students) {
            student.askQuestion();
        }
    }
}