import java.awt.*;

public class Rectangle {
    private int x;
    private int y;
    private int width;
    private int height;
    private Color colour;
    public Rectangle(int _x, int _y, int _width, int _height, Color _colour){
        x = _x;
        y = _y;
        width = _width;
        height = _height;
        colour = _colour;
    }
    //Collision
    public boolean isHovered(int mouseX, int mouseY){
        if(mouseX<x+width && mouseX>x && mouseY<y+height && mouseY>y){
            return true;
        }
        return false;
    }

    //Getters
    public int getX(){return(x);}
    public int getY(){return(y);}
    public int getWidth(){return(width);}
    public int getHeight(){return(height);}
    public Color getColour(){return(colour);}
}
