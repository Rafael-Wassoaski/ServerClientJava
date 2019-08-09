package teste1;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.Executors;

public class main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		
		Usuarios alunos = new Usuarios();

		alunos.escrecerAlunos();
		
		
		 try (var listener = new ServerSocket(6666)) {
	            System.out.println("The capitalization server is running...");
	            var pool = Executors.newFixedThreadPool(20);
	            while (true) {
	                pool.execute(new ThreadServer(listener.accept(), alunos));
	            }
	        }


		
		
		
		
	}

}
