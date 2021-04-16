/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.carrerarelevoshilos;
/**
 *class Avanzar contiene el número de pasos que avanza un hilo
 * @author Alejandra Guzman
 * @author James Alzate
 */
public class Recorrer {

    /**
     * metodo que se calcula las posiciones
     * @return aleatorioPosicion
     */
    public static int posicion() {

        double pos = Math.random() * 100;   
        int posicionFija = (int) pos;
        if (posicionFija < 25) {
            posicionFija = 0;
        } else if (posicionFija >= 25 && posicionFija < 50) {
            posicionFija = 1;
        } else if (posicionFija >= 50 && posicionFija < 75) {
            posicionFija = 2;
        } else if (posicionFija >= 75) {
            posicionFija = 3;
        }
        return posicionFija;
    }
}
