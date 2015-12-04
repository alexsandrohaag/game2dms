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
public final class Heroi {
    
    private String Estado;

    public Heroi() {
        this.setEstado("Nasci");
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    
    public void andar() {
        this.setEstado("Andando");
    }
    
    public void pular() {
        this.setEstado("Pulando");
    }
    
    public void parar() {
        this.setEstado("Parei");
    }
    
    public void morrer() {
        this.setEstado("Morri");
    }
    
}
