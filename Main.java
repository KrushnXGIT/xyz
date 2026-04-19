import javax.swing.text.html.Option;
import java.util.Optional;

class opti{
    public static Optional<String> getName(){
        String s="mit";
        return Optional.ofNullable(s);
    }
}

class OptionalPractice{
    public static void main(String[] args) {
        String s=null;
        /*
        if(s==null) System.out.println("this is null");
        else System.out.println(s.length()); //i cannot do if-else if i have 1000strings this will make code less readeable
        //therefore we can use OptionalCLASS
        */
        System.out.println();

        Optional<String> opt= Optional.ofNullable(s);
        System.out.println(opt.isPresent());
        //System.out.println(opt.get());//this fails if s is null
        System.out.println(opt.orElse("string is null"));


        Optional<String> newOPT = opti.getName();
        System.out.println(newOPT.orElse("String empty"));
    }

}