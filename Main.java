//Map WORKS
//HashMap

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class call{
    public static void main(String[] args) {
        HashMap h = new HashMap();
        h.put("krushna",12);
        h.put(123,"dj");
        h.put(12.32,"wer");
        h.put(23.43f,12);
        h.put("krusna",12.43);
        System.out.println(h);
        for(int i=0;i<h.size();i++){
            System.out.println(h.get(i));
        }
        for(Object e : h.entrySet()){
            System.out.println(e);  //error here
        }
        //System.out.println(h.keySet());
        //Iterator it = h.iterator();

    }
}