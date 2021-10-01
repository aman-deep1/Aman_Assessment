
// WAP to check if element exists in ArrayList //

import java.util.Collection;
import java.util.*;

public class col3 {
    public static void main(String[] args) {
        List <String> values=new ArrayList<>();
        values.add("ABC");
        values.add("XYZ");
        values.add("ABC");
        values.add("DEF");

        System.out.println(values.contains("ABC"));
        System.out.println(values.contains("IJK"));

    }
}
