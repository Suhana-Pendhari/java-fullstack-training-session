import java.util.LinkedList;
import java.util.List;

public class Iterabletest1 {
    public static void main(String[] args) {
        List<String> names = new LinkedList<>();
        names.add("java");
        names.add("python");
        names.add("node");
        int count = 0;

        for(String name : names){
            System.out.println(name);
            count++;
        }
        System.out.println("Number of elemnts in List: "+count);
    }
}
