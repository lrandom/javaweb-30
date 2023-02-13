public class Button {
    public void addEventListener(OnClickListener listener) {
        listener.onClick();
    }

    public static void main(String[] args) {
        Button button = new Button();
        button.addEventListener(new OnClickListener() {
            public void onClick() {
                System.out.println("Button clicked");
            }
        });
    }
}


