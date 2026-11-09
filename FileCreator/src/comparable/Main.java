package comparable;


import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
   public static void main(String[] args) {
//        Set<Integer> numbers = new TreeSet<>();
       Set<Integer> numbers = new HashSet<>();
        numbers.add(30);
        numbers.add(50);
        numbers.add(20);
        numbers.add(10);
        numbers.add(5);
        System.out.println(numbers);


        Integer number =5;
        System.out.println(number.compareTo(5));
        System.out.println(number.compareTo(10));
        System.out.println(number.compareTo(2));
    }
}
