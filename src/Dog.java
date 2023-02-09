public class Dog {
    //setter
    //getter

    private float weight;
    private float height;
    private String color;

    public void setWeight(float weight) {
        if (weight<100) {
            this.weight = weight;
        }
    }

    public String getWeight() {
        return this.weight+"kg";
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
