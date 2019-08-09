package teste1;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class main2 {

	public static void main(String[] args) throws UnknownHostException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		
//		for(int finalIP = 0; finalIP < 256;  finalIP++) {
//			
//			
//			
//			
//		}
		 try (var socket = new Socket("localhost", 6666)) {
	            System.out.println("Enter lines of text then Ctrl+D or Ctrl+C to quit");
	            var scanner = new Scanner(System.in);
	            var in = new Scanner(socket.getInputStream());
	            var out = new PrintWriter(socket.getOutputStream(), true);
	            
	                out.println("RAFAEL");
	      
	            
	           in = new Scanner(socket.getInputStream());
	           
	           while (in.hasNextLine()) {
	                
	                System.out.println(in.nextLine());
	            }
	        }

	}
}
