package comparable;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main2 {
    public static void main(String[] args) {
        Comparator<Cat> catComparator = (cat, Cat) ->{
            return Cat.compareTo(Cat);

        };

        Comparator<Cat> catAgeComarator = (firstCat, secondCat)->{
            if(firstCat.getAge() < secondCat.getAge()) return -1;
            if(firstCat.getAge() > secondCat.getAge()) return 1;
            return 0;
        };

        Set<Cat> cats = new TreeSet<>();
        cats.add(new Cat("Ologbo", 10));
        cats.add(new Cat("Tom", 100));
        cats.add(new Cat("Gariied", 2));
        cats.add(new Cat("Anne", 50));

//        Set<Cat> cats = new TreeSet<>();
//        cats.add(new Cat("Ologbo", 10));
//        cats.add(new Cat("Tom", 100));
//        cats.add(new Cat("Gariied", 2));
//        cats.add(new Cat("Anne", 50));

        System.out.println(cats);




    }
}
