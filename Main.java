/*
//this and super
class A{
    int a = 0;
    int b = 0;
    void acceptdata(int a,int b){
        a=a;
        b=b;
    }
}
class Caller{

    public static void main(String[] args) {
        A f= new A();
        f.acceptdata(23,45);
        System.out.println(A.a);
        //this();
        //super.x;
    }
}*/
/*
class Student{
    {
        //initialisation block ran 1st
    }
    Student(){
        //constructor ran 3rd
    }
    {
        //initialisation block ran 2nd
    }
}
*/

//instance initialisation block
//static initialisation block runs only once when first object is created
/*
//something different here see
//this is running why?
class Student{
    static{
        System.out.println();
    }

    public static void main(String[] args) {

    }
}
*/

class A{
    {
        System.out.println("Init A called");
    }
    A(){
        this(1);
    }
    A(int x){
        System.out.println("PARA A CALLED");
    }
}

class B extends A{
    {

    }
    B(){
        System.out.println("B constructor called");
    }
}







































