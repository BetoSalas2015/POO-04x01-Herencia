/**
 * Abstract class Empleado - write a description of the class here
 * 
 * @author: 
 * Date: 
 */
public abstract class Empleado
{
    // instance variables - replace the example below with your own
    private String nombre;
    private String apellido;
    
    public Empleado(String nom, String ap)
    {
        nombre = new String(nom);
        apellido = new String(ap);
    }
    
    public String getNombre()
    {
        return new String(nombre);
    }
    
    public String getApellido()
    {
        return new String(apellido);
    }
    
    public abstract double calculaSalario();
    
    
    
}
