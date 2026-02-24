class One{
    public static void main(String[] args) {
        System.out.println("One.main() called");
    }
}

public class Two {
    public static void main(String[] args) {
        System.out.println("Two.main() called");
        One.main(args);
    }
}
