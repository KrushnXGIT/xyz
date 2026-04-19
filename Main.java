//JAVA--8--FEATURES
//FEATURE-STREAM API

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class employees{
    public static void main(String[] args) {
        List<String> list = new ArrayList(Arrays.asList("pratap","pratik","amol","harshad"));
//        list.stream().filter(emp->emp.startsWith("p")).forEach(null);
        list.stream().filter(emp->emp.startsWith("p")).forEach(System.out::println);//java8 ka hi feature //streaming hota hai sirf isse
        //list change nahi hogi
        //System.out.println(list);
    }
}