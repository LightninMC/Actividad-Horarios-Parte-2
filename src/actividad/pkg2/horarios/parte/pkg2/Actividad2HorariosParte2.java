/*
Los Horarios
 */
package actividad.pkg2.horarios.parte.pkg2;

import java.util.Scanner;

/**
 *
 * @author Michael Adael Salvador Cocom
 * https://github.com/LightninM
 */

public class Actividad2HorariosParte2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce una hora, y te dire tu horario");
        int hora = entrada.nextInt();
        
        if(hora >= 1 && hora <= 24){
            if(hora == 6){
                System.out.println("Despertar a las " + hora + "am");
            } else if(hora == 7){
                System.out.println("Entrar a clase a las " + hora + "am");
            } else if(hora >= 8 && hora < 10){
                System.out.println("Entrar a la siguiente clase desde las 8 am hasta las 10 am");
            } else if(hora >= 10 && hora < 12){
                System.out.println("Entrar a la siguiente clase desde las 10 am hasta las 12 am");
            } else if(hora == 12){
                System.out.println("Entrar a la siguiente clase a las " + hora + " pm");
            } else if(hora >= 13 && hora < 15){
                System.out.println("Terminar trabajos escolares y almolzar desde la 1 pm hasta a las 3 pm");
            } else if(hora == 15){
                System.out.println("Ayudar con labores del hogar desde las 3 pm");
            } else if(hora >= 16 && hora < 18 ){
                System.out.println("Ir a trabajar al negocio familiar a las 4 pm");
            } else if(hora >= 18 && hora < 20){
                System.out.println("Despachar y cobrar a los clientes desde las 6 de la tarde hasta las 8 de la noche");
            } else if(hora == 20){
                System.out.println("Comprar la cena a las 8 de la noche");
            } else if(hora >= 21 && hora < 23){
                System.out.println("Regresar a casa a hacer directo y jugar con amigos de 9 de la noche, hasta las 11 de la noche");
            } else if((hora >= 23 && hora <= 24) || (hora >= 1 && hora < 6)){
                System.out.println("Irme a dormir desde las 11pm, hasta las 6am");
            }
        } else {
            System.out.println("Porfavor introduce una hora correcto, de 1 a 24 horas");
        }
    }
}