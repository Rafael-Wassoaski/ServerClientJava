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
		
		
		HashMap<String,Integer> alunos =  new HashMap<String, Integer>();
		Random rand = new Random();
		
		alunos.put("LUCIANO", rand.nextInt(100));
		alunos.put("MATEUS", rand.nextInt(100));
		alunos.put("FERNANDO", rand.nextInt(100));
		alunos.put("KARINE", rand.nextInt(100));
		alunos.put("LUCAS", rand.nextInt(100));
		alunos.put("JOHN", rand.nextInt(100));
		alunos.put("TIAGO", rand.nextInt(100));
		alunos.put("THOMAS", rand.nextInt(100));
		alunos.put("GIOVANI", rand.nextInt(100));
		alunos.put("GUSTAVO", rand.nextInt(100));
		alunos.put("RAFAEL", rand.nextInt(100));
		alunos.put("EVELIN", rand.nextInt(100));

		
		
		 try (var listener = new ServerSocket(6666)) {
	            System.out.println("The capitalization server is running...");
	            var pool = Executors.newFixedThreadPool(20);
	            while (true) {
	                pool.execute(new ThreadServer(listener.accept(), alunos));
	            }
	        }


		
		
		
		
	}

}
