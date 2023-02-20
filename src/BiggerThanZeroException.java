public class BiggerThanZeroException extends Exception {
    private int inputNumber;
    public BiggerThanZeroException(int input) {
        this.inputNumber = input;
    }

    @Override
    public String getMessage() {
        return "Bạn vừa nhập vào số "+this.inputNumber+", Vui lòng nhập một số lớn hơn hơn 0";
    }
}
