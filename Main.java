package Generics;

public class Main {
    public static void main(String[] args) {
        var list = new List();
        list.add("1");
        list.add(1);
        list.add(new User());
        String index0 = (String) list.get(0);
        int index1 = (int) list.get(1);
        var user = (User) list.get(2);
    }
}
