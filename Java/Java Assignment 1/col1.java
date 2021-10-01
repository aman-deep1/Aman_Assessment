
// WAP to traverse or iterate ArrayList//

import java.util.Collection;
import java.util.*;

public class col1 {
    public static void main(String[] args) {
        List <Integer> values=new ArrayList<>();
        values.add(1);
        values.add(4);
        values.add(2);
        values.add(4);
        values.add(8);

        Iterator it=values.iterator();
        System.out.println("ArrayList elements are: ");
        for (int i=0;i<values.size();i++){
            System.out.println(values.get(i)+ " ");
        }
    }
}
