package HomeWorkGB;

public class HomeWork001 {
    public static void main(String[] args) {
        System.out.println(TriangNumber(8)); // Task 1.1
        System.out.println(Fact(5)); // Task 1.2
    }

    public static int TriangNumber(int a) {
        return a*(a+1)/2;
    }

    public static int Fact(int a) {
        if (a>1) return Fact(a-1)*a;
        return 1;
    }
}
