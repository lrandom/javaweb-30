public class Calc {
    public float sum(int a, int b) {
        return a + b;
    }

    public float sum(float a, float b) {
        return a + b;
    }

    public float sum(int a, int b, int c) {
        return a + b + c;
    }

    public float sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public static void main(String[] args) {
        Calc calc = new Calc();
        System.out.println(calc.sum(1, 2));
        System.out.println(calc.sum(1.0f, 2.0f));
    }
}
