package Generics;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(10);
        User user2 = new User(20);
        User maxUser = Utils.max(user1,user2);
        System.out.println(maxUser);
        Utils.printUser(new GenericList<User>());

    }
}
