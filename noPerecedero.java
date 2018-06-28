/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventario2;

/**
 *
 * @author Aixa
 */
public class noPerecedero {
    private String Empaque;
    private boolean humedad;
    
    public noPerecedero()
    {
        Empaque = new String();
        humedad = false;
    }

    /**
     * @return the Empaque
     */
    public String getEmpaque() {
        return Empaque;
    }

    /**
     * @param Empaque the Empaque to set
     */
    public void setEmpaque(String Empaque) {
        this.Empaque = Empaque;
    }

    /**
     * @return the humedad
     */
    public boolean isHumedad() {
        return humedad;
    }

    /**
     * @param humedad the humedad to set
     */
    public void setHumedad(boolean humedad) {
        this.humedad = humedad;
    }
    
    
}
