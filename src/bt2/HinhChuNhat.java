package bt2;

public class HinhChuNhat {
    private float width;
    private float height;

    public HinhChuNhat() {

    }
    public HinhChuNhat(float width, float height) {
        this.width = width;
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float chuVi() {
        return this.width * 2 + this.height * 2;
    }

    public float dienTich() {
        return this.width * this.height;
    }
}
