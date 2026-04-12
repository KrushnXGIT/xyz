//INTERFACE
/*
class Ex{
    void fun(){
        System.out.println("Hello .. Students are good");
    }
}

interface i1{
    void fun1();
}

class Caller extends Ex implements i1{
    public void fun1(){

    }
}*/

interface i1{
    default void fun(){
        System.out.println("slckslk");
    }
    void fun1();
    void fun2();
}

class caller implements i1{
    public void fun1(){

    }
    public void fun2(){

    }
}

public static void main(String[] args) {

}











