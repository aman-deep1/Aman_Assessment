import java.util.Collection;
import java.util.*;


// WAP to check if element exists in HashSet//

public class col4 {
    public static void main(String[] args) {
        Set<Integer> values = new HashSet<>();
        values.add(6);
        values.add(7);
        values.add(6);
        values.add(8);
        System.out.println("Elements" + values);
        System.out.println(values.contains(7));

    }
}
