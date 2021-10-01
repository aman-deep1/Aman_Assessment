
// WAP to find length of ArrayList //

import java.util.Collection;
import java.util.*;

public class col5 {
    public static void main(String[] args) {
        List <Integer> values=new ArrayList<>();
        values.add(6);
        values.add(7);
        values.add(6);
        values.add(8);

        System.out.println(values);
        System.out.println("Size of Array: "+values.size());
        values.remove(2);
        System.out.println("After deletion size: "+values.size());

    }
}