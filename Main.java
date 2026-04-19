//program use stream to sort even
//used collectors
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

class caller{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList(Arrays.asList(1,2,3,4,5,6,7));
        System.out.println(list);
        list.stream().filter(l->l%2==0).forEach(System.out::println);
        List<Integer> ls = list.stream().filter(l->l%2==0).collect(Collectors.toList());
        System.out.println(ls);
    }
}