//Collection FRAMEWORKS
//TreeSet

import java.util.Comparator;
import java.util.TreeSet;

class Mycomparator implements Comparator<Integer>{
//    @Override
//    public Comparator<Integer> reversed() {
//        return Comparator.super.reversed();
//    }
    @Override
    public int compare(Integer o1,Integer o2){
        Integer a = (Integer) o1;
        Integer b = (Integer) o2;
        return -a.compareTo(b);
        //return a.compareTo(b);<--this will natural sort
    }
}

class Tree{
    public static void main(String[] args) {
        TreeSet<Integer> t = new TreeSet<Integer>(new Mycomparator());
        t.add(10);
        t.add(12);
        t.add(1);
        t.add(-2);
        t.add(-13);
        t.add(-1);
        t.add(7);
        System.out.println(t);
    }
}