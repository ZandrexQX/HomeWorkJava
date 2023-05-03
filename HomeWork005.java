package HomeWorkGB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class HomeWork005 {
    public static void main(String[] args) {
        // PhoneBook pb = new PhoneBook();
        // pb.add("Alex");
        // pb.add("Zara");
        // System.out.println(pb.printNumbers("Alex"));
        // System.out.println(pb.printNumbers("Zara"));
        //-----------------------------------------------
        ArrayList<String> peoples = 
        new ArrayList<String>
        (Arrays.asList("Иван Иванов", "Светлана Петрова", "Кристина Белова",
                        "Анна Мусина", "Анна Крутова", "Иван Юрин", "Петр Лыков",
                        "Павел Чернов", "Петр Чернышов", "Мария Федорова",
                        "Марина Светлова", "Мария Савина", "Мария Рыкова", 
                        "Марина Лугова", "Анна Владимирова", "Иван Мечников",
                        "Петр Петин", "Иван Ежов"));
        
        sortPeople(peoples);
    }
    public static void sortPeople(ArrayList<String> p) {
        Map<String, Integer> names = new TreeMap<String, Integer>();
        for (int i = 0; i < p.size(); i++) {
            String name = p.get(i).split(" ")[0];
            int count = 0;
            for (int j = 0; j < p.size(); j++) {
                String n1 = p.get(j).split(" ")[0];
                if (n1.equals(name)){
                    count++;
                }
            }
            names.put(name, count);
        }
        for(Map.Entry<String, Integer> item : names.entrySet()){
            System.out.printf("Name: %s  Count: %s \n", item.getKey(), item.getValue());
        }
    }
    public static void name() {
        
    }
}
