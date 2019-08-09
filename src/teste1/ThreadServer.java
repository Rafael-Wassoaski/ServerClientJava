package teste1;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.HashMap;
import java.util.Scanner;

public class ThreadServer implements Runnable{

	private Socket socket;
	Usuarios alunos;

    public ThreadServer(Socket socket, Usuarios alunos) {
        this.socket = socket;
        this.alunos = alunos;
    }

    @Override
    public void run() {
        System.out.println("Conectado a : " + socket);
        try {
            var in = new Scanner(socket.getInputStream());
            var out = new PrintWriter(socket.getOutputStream(), true);
           
            
            
            
            String nome = null;
            
            
            
            nome = in.nextLine().toUpperCase();
            System.out.println(nome);
            
            	
            	out.println(alunos.getAluno(nome));
            
            
            
                        
        } catch (Exception e) {
            System.out.println("Deu ERRO:" + socket);
        } finally {
            try { socket.close(); } catch (IOException e) {}
            System.out.println("Fechando conexão com: " + socket);
        }
    }
}



