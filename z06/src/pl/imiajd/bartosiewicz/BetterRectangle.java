package pl.imiajd.bartosiewicz;
import static java.lang.Math.sqrt;

public class BetterRectangle extends java.awt.Rectangle{
    public BetterRectangle(int x, int y, int height, int width) {
        super(x, y, width, height);
        setLocation(x, y);
        setSize(width, height);
    }
    public double getPerimeter() {
        return  sqrt((float)(width/2)*(float)(width/2)+height*height)*2+width;
    }
    public double getArea() {
        return (float) height*width/2;
    }
}
