
/**
 * Write a description of class Circulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Circulo extends Punto
{
    // instance variables - replace the example below with your own
    private int radio;

    /**
     * Constructor for objects of class Circulo
     */
    public Circulo(int x, int y, int radio)
    {
         //initialise instance variables
         super(x, y);
         setRadio(radio);
    }
    
    public void setRadio(int r)
    {
        radio = (r > 0) ? r : 1;
    }
    
    public int getRadio()
    {
        return radio;
    }
    
    public String toString()
    {
        return "Centro " + super.toString() + ", radio: " + radio;
    }


}







