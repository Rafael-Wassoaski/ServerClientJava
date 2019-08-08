package teste1;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class ThreadServer implements Runnable{

	Socket cliente;
	
		

	public ThreadServer(Socket cliente) throws IOException {
		
		this.cliente = cliente;
		
		
		
	}
	
	
	
	
	@Override
	public void run(){
        System.out.println("Nova conexao com o cliente " + this.cliente.getInetAddress().getHostAddress());

        try {
            Scanner s = null;
            s = new Scanner(this.cliente.getInputStream());

        
            while(s.hasNextLine()){
                System.out.println(s.nextLine());
            }
            
            PrintStream saida;
            saida = new PrintStream(cliente.getOutputStream());
            saida.println("12");   
            saida.close();
            s.close();
            this.cliente.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
