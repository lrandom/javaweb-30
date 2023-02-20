public class EqualZeroException extends Exception{
    private int inputNumber;
    public EqualZeroException(int input) {
        this.inputNumber = input;
    }

    @Override
    public String getMessage() {
        return "Bạn vừa nhập vào số "+this.inputNumber+", Vui lòng nhập một số lớn khác 0";
    }
}
