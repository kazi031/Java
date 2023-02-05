//class jodi final hoy tahole eke inherit kora jay na
abstract public class Shape {
    //final int location;
    //const er bodole final
    int location;
    int color;
    int borderthickness;
    public Shape()
    {
        location = 0; 
        color = 0;
        borderthickness = 0;       
    }
    public Shape(int l,int c,int b)
    {
        location = l; 
        color = c;
        borderthickness = b;       
    }
    abstract public void draw();
    //override kora jabe na final likhle
    //early binding
    final public void move()
    {
        
    }
    public void changeColor()
    {
        
    }
}
