import java.util.ArrayList;

public class WildCard2 {
    public void display(ArrayList<?> lists) {
        for (Object listItem : lists
        ) {
            System.out.println(listItem);
        }
    }

    public static void main(String[] args) {
        WildCard2 wildCard2 = new WildCard2();

        ArrayList<String> numbers = new ArrayList<>();
        numbers.add("10");
        numbers.add("10");


        wildCard2.display(numbers);
    }
}
