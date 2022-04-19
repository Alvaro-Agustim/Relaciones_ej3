/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Carta;
/**
 *
 * @author alvaro
 */
public class ServicioCarta {

    public Carta crearCarta(int numero , String palo) {
        Carta c1 = new Carta();
        c1.setNumero(numero);
        c1.setPalo(palo);
        return c1;
    }
}
