interface I1{
    default void show(){
        System.out.println("One");
    }
}

interface I2{
    default void show(){
        System.out.println("Two");
    }
}

class Caller implements I1,I2{
    public void show(){
        I1.super.show();
    }

    public static void main(String[] args) {

    }
}

/** Interface Diamond Problem--*
 * When two methods come and compiler dont know which to call then we use I1.super.show();
 */
