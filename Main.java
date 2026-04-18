//Object class String class

class Stirng1{
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("pratap");
        StringBuffer sb2 = new StringBuffer("pratap");
        System.out.println(sb1==sb2);
        System.out.println(sb1.equals(sb2)); //this calls Object class .equals because it doesnt override
    }
}