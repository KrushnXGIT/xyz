//problem

import java.util.LinkedList;

class call{
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(10);
        ll.add(11);
        ll.add(8);
        ll.add(7);
        ll.add(5);
        ll.add(1);
        System.out.println(ll);

//        for(int i=0;i<ll.size();i++){
//            int it = ll.get(i);
//            if(it%2==0){
//                System.out.println("Even " +it );
//            }
//            else {
//                System.out.println("Odd "+it);
//            }
//        }
        ll.removeIf(x->x%2==0);
        System.out.println(ll);

    }
}