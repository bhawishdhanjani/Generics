package Generics;

public class Utils {
    public static <T extends Comparable<T>> T max(T first , T second){
        return (first.compareTo(second)>0) ? first : second;

    }
    public static <K,V> void print(K key , V value){
        System.out.println(key+"="+value);
    }
    public static void printUser(GenericList<? super User> user){
        user.add(new User(0));

    }
}
