//Wrapper classes
//Primitive --> Object
class Caller{
    public static void main(String[] args) {
        int a=10;
        Integer b = a; //auto Boxing
        Integer c =11;
        System.out.println(b.getClass());
        System.out.print(c);
    }
}