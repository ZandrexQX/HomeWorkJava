package HomeWorkGB;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class HomeWork004 {
    public static void main(String[] args) {
        LinkedList <Integer> list1 = 
            new LinkedList<Integer>(
            Arrays.asList(4,56,2,34,21,3,6,2,4,61,75,43,32,16,13));
            System.out.println(list1);
            System.out.println(reverseList(list1));

            // --------------------------------------
            
    }
    public static LinkedList reverseList(LinkedList l) {
        ListIterator listIterator = l.listIterator(l.size());
        LinkedList revList = new LinkedList<>();
        while (listIterator.hasPrevious()) {
            revList.add(listIterator.previous());
        }
        return revList;      
    }
}
