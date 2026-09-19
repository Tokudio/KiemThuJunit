package HinhHoc;

public class Triangle extends Shape {

    private float base;
    private float height;

    public Triangle(String n) {
        super(n);
    }

    public Triangle(String n, float b, float h) {
        super(n);
        base = b;
        height = h;
    }

    public float getBase() {
        return base;
    }

    public float getHeight() {
        return height;
    }

    public void setBase(float b) {
        base = b;
    }

    public void setHeight(float h) {
        height = h;
    }

    @Override
    public float getArea() {
        return 0.5f * base * height;
    }
}
