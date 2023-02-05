public interface Shape {
    String name = "";
    int location = 0;
    int color = 0;
    int borderthickness = 0;
    
    
    
    public void draw();
    public void move();
    public void changeColor();
}