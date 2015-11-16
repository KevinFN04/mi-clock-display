
/**
 * Write a description of class NumberDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NumberDisplay
{
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
        if (valorAc < limite && valorAc > 0){
            valor = valorAc;
        }
    }
    
       /**
     * Mostrar valor actual del display con 2 digitos.
     */
    public String getDisplayValue()
    {
       String DisplAc = "%02d";
       String display = String.format(DisplAc,valor);
       return display;
    }
    
    /**
     * Mostrar valor actual del display como entero.
     */
    public int getValue()
    {
        return valor;
    }
    
    /**
     * Sumar uno al display hasta reiniciar en el limite.
     */
    public void increment()
    {
        if (valor >= limite - 1){
            valor = 0;
        }
        else {
            valor = valor + 1;
        }
    }
}
   