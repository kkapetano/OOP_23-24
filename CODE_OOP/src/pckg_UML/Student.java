package pckg_UML;

public class Student extends Person{
    public Student(String Name, String surName) {
        super(Name, surName);
        System.out.println(this.getClass().getSimpleName() + " constructor called");
    }


    public void askQuestion() {
        System.out.println("Student: " + this.name + " asks question to professor");
    }
}
