//Collection FRAMEWORKS
//Stack


import java.util.Iterator;
import java.util.Stack;

class call {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push("Hllo");
        s.push("JiraMasala");
        s.push("Krushna");
        System.out.println(s.peek());
        System.out.println(s);
        for(int i=0;i<s.size();i++){
            System.out.println(s.get(i));
        }
        for(Object o:s){
            System.out.println(o);
        }
        Iterator it = s.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}