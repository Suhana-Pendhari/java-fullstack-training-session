interface Lambdacalculator{
    void result(int a, int b);

    void add(int i, int j);
}

public class UselambdaCalculator implements Lambdacalculator {
    public void result(int a, int b){
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        Lambdacalculator lc = new UselambdaCalculator();
        lc.result(12, 23); 
    }
}

/*
Lambda is used for concise coding (small codes)
we dont nedd a class to implement the interface
no implements interface required
*/