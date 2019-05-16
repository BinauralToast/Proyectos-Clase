package Objetos;
import java.util.*;
import java.text.*;
/**
 *
 * @author a18xacobopc
 */
public class ProbaFechas {
    public static void ProbasFechas() throws ParseException{
        String fecha = "14/02/1998";
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        Date fecha1 = sdf.parse(fecha);
        
        Date fecha2 = sdf.parse(fecha);
        
        long t1 = 15*24*60*60*1000;
        long t2 = fecha2.getTime();
        long time = t1+t2;
        
        fecha2.setTime(time);
        
        fecha2.setTime((15*24*60*60*1000)+(fecha2.getTime()));
        
        System.out.printf("t1 es %d, t2 es %d, time es %d, fecha1 es %s y fecha2 es %s%n", t1, t2, time, fecha1, fecha2);
    }    
}
