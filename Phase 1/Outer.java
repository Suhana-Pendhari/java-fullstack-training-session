class Outer {
    int x = 1;

    void collinner() {
        Inner i1 = new Inner();
        i1.add(100);
    }

    class Inner {
        int y = 10;

        void add(int a) {
            a++;
            System.out.println(a);
        }
    }

    public static void main(String args[]) {
        Outer o = new Outer();
        o.collinner();

        Outer.Inner ii = o.new Inner();
        ii.add(12);
    }
}
// protected exaple -only register people can attend lect but the owner can not
// attend the lec (TPO)

/*
 * 
 * class public default( no modifier- package friendly)
 * nested class public protected default private static
 * metod class public protected default private static
 * variable class public protected default private static
 * 
 */