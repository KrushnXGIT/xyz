interface Krushna{
    default void method1(){
        System.out.println("DefAULT METHOD");
    }
    static void method2(){
        System.out.println("sTATIC METHOD");
    }
}

class call implements Krushna{
    public static void main(String[] args) {
        call l = new call();
        l.method1();
        Krushna.method2();

    }
}