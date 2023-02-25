package Generics;

public class UserList {
    User[] users = new User[10];
    private int count ;
    public void add(User user){
        users[count++] = user;
    }
    public User get(int index){
        return users[index];
    }
}
