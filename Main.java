//Automatic Promotion

class Test{
    void m1(int i){
        System.out.println("Int");
    }
    void m1(float k){
        System.out.println("Float");
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.m1(1);
        t.m1(5.2f);
        t.m1('c');
        //t.m1(10.6); //<-this is problematic because double has no auto promotion

    }
}

