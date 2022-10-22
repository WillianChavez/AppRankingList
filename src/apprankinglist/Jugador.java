/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apprankinglist;

import java.util.UUID;

/**
 *
 * @author willi
 */
public class Jugador {
    private String nombre;
    private int puntaje;
    private UUID id;
    
    public Jugador(String nombre, int puntaje) {
        this.nombre = nombre;
        this.puntaje = puntaje;
        this.id = UUID.randomUUID();
    }

    @Override
    public String toString() {
        return "id: " +id +", nombre: " + nombre + ", puntaje: " + puntaje ;
    }

    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the puntaje
     */
    public int getPuntaje() {
        return puntaje;
    }

    /**
     * @param puntaje the puntaje to set
     */
    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    /**
     * @return the id
     */
    public UUID getId() {
        return id;
    }

   
    
    
}
