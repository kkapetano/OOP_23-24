package pckg_UML;

public class Professor extends User{
    public Professor(String userName, String password, String mail) {
        super(userName, password, mail);
    }

    @Override
    public boolean activateAccount() {
        return super.activateAccount();
    }

    public int getExam(String course){
        return 5;
    }
}
