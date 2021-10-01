import java.util.Collection;
import java.util.*;
import java.util.Scanner;

// WAP to check if element exists in HashSet//

public class col4 {
    public static void main(String[] args) {
        Set<Integer> values = new HashSet<>();
        values.add(6);
        values.add(7);
        values.add(6);
        values.add(8);


        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value");
        int x= sc.nextInt();
        if(values.contains(x)){
            System.out.println("HashSet contains: " +x);
        }
        else{
            System.out.println("HashSet not contains: " +x);
        }

    }
}
