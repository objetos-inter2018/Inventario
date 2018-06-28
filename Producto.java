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
public class Producto {
    private String Nombre;
    private String Marca;
    private int Cantidad;
    private int minimo;
    private int maximo;
    public Producto()
    {
        Nombre = new String();
        Cantidad = 0;
        minimo = 0;
        maximo = 0;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Cantidad
     */
    public int getCantidad() {
        return Cantidad;
    }

    /**
     * @param Cantidad the Cantidad to set
     */
    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    /**
     * @param minimo the minimo to set
     */
    public void setMinimo(int minimo) {
        this.minimo = minimo;
    }

    /**
     * @param maximo the maximo to set
     */
    public void setMaximo(int maximo) {
        this.maximo = maximo;
    }
    
}
