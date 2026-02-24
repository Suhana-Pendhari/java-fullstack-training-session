import java.io.*;

class AddTwoNumbers {
    public static void main(String ar[]) {
        int a = 0;
        int b = 0;

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter num1:");
            String s1 = br.readLine();
            a = Integer.parseInt(s1);

            System.out.println("Enter num2:");
            String s2 = br.readLine();
            b = Integer.parseInt(s2);

            System.out.println("Sum = " + (a + b));
        }
        catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}