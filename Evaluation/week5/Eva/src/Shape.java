abstract public class Shape
{
    private String color;
    Shape(String a)
    {
        color = a;
    }
    abstract double getArea();
    String getColor()
    {
        return color;
    }
}
