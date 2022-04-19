/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alvaro
 */
public class Mazo {
    private List<Carta> baraja = new ArrayList();
    private List<Carta> pozo = new ArrayList();

    public Mazo() {
    }

    public List<Carta> getBaraja() {
        return baraja;
    }

    public void setBaraja(List<Carta> baraja) {
        this.baraja = baraja;
    }

    public List<Carta> getPozo() {
        return pozo;
    }

    public void setPozo(List<Carta> pozo) {
        this.pozo = pozo;
    }
    
}
