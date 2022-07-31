public class Rectangle extends Shape{
    private int width;
    private int height;

    // 1st constructor
    public Rectangle(int width, int height) {
        this(0, 0, width, height); //calls 2nd constructor
    }

    // 2nd constructor
    public Rectangle(int x, int y, int width, int height) {
        super(x, y);    //calls constructor from parent (Shape)
        this.width = width;
        this.height = height;
    }
}
