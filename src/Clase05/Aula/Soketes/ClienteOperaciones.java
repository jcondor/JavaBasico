/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase05.Aula.Soketes;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author PFR
 */
public class ClienteOperaciones {
private String host;
	private int port;

	public ClienteOperaciones(String host, int port) {
		this.host = host;
		this.port = port;
	}

	public void doConectar() {
		try {
			Socket cliente = new Socket(host, port);
			
			// Crear los canales de lectura y escritura
			BufferedReader in = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
			PrintWriter out = new PrintWriter(cliente.getOutputStream(), true);
			
			// COMUNICACION 1
			String msg = in.readLine();			
                        System.out.println(msg);
			
			// COMUNICACION 2
                        out.println(5);
			out.println("1002");
			out.println("3");
                        
                        System.out.println(in.readLine());
                        
			// Cerrar canales
			in.close();
			out.close();
			cliente.close();
		} catch (Exception e) {
			System.out.println("Error Cliente : " + e.getMessage());
		}
	}
        
    public static void main(String[] args) {
        ClienteOperaciones c = new ClienteOperaciones("localhost", 9999);
        c.doConectar();
    }
    
}
