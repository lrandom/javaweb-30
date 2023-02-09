package sub;

public class Dog extends Animal{
    private float weight;
    private float height;
    public static void main(String[] args) {
        Dog zin = new Dog();
        System.out.println(zin.name);
        zin.run();
    }

}

