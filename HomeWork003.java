package HomeWorkGB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class HomeWork003 {
    static List<String> namePlanets = new ArrayList<>(Arrays.asList("Меркурий","Венера","Земля","Марс","Юпитер","Сатурн","Уран","Нептун"));
    public static void main(String[] args) {
        List<Integer>listNum = createList(10, 10, 50);
        System.out.println(listNum);
        System.out.println("Maximum: " + maxInteger(listNum));
        System.out.println("Minimum: " + minInteger(listNum));
        System.out.println("Average sum: " + averSum(listNum));
        removeEvenNum(listNum);
        System.out.println(listNum);
        // ---------------------------------
        List<String> listPlanets = createListPlanets(20);
        System.out.println(listPlanets);
        System.out.println(outPlanet(listPlanets));

    }
    public static String outPlanet(List<String> listPlanets) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < namePlanets.size(); i++) {
            String planet = namePlanets.get(i);
            StringBuilder sbTemp = new StringBuilder();
            sbTemp.append(planet + ": ");
            int sum = 0;
            for (int j = 0; j < listPlanets.size(); j++) {
                if (planet.equals(listPlanets.get(j))){
                    sum += 1;
                }
            }
            sbTemp.append(sum);
            sb.append(sbTemp + "\n");
        }
        return sb.toString();
    }
    public static List<String> createListPlanets(int size) {
        List<String> listPlanets = new ArrayList<String>(size);
        for (int i = 0; i < size; i++) {
            Random r = new Random();
            int q = r.nextInt(namePlanets.size());
            listPlanets.add(namePlanets.get(q));
        }
        return listPlanets;
    }
// ----------------------------------
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
