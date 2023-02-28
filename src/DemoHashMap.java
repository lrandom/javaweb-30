import java.util.HashMap;
import java.util.Iterator;

public class DemoHashMap {
    public static void main(String[] args) {
        HashMap<String, String> students = new HashMap();
        students.put("A", "Nguyễn Văn A");
        students.put("B", "Nguyễn Văn B");
        students.get("A");
        students.remove("A");

        for (String key: students.keySet()
             ) {
            System.out.println(key + " - " + students.get(key));
        }

        Iterator<String> iterator = students.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println(key + " - " + students.get(key));
        }

        for (String value: students.values()
             ) {
            System.out.println(value);
        }


    }
}
