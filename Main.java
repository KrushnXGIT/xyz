//Wrapper classes

class Caller{

    public static void main(String[] args) {
        //.isNaN()
        System.out.println(Double.isNaN(3.12));//true
        System.out.println(Double.isNaN(12)); //false
        //.isInfinite()
        System.out.println(Double.isInfinite(1/0.0));
        //.isNaN()
        System.out.println(Double.isNaN(Math.sqrt(-1)));
        System.out.println(Double.isNaN(0.0/0.0));
    }
}
