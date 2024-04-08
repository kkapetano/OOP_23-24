package pckg_UML;

public class User {

    private int id;
    private String userName;
    private String mail;
    private String password;
    private static int cntID = 100;


    public User(String userName,String password){
        this.id = cntID++;
        this.mail=mail;
        this.userName=userName;
        this.password = password;
    }


    public boolean activateAccount(){
        return true;
    }

    public boolean login (String userName, String password){
        return true;
    }

}
