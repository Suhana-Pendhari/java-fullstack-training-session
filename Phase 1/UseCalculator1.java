class Calculator1 {
    void add(int a){
        a++;
        System.out.println(a);
    }

}

public class UseCalculator1{
    void result(Calculator1 c){
        c.add(1);
    }
    public static void main(String[] args) {
        UseCalculator1 u = new UseCalculator1();
        Calculator1 cc = new Calculator1();
        u.result(cc);  // u.result(new Calculator1())
    }
}
