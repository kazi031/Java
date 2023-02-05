public class Rectriangle extends Intermidiate {
    int height;
    int width;
    Rectriangle(int h,int w,String s)
    {
        super(s);
        height = h;
        width = w;
    }
//    public void getColor()
//    {
//        System.out.println("Yellow");
//    }
    public double  area()
    {
        return height * width;
    }
}
