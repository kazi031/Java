public class Triangle extends Shape
{
    private int base;
    private int height;
    public Triangle(String s,int l,int w)
    {
        super(s);
        base = l;
        height = w;
    }
    @Override
    double getArea()
    {
        return .5 * base * height;
    }
    @Override
    public String toString()
    {
        return "base: " + base + "\n" +"height: " + height + "\n" + "Area: " + getArea() + "\n" + "color: " + getColor() + "\n" + "Extends class Shape";
    }
}
