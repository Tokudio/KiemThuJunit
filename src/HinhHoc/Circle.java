package HinhHoc;

public class Circle extends Shape {

    private float radius;

    public Circle(String n) {
        super(n);
    }

    public Circle(String n, float r) {
        super(n);
        radius = r;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float r) {
        radius = r;
    }

    @Override
    public float getArea() {
        return (float) Math.PI * radius * radius;
    }
}