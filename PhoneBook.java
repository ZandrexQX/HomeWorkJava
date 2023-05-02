package HomeWorkGB;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {
    private Map<String, ArrayList<Integer>> map = new HashMap<>();

    void add (String name){
        ArrayList<Integer> phones = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер телефона " + name + " (ноль, чтобы выйти):");
        Integer line = Integer.parseInt(sc.nextLine());
        while (line != 0) {
            phones.add(line);
            System.out.println("Введите номер телефона для " + name + " (ноль, чтобы выйти):");
            line = Integer.parseInt(sc.nextLine());
        }
        map.put(name, phones);
        System.out.println("Num add");
    }

    String printNumbers (String name){
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, ArrayList<Integer>> item : map.entrySet()) {
            if (item.getKey().equals(name)) {
                sb.append(item.getKey());
                sb.append(": ");
                sb.append(item.getValue());
                sb.append("\n");
            }
        }
        if (sb.length() == 0) {
            return "записей нет.";
        }
        return sb.toString();
    }
}
