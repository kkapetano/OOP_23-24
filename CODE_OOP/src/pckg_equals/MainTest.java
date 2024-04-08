package pckg_equals;

public class MainTest {

    public static void main(String[] args) {
        User u1 = new User("Name 1");
        User u2 = new User("Name 1");

        System.out.println(u1);
        System.out.println(u2);
        u1.showHashCodeAsHex();
        u2.showHashCodeAsHex();

        System.out.println("-----------------");
        System.out.println(u1.equals(u2));
        System.out.println(u1==u2);
    }
}
