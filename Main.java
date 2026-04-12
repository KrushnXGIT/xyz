//Interface

interface i1{
    private void regularCode(){
        System.out.println("skjfhds");
    }
    default void msg1(){
        regularCode();
        System.out.println("fdkgvkrjk");
        regularCode();
    }
    default void msg2(){
        regularCode();
        System.out.println("kjdfhjdh");
    }
}

class caller implements i1{
    public static void main(String[] args) {
        caller c1 = new caller();
        c1.msg1();
        c1.msg2();
    }
}