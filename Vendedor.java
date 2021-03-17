
/**
 * Write a description of class Vendedor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public final class Vendedor extends Empleado
{
    // instance variables - replace the example below with your own
    private double salarioPorHora;
    private int horas;
    
    /**
     * Constructor for objects of class Vendedor
     */
    public Vendedor(String nom, String ap, double salario, int horas)
    {
        // initialise instance variables
        super(nom, ap);
        setSalario(salario);
        setHoras(horas);
    }
    
    public void setSalario(double sal)
    {
        salarioPorHora = ( sal > 0) ? sal : 1;
    }
    
    public void setHoras(int h)
    {
        horas = ( h >= 0) ? h : 0;
    }
    
    public double calculaSalario()
    {
        return salarioPorHora * horas;
    }
    
}





