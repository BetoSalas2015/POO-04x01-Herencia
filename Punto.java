
/**
 * Write a description of class Punto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Punto
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;

    /**
     * Constructor for objects of class Punto
     */
    public Punto(int x, int y)
    {
        // initialise instance variables
        this.x = x;
        this.y = y;
    }
    
    public void setX(int x)
    {
        this.x = x;
    }
    
    public int getX()
    {
        return x;
    }
    
        public void setY(int y)
    {
        this.y = y;
    }
    
    public int getY()
    {
        return y;
    }
    
    public String toString()
    {
        return "Punto (" + x + "," + y + ")";
    }

}








