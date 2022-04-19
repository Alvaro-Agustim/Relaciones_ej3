/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Carta;
import Entidades.Mazo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author alvaro
 */
public class ServicioMazo {

    public Mazo crearMazo() {

        Mazo m1 = new Mazo();
        ServicioCarta sc = new ServicioCarta();
        List<Carta> baraja = new ArrayList();       
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j < 13; j++) {
                if (i==0) {
                     if (j != 8 && j != 9) {
                    baraja.add(sc.crearCarta(j,"Oro"));
                     }
                }
                if (i==1) {
                     if (j != 8 && j != 9) {
                    baraja.add(sc.crearCarta(j,"Copa"));
                     }
                }
                if (i==2) {
                     if (j != 8 && j != 9) {
                    baraja.add(sc.crearCarta(j,"Espada"));
                     }
                }
                if (i==3) {
                     if (j != 8 && j != 9) {
                    baraja.add(sc.crearCarta(j,"Basto"));
                     }
                }
               
            }
        }
        m1.setBaraja(baraja);
        return m1;
    }

    // barajar(): cambia de posición todas las cartas aleatoriamente.
    public List<Carta> barajar(List<Carta> mazo) {
        Collections.shuffle(mazo);
        return mazo;
    }
    //siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya
    //más o se haya llegado al final, se indica al usuario que no hay más cartas.
    public Carta siguienteCarta(List<Carta> mazo) {      
        return mazo.remove(0);
    }
    //cartasDisponibles(): indica el número de cartas que aún se puede repartir.
    public void cartasDisponibles(List<Carta> mazo){
        System.out.println("Quedan "+mazo.size()+" Cartas en la baraja");
    }
    /*darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número
    de cartas. En caso de que haya menos cartas que las pedidas, no devolveremos
    nada, pero debemos indicárselo al usuario.*/
    public List<Carta> darCartas(List<Carta> mazo,int cantidad){
        List<Carta> mano = new ArrayList();
        if (mazo.size()>=cantidad) {
            for (int i = 0; i < cantidad; i++){                
                mano.add(mazo.remove(0));
            }
            return mano;                
        } else {
            System.out.println("No alcanza la cantidad disponible de cartas");
            return null;
        }
        
    }
    /*cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
    indicárselo al usuario*/
    public void cartasMonton(Mazo m1){
        List<Carta> monton = m1.getPozo();
        if (monton.isEmpty()) {
            System.out.println("No ha salido ninguna carta");
        } else {
            System.out.println("Han salido "+monton.size());
        }
    }
    /**mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta
y luego se llama al método, este no mostrara esa primera carta.*/
    public void mostrarBaraja(Mazo m1){
        List<Carta> monton = m1.getBaraja();
        for (Carta c1 : monton) {
            System.out.println(c1);    
        }
    }
   
}
