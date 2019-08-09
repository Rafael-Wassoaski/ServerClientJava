package teste1;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.HashMap;
import java.util.Scanner;

public class ThreadServer implements Runnable{

	private Socket socket;
	private HashMap<String,Integer> alunos =  new HashMap<String, Integer>();

    public ThreadServer(Socket socket, HashMap<String, Integer> alunos) {
        this.socket = socket;
        this.alunos = alunos;
    }

    @Override
    public void run() {
        System.out.println("Connected: " + socket);
        try {
            var in = new Scanner(socket.getInputStream());
            var out = new PrintWriter(socket.getOutputStream(), true);
            
            
            
            
            String nome = null;
            
            
            
            nome = in.nextLine().toUpperCase();
            System.out.println(nome);
            if(alunos.containsKey(nome)) {
            	
            	out.println(alunos.get(nome).toString());
            }else {
            	
            	out.println("-1");
            	
            }
            
            
                        
        } catch (Exception e) {
            System.out.println("Error:" + socket);
        } finally {
            try { socket.close(); } catch (IOException e) {}
            System.out.println("Closed: " + socket);
        }
    }
}



