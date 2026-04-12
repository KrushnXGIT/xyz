//Interface

interface i1{
    private static void helper(){
        System.out.println("skjfhds");
    }
    static void msg1(){
        helper();
        System.out.println("fdkgvkrjk");
        helper();
    }
    static void msg2(){
        helper();
        System.out.println("kjdfhjdh");
    }
}

class caller implements i1{
    public static void main(String[] args) {

        i1.msg1();
        i1.msg2();
    }
}