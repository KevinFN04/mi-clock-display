
/**
 * Write a description of class NumberDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NumberDisplay
{
    // instance variables - replace the example below with your own
    private int valor;
    private int limite;

    /**
     * Constructor for objects of class NumberDisplayHours, que pone el display a 0 y fija un limite
     */
    public NumberDisplay(int limit)
    {
        valor = 0;
        limite = limit;
    }

    /**
     * Metodo que fija un valor al display.
     */
    public void setValue(int valorAc)
    {
        if (valorAc <= limite){
            valor = valorAc;
        }
    }
}
   