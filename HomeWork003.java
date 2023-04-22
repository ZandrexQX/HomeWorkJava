package HomeWorkGB;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HomeWork003 {
    public static void main(String[] args) {
        List<Integer>listNum = createList(10, 10, 50);
        System.out.println(listNum);
        System.out.println("Maximum: " + maxInteger(listNum));
        System.out.println("Minimum: " + minInteger(listNum));
        System.out.println("Average sum: " + averSum(listNum));
        removeEvenNum(listNum);
        System.out.println(listNum);
    }

    public static void removeEvenNum(List<Integer> listNum) {
        listNum.removeIf(num -> num%2 == 0);
    }

    public static Integer maxInteger(List<Integer> listNum) {
        return Collections.max(listNum);
    }

    public static Integer minInteger(List<Integer> listNum) {
        return Collections.min(listNum);
    }

    public static Integer averSum(List<Integer> listNum) {
        int averSum = 0;
        for (Integer integer : listNum) {
            averSum += integer;
        }
        return averSum /= listNum.size();
    }

    static List<Integer> createList(int size, int min, int max){
        List<Integer> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            list.add((int)(Math.random() * (max - min + 1) + min));
        }
        return list;
    }
}
