interface Lamdaclaculator{
    void result(int a, int b)
}

public class Test {
    public static void main(String[] args) {
        Lambdacalculator c = (a, b)->System.out.println(a+b);
        c.add(12, 23);
    }
}
