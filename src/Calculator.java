public class Calculator {
/*    public Integer add(Integer a, Integer b) {
        return a + b;
    }

    public Float add(Float a, Float b) {
        return a + b;
    }*/

    public <T> T add(T a, T b) {
        if(a instanceof Integer && b instanceof Integer) {
            return (T) Integer.valueOf((Integer) a + (Integer) b);
        } else if(a instanceof Float && b instanceof Float) {
            return (T) Float.valueOf((Float) a + (Float) b);
        }
        return null;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(10, 20));
        System.out.println(calculator.add(10.5f, 20.5f));
    }
}
