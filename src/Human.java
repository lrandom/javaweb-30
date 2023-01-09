public class Human {
    static String className = "Human";

    public String name;
    public int age;
    public float height;
    public float weight;
    public String id;

    static String getClassName() {
        return className;
    }

    public Human(String name, int age, float height, float weight, String id) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.id = id;
    }

    public void eat() {
        System.out.println(this.name + " eating");
    }

    public void sleep() {
        System.out.println(this.name + " sleeping");
    }

    public void walk() {
        System.out.println(this.name + " walking");
    }
}
