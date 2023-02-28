import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;

public class WildCard {
    public void display(ArrayList<? extends Number> lists) {
        for (Number listItem : lists
        ) {
            System.out.println(listItem);
        }
    }

    public static void main(String[] args) {
        WildCard wildCard = new WildCard();

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(10);
        integers.add(20);

        wildCard.display(integers);

        ArrayList<Float> floats = new ArrayList<>();
        floats.add(10.5f);
        floats.add(20.5f);
        wildCard.display(floats);

        /*ArrayList<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("World");
        wildCard.display(strings);*/
    }
}
