/*Lambda Thread -Runnable interface becomes a functional interface frm jdk 8*/

class LambdaThread {

    public static void main(String ar[]) {
        System.out.println("SUHANA CSE");
        Runnable r = () -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                }
            }
        };
        Thread tt = new Thread(r);
        tt.start();
    }
}