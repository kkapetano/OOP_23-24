package pckg_equals;

public class User {
    private String username;
    private int id;
    private static int cntId = 10;

    public User (String userName) {
        this.username = userName;
        this.id = cntId;
        cntId++;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", id=" + id +
                '}';
    }

    public void showHashCodeAsHex() {
        System.out.println(getClass().getSimpleName() + "@" + Integer.toHexString(this.hashCode()));
    }

    public String getUsername() {
        return username;
    }

    @Override
    public boolean equals(Object oth) {
        User other = (User) oth;
        return this.getUsername().length()== other.getUsername().length();

    }
}
