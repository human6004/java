package KeThua.Class;

public class Cylider extends Circle{
    private double height;
    public Cylider(double height, double radius, String color) {
        super(radius,color);
        this.height = height;

    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return super.getArea() * height;
    }
    public String toString(){
        return "Color : " + super.getColor() +
                "\nheight : " + String.format("%2f",height) +
                "\nRadius :" + String.format("%.2f",super.getRadius()) +
                "\nVolume : " + String.format("%.2f",getVolume()) +
                "\n-------------------------";
    }
}
