//Collection FRAMEWORKS
//TreeSet

import java.util.TreeSet;

class call{
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add("Hello");
        ts.add("Jello");
        ts.add("Command");
        System.out.println(ts);
        for(int i=0;i<ts.size();i++){
            //System.out.println(ts.get(i));//not allowed;
        }
    }
}