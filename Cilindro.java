
/**
 * Write a description of class Cilindro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cilindro extends Circulo
{
    // instance variables - replace the example below with your own
    private int altura; 

    /**
     * Constructor for objects of class Cilindro
     */
    public Cilindro(int x, int y, int r, int h)
    {
        // initialise instance variables
        super(x, y, r);
        setAltura(h);
    }
    
    public void setAltura(int h)
    {
        altura = (h >= 0) ? h : 0;
    }

    public int getAltura()
    {
        return altura;
    }
    
    public String toString()
    {
        return super.toString() + ", altura = " + altura;
    }

}









