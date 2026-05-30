
import java.util.Scanner;
import java.util.Stack;

class caller{
    public static void main(String[] args) {
        Stack s = new Stack();
        Scanner sc = new Scanner(System.in);
        String bracks = new String(sc.nextLine());
        for(int i=0;i<bracks.length();i++){
            if(bracks.charAt(i)=='<' || bracks.charAt(i)=='(' || bracks.charAt(i)=='[' || bracks.charAt(i)=='{'){
                s.add(bracks.charAt(i));
            }
            else{
                s.pop();
            }
        }

        if(!s.empty()){
            System.out.println("Not balanced");
        }else{
            System.out.println("Balanced");
        }
        System.out.println(s);
    }
}