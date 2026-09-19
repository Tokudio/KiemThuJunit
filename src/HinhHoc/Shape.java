package HinhHoc;

public abstract class Shape {

    private String name;

    public Shape(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public abstract float getArea();
}
