package Generics;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(10);
        User user2 = new User(20);
        if(user1.compareTo(user2) < 0){
            System.out.println("User1");
        }
        else if(user1.compareTo(user2) > 0){
            System.out.println("User2");
        }
        else {
            System.out.println("Equal");
        }

    }
}
