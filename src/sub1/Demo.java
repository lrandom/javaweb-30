package sub1;


public class Demo {
    public static void main(String[] args) {
        //Animal animal = new Animal();
        ///animal.run();
        Animal dog = new Animal() {
            @Override
            public void jump() {

            }
        };

        Button button = new Button();
        button.addEventListener(new ClickEventListener() {
            @Override
            public void onClickHandler() {
                System.out.println("ABC");
            }
        });

        Button button1 = new Button();
        button1.addEventListener(new ClickEventListener() {
            @Override
            public void onClickHandler() {
                System.out.println("DEF");
            }
        });
    }
}
