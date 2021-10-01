
// WAP to convert List to Array //

import java.util.Collection;
import java.util.*;

public class col2 {
    public static void main(String[] args) {

        List <String> values=new ArrayList<>();
        values.add("Aman");
        values.add("Peter");
        values.add("Aman");
        values.add("John");
        System.out.println("Converting List to Array" );

        String[] strArray=new String[values.size()];
        strArray =values.toArray(strArray);
        System.out.println(values);
    }
}
