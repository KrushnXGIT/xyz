//Collection FRAMEWORKS
//HashSet
//LinkedHashSet just changed HashSet <->LinkedHashSet


import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;

class call{
    public static void main(String[] args) {
        LinkedHashSet hs = new LinkedHashSet();
        hs.add("jello");
        hs.add("helo");
        hs.add(10);
        hs.add(10.21);
        hs.add(12.32f);
        hs.add(null);
        System.out.println(hs);
        for(int i=0;i<hs.size();i++){
           // System.out.println(hs.get(i));//this is problem here
        }
    }
}