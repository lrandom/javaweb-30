public class Calculator {
    private int a = 0;
    private int b = 0;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) throws BiggerThanZeroException, EqualZeroException {
        if (b < 0) {
            throw new BiggerThanZeroException(b);
        }
        if (b == 0) {
            throw new EqualZeroException(b);
        }
        this.b = b;
    }


    public int div() {
        return a / b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setA(10);

        try {
            calculator.setB(-10);
            System.out.println(calculator.div());
        } catch (Exception e) {

        }finally {
            System.out.println("Kết thúc chương trình");
        }
    }
}
