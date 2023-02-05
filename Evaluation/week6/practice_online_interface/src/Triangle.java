public class Triangle extends Intermidiate
{
        int height;
        int base;
        Triangle(int h,int b,String s)
        {
            super(s);
            height = h;
            base = b;
        }
//        public void getColor()
//        {
//            System.out.println("Yellow");
//        }
        public double area()
        {
            return .5 * height * base;
        }
}
