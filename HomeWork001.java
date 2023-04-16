package HomeWorkGB;

import java.util.ArrayList;
import java.util.Scanner;

public class HomeWork001 {
    public static void main(String[] args) {
        System.out.println(TriangNumber(8)); // Task 1.1
        System.out.println(Fact(5)); // Task 1.2
        System.out.println(SimpleNum(1000)); // Task 1.3
        CalcMain(); // Task 1.4
    }

    public static int TriangNumber(int a) {
        return a*(a+1)/2;
    }

    public static int Fact(int a) {
        if (a>1) return Fact(a-1)*a;
        return 1;
    }

    public static ArrayList SimpleNum(int a) {
        ArrayList<Integer> list_result = new ArrayList<Integer>();
        int count = 1;
        list_result.add(count);
        while (count<a) {
            count++;
            int temp = 2;
            int count_temp = 0;
            while(temp<=count){
                if (count%temp == 0) count_temp++;
                temp++;
            }
            if (count_temp == 1) list_result.add(count);
        }
        return list_result;
    }

    public static void CalcMain() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Введите первое число: ");
            double a = sc.nextInt();
            System.out.println("Введите второе число: ");
            double b = sc.nextInt();
            System.out.println("Введите команду: ");
            String oper = sc.next();
            Double c = EnterCommands(oper, a, b);
            while (c == null){
                System.out.println("Комманды: \n"+
                                    "add - сложение\n"+
                                    "sub - вычитание\n"+
                                    "div - деление\n"+
                                    "mult - умножение\n"+
                                    "rem  - остаток\n");
                System.out.println("Введите команду: ");
                oper = sc.next();
                c = EnterCommands(oper, a, b);
            }
            System.out.println("Ответ: " + c);
        }
        catch(Exception ex){
            System.out.println("Ошибка! Вводите числа!");
        }
    }

    public static Double EnterCommands(String oper, double a, double b) {
        switch (oper) {
            case "add": return a+b;
            case "sub": return a-b;
            case "div": return a/b;
            case "mult": return a*b;
            case "rem": return a%b;
            default: return null;
        }
    }
}
