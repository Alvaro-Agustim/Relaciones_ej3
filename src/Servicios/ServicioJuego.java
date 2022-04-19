/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Carta;
import Entidades.Mazo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alvaro
 */
public class ServicioJuego {
    public void probarJuego(){
        ServicioMazo sm = new ServicioMazo();
        Mazo m1 = sm.crearMazo();
        List<Carta> baraja = sm.barajar(m1.getBaraja());
        System.out.println(baraja.size());
        List<Carta> pozo = new ArrayList();
        pozo.add(sm.siguienteCarta(baraja));
        pozo.add(sm.siguienteCarta(baraja));        
        pozo.addAll(sm.darCartas(baraja, 5));
        m1.setPozo(pozo);
        m1.setBaraja(baraja);
        sm.cartasDisponibles(baraja);
        sm.cartasMonton(m1);
        
    }
}
