package Collection_Interfaces;

import java.util.*;

public class Array_List {
    public static void main(String[] args){
        List<Integer> list1 = new ArrayList<>();

        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);

        System.out.println(list1);
        System.out.println("Size of Arraylist - " + list1.size());
        System.out.println("isEmpty? -> " + list1.isEmpty());
        System.out.println("Contains 30? -> " + list1.contains(30));
        System.out.println("Contains 90? -> " + list1.contains(90));

        // Adding One List to Another
        List<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        System.out.println("List 2 -> " + list2);

//        System.out.println("Adding list1 to list2");
//        list2.addAll(list1);
//        System.out.println("Updated List2 -> " + list2);

//        list1.removeAll(list2); // Will remove intersecting elements from list1
//        System.out.println(list1);

        list1.retainAll(list2); // Will only Keep Intersection in List1 and remove all other elements
        System.out.println(list1);
    }
}
