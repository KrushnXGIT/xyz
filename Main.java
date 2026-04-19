//JAVA--8--FEATURES
//FEATURE-LAMBDA FUNCTION

@FunctionalInterface
interface addInt {
    int sum(int a,int b);
}

interface String_{
    int lenst(String s);
}



class call{
    public static void main(String[] args) {
//        Runnable hello = () -> System.out.println("hello");
//        System.out.println(hello); //outputs=> call$$Lambda$14/0x0000023047001200@e9e54c2
        addInt add = (p,q)->p+q;
        System.out.println(add.sum(10,12));
        String_ fun = (s)->s.length();
        System.out.println(fun.lenst("Krushna"));
    }
}