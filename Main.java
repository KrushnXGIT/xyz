//program create one arraylist
//add integers numbers in AL and sort using Lambda



import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

interface calc{
    void sortt(ArrayList<Integer> a);
}


class call{
//    public int compare(Integer o1,Integer o2){
//        Integer a =(Integer) o1;
//        Integer b =(Integer) o2;
//        return a.compareTo(b);
//    }
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(10);
        a.add(1);
        a.add(2);
        a.add(11);
        a.add(23);
        System.out.println(a);
        calc w = (a)-> Collections.sort(a);
        System.out.println(a);

    }
}
