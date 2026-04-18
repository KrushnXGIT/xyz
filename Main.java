//String SCP HEAP , OBJECT->STRING STRINGBUFFER STRINGBUILDER


class Call{
    public void m1(String s){
        System.out.println("String versioned");
    }
    public void m1(StringBuffer s){
        System.out.println("StringBuffer versioned");
    }
    public void m2(int i){
        System.out.println("Gen Method");
    }
    public void m2(int ...i){
        System.out.println("VAR-ARG MEHTOD");
    }
    public static void main(String[] args) {
        Call c = new Call();
        c.m1("Pratap");
        c.m1(new StringBuffer("KDK"));
        c.m2();
        c.m2(10,20);
    }

}


