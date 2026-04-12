//Wrapper classes

class Caller{

    public static void main(String[] args) {
        Integer a=44;
        Integer b=44;
        System.out.println(a==b);       //false
        System.out.println(a.equals(b));//true

        //exception returns true for -128 to 127
        Integer a1=127;
        Integer b1=127;
        System.out.println(a1==b1);     //true
        //chemistry jaisa exception agya be!

    }
}
