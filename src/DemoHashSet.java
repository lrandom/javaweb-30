import java.util.HashSet;

public class DemoHashSet {
    public static void main(String[] args) {
        HashSet<String> strings = new HashSet<>();
        strings.add("Nguyen Van A");
        strings.add("Nguyen Van A");
        for (String string : strings
        ) {
            System.out.println(string);
        }
    }
}
