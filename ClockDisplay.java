
/**
 * Write a description of class ClockDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClockDisplay
{
    private NumberDisplay horas;
    private NumberDisplay minutos;
    private String horaSt;
    

    /**
     * Constructor para poner la hora a cero al iniciar.
     */
    public ClockDisplay()
    {
        horas = new NumberDisplay(24);
        horas.setValue(0);
        minutos = new NumberDisplay(60);
        minutos.setValue(0);
        horaSt = "00:00";
    }
    
    /**
     * Constructor para fijar una hora al iniciar.
     */
    public ClockDisplay(int horaAc, int minutosAc)
    {
        horas = new NumberDisplay(24);
        horas.setValue(horaAc);
        minutos = new NumberDisplay(60);
        minutos.setValue(minutosAc);
        horaSt = horas.getDisplayValue() + ":" + minutos.getDisplayValue();
    }
    
}
