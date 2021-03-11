
/**
 * Write a description of class TestCase here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestCase
{
    // instance variables - replace the example below with your own
    private final double PI = 3.14159;
    
    /**
     * Constructor for objects of class TestCase
     */
    public TestCase()
    {
        // initialise instance variables
        
    }
    
    public static void main(String args[])
    {
        Punto p, pointRef;
        Circulo c, circleRef;
        Object objeto;
        
        p = new Punto(5, 9);
        c = new Circulo(4,7, 10);
        
        //  Escenario no. 1
        pointRef = c;           //  Correcto!!!
        
        //  Escenario no. 2
        pointRef = c;
        circleRef = (Circulo) pointRef;         //  Cast o Casting  ....   Correcto!!!!
        
        objeto = p;
        objeto = c;
        
        //  Escenario no. 3
        //circleRef = (Circulo) p;            // Errorr!!!!!!!
        
        String saludo = new String("Hola");
        String saludo1 = new String("Hola");
        
        if( saludo.equals(pointRef) )
            System.out.println("true");
        else
            System.out.println("false");
            
        objeto = p;    
        if( objeto.equals(pointRef) )           ///  Funciona
            System.out.println("true");
        else
            System.out.println("false");
            
        System.out.println( p.toString() );  
        System.out.println( objeto.toString() );    
            
        System.out.println( p.getX() );  
        //System.out.println( objeto.getX() );      // Error porque el papa no tiene los métodos de los hijos
        
    }


}






