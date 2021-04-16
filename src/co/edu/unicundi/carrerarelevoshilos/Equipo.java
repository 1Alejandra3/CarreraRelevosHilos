
package co.edu.unicundi.carrerarelevoshilos;
/**
 * Clase encargada de encapsular los atributos que se usan en los hilos
 * @author Alejandra Guzman
 * @author James Alzate
 */
public class Equipo {

    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";

    private int inicial;
    private int fin;
    private int posicion1;
    private int posicion2;
    private int posicion3;
    private String equipo;
    
    /**
     * Este es el constructor de la clase Equipo
     * @param equipo
     * @param posicionInicial
     * @param posicionFinal 
     */

    public Equipo(String equipo, int posicionInicial, int posicionFinal) {
        this.equipo = equipo;
        this.inicial = posicionInicial;
        this.fin = posicionFinal;
        this.posicion1 = 0;
        this.posicion2 = 33;
        this.posicion3 = 66;
    }

    /**
     * metodo que contiene los colores y las variables que se muestra
     * @return 
     */
    public synchronized String mostrar() {
      
        String pista = ANSI_BLACK + getEquipo() + " ";
        
        for (int i = getInicial(); i <= getFin(); i++) {
            if (i == posicion1) {
                pista += ANSI_RED + "□";
            } else if (i == posicion2) {
                pista += ANSI_BLUE + "⃝ ";
            } else if (i == posicion3) {
                pista += ANSI_GREEN + "∆";
            } else {
                pista += "_";
            } 
        }
        return pista;
    }

  

    /**
     * Obtiene el dato de Posicion1 que es igual a 0
     * @return 
     */
    public int getPosicion1() {
        return posicion1;
    }
    
    /**
     * Envia el dato de posicion1
     * @param posicion1 
     */
    public void setPosicion1(int posicion1) {
        this.posicion1 = posicion1;
    }

    /**
     * 
     * @return 
     */
    public int getPosicion2() {
        return posicion2;
    }

    public void setPosicion2(int posicion2) {
        this.posicion2 = posicion2;
    }

    public int getPosicion3() {
        return posicion3;
    }

    public void setPosicion3(int posicion3) {
        this.posicion3 = posicion3;
    }

   /**
     * @return the inicial
     */
    public int getInicial() {
        return inicial;
    }

    /**
     * @param inicial the inicial to set
     */
    public void setInicial(int inicial) {
        this.inicial = inicial;
    }

    /**
     * @return the fin
     */
    public int getFin() {
        return fin;
    }

    /**
     * @param fin the fin to set
     */
    public void setFin(int fin) {
        this.fin = fin;
    }

    /**
     * @return the equipo
     */
    public String getEquipo() {
        return equipo;
    }

    /**
     * @param equipo the equipo to set
     */
    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }
    
}
