package com.JavaCollectionFramework.Vector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;
public class VE1 {
    public static void main(String[] arg) {
        Vector<String> vc = new Vector<>(4);
        vc.add("A");
        vc.add("B");
        vc.add("C");
        vc.add("D");
        vc.add("E");
        System.out.println("--Elements of Vector are--");
        for (String str : vc) {
            System.out.println("Alphabet= " +str);
        }

        //addall
        Vector<String> vc2 = new Vector<>(4);
        //Add elements in the first vector
        vc2.add("E");
        vc2.add("F");
        vc2.add("G");
        vc2.add("H");

        vc.addAll(0, vc2);
        System.out.println("Final vector list: "+vc);


        vc.addElement("I");

        System.out.println("Current capacity of Vector is: "+vc.capacity());

        System.out.println("Cloned vector: "+vc.clone());

        System.out.println("Existence: "+vc.containsAll(vc2));

        if(vc.contains("G"))
        {
            System.out.println("G is present at the index " +vc.indexOf("G"));
        }
        else
        {
            System.out.println("G is not present in the list");
        }

        String[] arr = new String[10];
        ArrayList<String> arr2 = new ArrayList<>();

        vc.copyInto(arr);
       // vc.copyInto(arr2);
        System.out.println("Elements of the Array: ");
        //Print elements of an Array
        for(String temp : arr)
        {
            System.out.println(temp);
        }

        //Use forEach() method to print vector elements
        vc.forEach(System.out::println);

        System.out.println("Element at index 1 is = "+vc.get(1));

        System.out.println("Is the Vector empty? = " +vc.isEmpty());

        Iterator<String> itr = vc.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }


        Collections.sort(vc);

        String str = vc.toString();
        System.out.println("Contents of a vector are: "+str);


        System.out.println("Remove first occourence of element G: "+vc.remove((String)"G"));

        vc.clear();
        System.out.println("Size of Vector after clear() method: "+vc.size());

    }
}
