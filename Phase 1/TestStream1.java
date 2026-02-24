import java.util.Arrays;

public class TestStream1 {
    public static void main(String[] args) {
        int marks[] = {76, 98, 100, 74, 98};

        System.out.println(Arrays.stream(marks).max().getAsInt());
        System.out.println(Arrays.stream(marks).min().getAsInt());
    }
}
