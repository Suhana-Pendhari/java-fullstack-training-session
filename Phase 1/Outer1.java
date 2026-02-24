class Outer1 {

    static class Inner1 {

        static void add(int a) {
            a++;
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        Outer1.Inner1.add(1);
    }
}
