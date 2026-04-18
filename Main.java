//problem


import java.util.Arrays;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingDeque;

class call{
    public static void main(String[] args) {
        LinkedList<String> ll1 = new LinkedList<String>(Arrays.asList("TIGER","CAT","DOG","HORSE"));
        LinkedList<String> ll2 = new LinkedList<String>(Arrays.asList("CAT","HORSE","MONKEY","LION"));

        System.out.println(ll1);
        System.out.println(ll2);
        ll1.removeAll(ll2); //<IMPORTANT>//
        System.out.println(ll1);
        System.out.println(ll2);
    }
}