//Wrapper classes

class Caller{

    public static void main(String[] args) {
        //parseXxx()
        String s1 = "123";
        int a=Integer.parseInt(s1);
        System.out.println(s1);

        //toString()
        Integer b=10;

        String s=b+"";
        System.out.println(s);

        //instead of this
        String s2= b.toString();
        System.out.println(s2);

        //hashCode()
        Integer k = 100;
        System.out.println(k.hashCode()); //returns same here but it will be used in hashMap
        String kj ="hii";
        String kq = "hii";
        System.out.println(kj.hashCode());
        System.out.println(kq.hashCode()); //here it will return same hashcode this is the usecase

        //class Specific important methods
        Integer.parseInt("123");
        System.out.println(Integer.toBinaryString(13));
        System.out.println(Integer.toHexString(13));
        System.out.println(Integer.max(13,21));
        System.out.println(Integer.min(13,21));
        System.out.println(Integer.sum(23,31));
        System.out.println(Integer.parseInt("1110101",2));

    }
}
