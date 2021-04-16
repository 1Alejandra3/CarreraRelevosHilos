
package co.edu.unicundi.carrerarelevoshilos;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase  con la que se trabajan los hilos 
 * @author Alejandra Guzman
 * @author James Alzate
 */
public class Corredor extends Thread {
       
    /**
     * Esta variable se encarga de almacenar la posicion inicial de los hilos
     */
    private int inicio;
    /**
     * Esta variable se encarga de almacenar la posicion final de los hilos
     */
    private int fin;
    /**
     * Esta variable se encarga de traer el equipo al cual pertenece cada hilo
     */
    private Equipo equipo;
    /**
     * Esta variable se encarga de obtener la información del equipo1 para poder graficarla
     */
    private String equipo1;
    /**
     * Esta variable se encarga de obtener la información del equipo2 para poder graficarla
     */
    private String equipo2;
    /**
     * Esta variable se encarga de obtener la información del equipo3 para poder graficarla
     */
    private String equipo3;
    
    //Constructor que resive los atributos del corredor
    public Corredor(int inicio, int fin, Equipo equipo) {
        this.inicio = inicio;
        this.fin = fin;
        this.equipo = equipo;
    }


    @Override
    public void run() {
        int pasos1 = 33;
        if(inicio==0){
            while(true){
                int posicionActual=trayectoria(1);
                if(pasos1 <= posicionActual){
                    equipo.setPosicion1(pasos1);
                    synchronized(equipo){
                        equipo.notifyAll();
                        inicio=pasos1;
                    }
                    break;
                }
            }
        }else{
             parar();
        }
        if(inicio==pasos1){
            while(true){
               int posicionActual=trayectoria(2);
               if(posicionActual>=pasos1*2){
                   equipo.setPosicion2(pasos1*2);
                   synchronized(equipo){
                       equipo.notifyAll();
                       inicio=pasos1*2;
                   }
                   break;
               }
            }
        }else{
             parar();
        }
        if(inicio==pasos1*2){
            while(true){
                int posicionActual=trayectoria(3);
                if(posicionActual >100){
                    equipo.setPosicion3(100);
                    System.out.println("Equipo Ganador"+equipo.getEquipo());
                    System.exit(0);
                    break;
                }
            }
        }else{
            parar();
        }
    }
    
    /**
     * Metodo que acciona la espera de los hilos
     */
    public void parar(){
          synchronized(equipo){
                try {
                    equipo.wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Corredor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    }
    
    /**
     * metodo que imprime la trayectoria de los hilos
     * @param avance
     * @return 
     */
    public int trayectoria(int avance){
        try{
           Thread.sleep(500);
        }catch(InterruptedException e){
            Logger.getLogger(Corredor.class.getName()).log(Level.SEVERE,null,e);
        }
        int correr=Recorrer.posicion();

        if(avance==1){
            equipo.setPosicion1(equipo.getPosicion1()+correr);
            equipo1=equipo.mostrar();
            equipo2=equipo.mostrar();
            equipo3=equipo.mostrar();
            if(equipo1!=null){
                System.out.println(equipo1);
            }
            if(equipo2!=null){
                System.out.println(equipo2);
            }
            if(equipo3!=null){
                System.out.println(equipo3);
            }
            return equipo.getPosicion1();
        }
        if(avance==2){
            equipo.setPosicion2(equipo.getPosicion2()+correr);
            equipo1=equipo.mostrar();
            equipo2=equipo.mostrar();
            equipo3=equipo.mostrar();
            if(equipo1!=null){
                System.out.println(equipo1);
            }
            if(equipo2!=null){
                System.out.println(equipo2);
            }
            if(equipo3!=null){
                System.out.println(equipo3);
            }
            return equipo.getPosicion2();
        }
        if(avance==3){
            equipo.setPosicion3(equipo.getPosicion3()+correr);
            equipo1=equipo.mostrar();
            equipo2=equipo.mostrar();
            equipo3=equipo.mostrar();
            if(equipo1!=null){
                System.out.println(equipo1);
            }
            if(equipo2!=null){
                System.out.println(equipo2);
            }
            if(equipo3!=null){
                System.out.println(equipo3);
            }
            return equipo.getPosicion3();
        }
        return 0;
    }
}
