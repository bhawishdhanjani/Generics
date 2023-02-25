package Generics;

public class Main {
    public static void main(String[] args) {
        var list = new List();
        list.add(1);
        list.get(0);
        var userList = new UserList();
        userList.add(new User());
        list.get(0);
    }
}
