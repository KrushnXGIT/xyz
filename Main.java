//Overriding
class Parent{
    public void property(){
        System.out.println("Property");
    }
    public void marriage(){
        System.out.println("Priyanka");
    }
}

class MyChoice extends Parent{
    //Simple Overriding
    public void marriage(){
        System.out.println("Katrina");
    }
}

class Main{
    public static void main(String[] args) {
        Parent p = new Parent();
        p.marriage();
        MyChoice m = new MyChoice();
        m.marriage();
        Parent p1 = new MyChoice();
        p1.marriage();
    }
}