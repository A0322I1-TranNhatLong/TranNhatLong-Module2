package ss5_Access_modifier_static_method_static_property.bai_tap;

public class Access_modifier {
    private double radius=1.0;
    private String color="red";

    public Access_modifier() {
    }
    public Access_modifier(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getArea()
    {
        return Math.PI*this.radius*this.radius;
    }
}
