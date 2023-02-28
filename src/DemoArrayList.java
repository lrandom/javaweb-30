import java.util.ArrayList;

public class DemoArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Nguyen Van A");
        names.add("Nguyen Van A");

        for (String name: names
             ) {
            System.out.println(name);
        }

        names.remove(0);
        names.add(0, "Nguyen Van C");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
    }
}
