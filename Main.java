//Collection FRAMEWORKS
//LinkedList

import java.util.Iterator;
import java.util.LinkedList;

class call{
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add("Krushna");
        ll.add(10);
        ll.add(13.23);
        ll.add(13.24f);
        ll.add(null);
        System.out.println(ll);

        //with looping
        for(int i=0;i<ll.size();i++){
            System.out.println(ll.get(i));
        }
        //with for each
        for(Object o:ll){
            System.out.println(o);
        }
        //with iterator
        Iterator<Object> it = ll.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}