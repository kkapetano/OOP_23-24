package pckg_UML;

public class MainApp {
    public static void main(String[] args) {
        Person person = new Person("Matija","Martinic");
        Student student = new Student("Eva","Franic");
        Professor professor = new Professor("Ivan","Ivanic");
        professor.performConsultation();

    }
}
