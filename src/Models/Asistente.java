package Models;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

import Models.Servidor;
import Models.Asistente;

public class Asistente implements Runnable {
	
	 private Socket sc;
	    private DataInputStream in;
	    private Servidor server;
	    private boolean centinela;
	    
	   public Asistente(Socket sc, Servidor server) {
	        this.sc = sc;
	        this.server = server;
	        this.centinela = true;
	    }
	@Override
	public void run() {
		 try {
	            String mensaje;
	            in = new DataInputStream(sc.getInputStream());

	            while (centinela == true) {

	                
	                //leo el mensaje del cliente
	                mensaje = in.readUTF();

	                if (mensaje.equalsIgnoreCase("cerrar")) {

	                    centinela = false;

	                    server.desconectarCliente("UN CLIENTE SE DESCONECTO");
	                    in.close();
	                    sc.close();

	                } else {
	                    //envio el mensaje al servidor
	                    server.notificacion(mensaje);
	                }

	            }


	        } catch (IOException ex) {
	            Logger.getLogger(Asistente.class.getName()).log(Level.SEVERE, null, ex);
	        }

	    }
	}

