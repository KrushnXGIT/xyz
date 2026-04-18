//Collection FRAMEWORKS
//ArrayList

import java.util.ArrayList;
import java.util.Iterator;

class call{
    public static void main(String[] args) {
        ArrayList al = new ArrayList();//<> not used here
        al.add("Krushna");
        al.add("Krushna");
        al.add(10);
        al.add(20.50);
        al.add(20.3f);
        al.add(null);
        System.out.println(al);
        System.out.println("Normal Looping");
        for(int i=0;i<al.size();i++){
            System.out.println(al.get(i));
        }
        System.out.println("FOR--EACH");
        for(Object o:al){
            System.out.println(o);
        }
        System.out.println("Iterator");
        Iterator<Object> newIt = al.iterator();
        while(newIt.hasNext()){
            System.out.println(newIt.next());
        }
    }
}