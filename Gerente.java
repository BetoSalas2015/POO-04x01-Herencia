
/**
 * Write a description of class Gerente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gerente extends Empleado
{
    // instance variables - replace the example below with your own
    private double salario;
 
    /**
     * Constructor for objects of class Gerente
     */
    public Gerente(String nom, String ap, double sal)
    {
        // initialise instance variables
        super(nom, ap);
        setSalario(sal);
    }
    
    public void setSalario(double sal)
    {
        salario = (sal > 0) ? sal : 1;
    }
    
    public double getSalario()
    {
        return salario;
    }
    
    public double calculaSalario()
    {
        return salario;
    }

}





