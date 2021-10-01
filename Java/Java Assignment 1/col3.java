
// WAP to check if element exists in ArrayList //

import java.util.Collection;
import java.util.*;
import java.util.Scanner;

public class col3 {
    public static void main(String[] args) {
        List <String> values=new ArrayList<>();
        values.add("ABC");
        values.add("XYZ");
        values.add("ABC");
        values.add("DEF");

        System.out.println(values);

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value");

        String z= sc.next();
        if(values.contains(z)){
            System.out.println("Element exists: " +z);
        }
        else{
            System.out.println("Element not exists: " +z);
        }

     //   System.out.println("Array contains the value :"+values.contains("ABC"));
       // System.out.println("Array contains the value: "+values.contains("IJK"));

    }
}
