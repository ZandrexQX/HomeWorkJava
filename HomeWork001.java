package HomeWorkGB;

import java.util.ArrayList;

public class HomeWork001 {
    public static void main(String[] args) {
        System.out.println(TriangNumber(8)); // Task 1.1
        System.out.println(Fact(5)); // Task 1.2
        System.out.println(SimpleNum(1000)); // Task 1.3
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
                if (count%temp == 0){
                    count_temp++;
                }
                temp++;
            }
            if (count_temp == 1) list_result.add(count);
        }
        return list_result;
    }
}
