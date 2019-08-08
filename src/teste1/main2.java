package teste1;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class main2 {

	public static void main(String[] args) throws UnknownHostException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		Socket cliente = new Socket("localhost", 12345);
		
		
		  try {
	            PrintStream saida;
	            System.out.println("O cliente conectou ao servidor");

	            //Prepara para leitura do teclado
	            

	            //Cria  objeto para enviar a mensagem ao servidor
	            saida = new PrintStream(cliente.getOutputStream());

	            //Envia mensagem ao servidor
	            
	                saida.println("Rafael");   
	                
	                Scanner s = null;
	                s = new Scanner(cliente.getInputStream());

	            
	                while(s.hasNextLine()){
	                    System.out.println(s.nextLine());
	                }
	            
	              s.close();
	            saida.close();
	           
	            cliente.close();
	            System.out.println("Fim do cliente!");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	}

}
