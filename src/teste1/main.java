package teste1;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		ServerSocket server = new ServerSocket(12345);
		
		Socket cliente;
		
		while(true) {
			
			System.out.println("Aguardando conexao");
			cliente =  server.accept();
		ThreadServer servidorThread = new ThreadServer(cliente);
		Thread t = new Thread(servidorThread);
		
		t.start();
		}
	
		
		

	}

}
