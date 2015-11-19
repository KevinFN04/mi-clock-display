
/**
 * Write a description of class ClockDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClockDisplay
{
    //Variable de las horas
    private NumberDisplay horas;
    //Variale de los minutos
    private NumberDisplay minutos;
    //Variable String de 5 digitos con ls hora
    private String horaSt;
    //variable para definir si es am o pm
    private String meridian;
    // horas sobre 24H
    private int veintH;

    /**
     * Constructor para poner la hora a cero al iniciar.
     */
    public ClockDisplay()
    {
        horas = new NumberDisplay(24);
        horas.setValue(0);
        minutos = new NumberDisplay(60);
        minutos.setValue(0);
        meridian = "am";
        horaSt = "12:00 am";
    }
    
    /**
     * Constructor para fijar una hora al iniciar.
     */
    public ClockDisplay(int horaAc, int minutosAc, String meridianAc)
    {
        if (horaAc > 12){
            veintH = horaAc;
            horaAc = horaAc - 12;
            meridianAc = "pm";
        }
        horas = new NumberDisplay(24);
        horas.setValue(horaAc);
        minutos = new NumberDisplay(60);
        minutos.setValue(minutosAc);
        meridian = meridianAc;
        horaSt = horas.getDisplayValue() + ":" + minutos.getDisplayValue() + " " + meridian;
    }
    
        /**
     * Metodo para fijar la hora
     */ 
    public void setTime(int horaAc2, int minutosAc2, String meridianAc2)
    {
        if (horaAc2 > 12){
            veintH = horaAc2;
            horaAc2 = horaAc2 - 12;
            meridianAc2 = "pm";
        }
        horas.setValue(horaAc2);
        minutos.setValue(minutosAc2);
        meridian = meridianAc2;
        horaSt = horas.getDisplayValue() + ":" + minutos.getDisplayValue() + " " + meridian;
    }
    
        /**
     * Metodo para devolver la hora.
     */ 
    public String getTime()
    {
        return horaSt;
    }
    
    /**
     * Metodo para pasar los minutos y las horas.
     */ 
    public void timeTick()
    {
        if (minutos.getValue() == 59 && veintH < 11){
            minutos.increment();
            horas.increment();
            meridian = "am";
            horaSt = horas.getDisplayValue() + ":" + minutos.getDisplayValue() + " " + meridian;
        }
        else if (minutos.getValue() == 59 && veintH == 11){
            minutos.increment();
            horas.increment();
            meridian = "m";
            horaSt = horas.getDisplayValue() + ":" + minutos.getDisplayValue() + " " + meridian;
        }
        else if (minutos.getValue() == 59 && veintH >= 12 && veintH < 23){
            minutos.increment();
            horas.increment();
            int horasAc3 = horas.getValue();
            meridian = "pm";
            horaSt = horasAc3 + ":" + minutos.getDisplayValue() + " " + meridian; 
        }
        else if (minutos.getValue() == 59 && veintH == 23){
            minutos.increment();
            horas.increment();
            meridian = "am";
            veintH = 0;
            horaSt = horas.getDisplayValue() + ":" + minutos.getDisplayValue() + " " + meridian;
        }
        else{
            minutos.increment();
            horaSt = horas.getDisplayValue() + ":" + minutos.getDisplayValue() + " " + meridian;
        }
    }
}
