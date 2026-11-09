
//public class ObjectArray{
//    public static void main(String[] args){
//
//
//        Object[] items = new Object[3];
//        items[0] = "Ada";
//        items[1] = "Tunde";
//        items[2] = "42";
//
//    }


//}

//import java.util.ArrayList;
//import java.util.List;
//
//public class Main {
//    public static void main(String[] args) {
//        List <int> names = new ArrayList<String>();
//
//        names.add("Ada");
//
//        List<Integer> ages = new ArrayList<>();
//        ages.add(10);
//        String first = names.
//
//
//    }
//}


//public class Main {
//    public static void main(String[] args) {
//    String[] names = {"Ada", "Tunde"};
//
//    names = new String[]{"Ada", "Tunde", "Zainab"};
//
//    System.out.print(names.length);
//    }
//


//import java.util.ArrayList;
//import java.util.List;
//
//public class Main {
//    public static void main(String[] args) {
//        try {
//            List<String> list = new ArrayList<>(List.of("a", "b", "c", "c"));
//            for (String s : list) {
//
//                if (s.equals("b")) list.remove(s);
//            }


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

////            System.out.println(list);
//        }catch (Exception e){
//            System.out.print(e.printStackTrace());
//        }
//    }
//}



//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;
//
//public class Main {
//    public static void main(String[] args) {
//
//        List<String> list = new ArrayList<>(List.of("a", "b", "c", "d"));
//        Iterator<String> it = list.iterator();
//        while (it.hasNext()) {
//            if (it.next().equals("b")) {
//                it.remove();
//            }
//        }
//        System.out.print(list);
//    }
//    }
//


public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(List.of("Smart", "Tunde", "Zainab", "Bola", "Kenny"));
        list.add(0, "Ife");

//

        System.out.print(list);
    }
}
