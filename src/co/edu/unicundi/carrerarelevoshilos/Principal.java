
package co.edu.unicundi.carrerarelevoshilos;

/**
 * class main Se crean los hilos en cada uno de los grupos.
 * @author Alejandra Guzman
 * @author James Alzate
 *
 */
public class Principal {
    /**
     * Metodo que crea el objeto de las clases e inicia los hilos
     */
    public void inicio(){
        Equipo equipo1 = new Equipo("Equipo 1",0,100);
        Corredor c1e1= new Corredor(0,33,equipo1);
        Corredor c2e1= new Corredor(33,66,equipo1);
        Corredor c3e1 = new Corredor(66,99,equipo1);
        
        Equipo equipo2 = new Equipo("Equipo 2",0,100);
        Corredor c1e2 = new Corredor(0,33,equipo2);
        Corredor c2e2 = new Corredor(33,66,equipo2);
        Corredor c3e2 = new Corredor(66,99,equipo2);
        
        Equipo equipo3 = new Equipo("Equipo 3",0,100);
        Corredor c1e3 = new Corredor(0,33,equipo3);
        Corredor c2e3 = new Corredor(33,66,equipo3);
        Corredor c3e3 = new Corredor(66,99,equipo3); 
        
        //Se le da inicio al hilo a cada uno de los hilos.
        c1e1.start();
        c2e1.start();
        c3e1.start();
        c1e2.start();
        c2e2.start();
        c3e2.start();
        c1e3.start();
        c2e3.start();
        c3e3.start();
    }
    public static void main(String[] args) {
        Principal p = new Principal();
        p.inicio();
    }
   
}
