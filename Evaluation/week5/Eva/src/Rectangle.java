public class Rectangle extends Shape
{
    private int length;
    private int width;
    public Rectangle(String s,int l,int w)
    {
        super(s);
        length = l;
        width = w;
    }
    @Override
    double getArea()
    {
        return length * width;
    }
    @Override
    public String toString()
    {
        return "Length: " + length + "\n" +"Width: " + width + "\n" + "Area: " + getArea() + "\n" + "color: " + getColor() + "\n" + "Extends class Shape";
    }
}
