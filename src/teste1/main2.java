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
		 try (var socket = new Socket("localhost", 6666)) {
	            System.out.println("Enter lines of text then Ctrl+D or Ctrl+C to quit");
	            var scanner = new Scanner(System.in);
	            var in = new Scanner(socket.getInputStream());
	            var out = new PrintWriter(socket.getOutputStream(), true);
	            while (scanner.hasNextLine()) {
	                out.println(scanner.nextLine());
	                System.out.println(in.nextLine());
	       }
	            
	           in = new Scanner(socket.getInputStream());
	           
	           while (in.hasNextLine()) {
	                
	                System.out.println(in.nextLine());
	            }
	        }

	}
}
