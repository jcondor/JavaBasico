/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase05.Aula.Soketes;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Date;

/**
 *
 * @author USUARIO
 */
public class ServidorHilo extends Thread {

    private Socket cliente;

    public ServidorHilo(Socket cliente) {
        this.cliente = cliente;
    }

    @Override
    public void run() {
        try {
            PrintWriter out = new PrintWriter(cliente.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(cliente.getInputStream()));

            out.println("Calculadora");
            
            Integer operacion = Integer.parseInt(in.readLine());
            Integer parametro1 = Integer.parseInt(in.readLine());
            Integer parametro2 = Integer.parseInt(in.readLine());
            
            Integer respuesta;
            
            switch (operacion) {
                case 1:respuesta = parametro1 + parametro2;
                    break;
                  
                case 2:respuesta = parametro1 - parametro2;    
                    break;
                    
                case 3:respuesta = parametro1 * parametro2;    
                    break;
                    
                case 4:respuesta = parametro1 / parametro2;    
                break;
                    
                default: respuesta = 0;
                    break;
                    
            
        }
            
            
            
            out.println(respuesta);
            
            in.close();
            out.close();
            cliente.close();

        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
            e.printStackTrace();
        }


    }

    private void swich() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
