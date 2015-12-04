/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game2dms;

/**
 *
 * @author alex
 */
public class Inimigo {
    
    private String Estado;

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    
    public void mover() {
        this.setEstado("Me Movendo");
    }
    
    public void nascer() {
        this.setEstado("Nasci");
    }
    
    public void morrer() {
        this.setEstado("Morri");
    }
    
    
    
}
