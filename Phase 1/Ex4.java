/*catch12 */



class Ex4 {

    static void div(int a, int b) {
        System.out.println(a / b);
    }

    public static void main(String[] ar) {

        try {
            String s1 = ar[0];
            String s2 = ar[1];

            System.out.println(s1 + s2);

            int a = Integer.parseInt(s1);
            int b = Integer.parseInt(s2);

            System.out.println(a + b);

            div(a, b);   // moved inside try

        } catch (ArrayIndexOutOfBoundsException e1) {

            System.out.println("Please enter any two values");

        } catch (NumberFormatException e2) {

            System.out.println("Please enter only numbers");

        } catch (ArithmeticException e3) {

            System.out.println("Cannot divide by zero");

        } finally {

            System.out.println("Finally block reached");
        }
    }
}