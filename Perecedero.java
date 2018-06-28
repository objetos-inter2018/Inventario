/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventario2;
import java.util.Calendar;

/**
 *
 * @author Aixa
 */
public class Perecedero extends Producto{
    private int fechaCaducidad;
    private float temperatura;
    public Perecedero()
    {
        fechaCaducidad = 0;
        temperatura = 0;
    }

    /**
     * @param fechaCaducidad the fechaCaducidad to set
     */
    public void setFechaCaducidad(int fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    /**
     * @param temperatura the temperatura to set
     */
    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }
    
    public int comparaFechas()
    {
        int compara = this.fechaCaducidad;
        long aux;
        int aux2;
        String Fecha = obtenFecha();
        aux = Integer.parseInt(Fecha);
        aux = this.fechaCaducidad - aux;
        aux2 = (int)aux;
        return aux2;
        
    }
    
    public String obtenFecha()
    {
        String anio;
        String mes;
        String dia;
        String fecha;
        Calendar c = Calendar.getInstance();
        dia = Integer.toString(c.get(Calendar.DATE));
        mes = Integer.toString(c.get(Calendar.MONTH));
        anio = Integer.toString(c.get(Calendar.YEAR));
        fecha = anio + mes + dia;
        return fecha;
    }
    
    
}
