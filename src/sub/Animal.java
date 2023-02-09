package sub;

class Animal {
    protected String name = "Zin";

    //non abstract method
    final void run() {
        this.name = "ABC";
        System.out.println(this.name);
        System.out.println("Running");
    }
}
