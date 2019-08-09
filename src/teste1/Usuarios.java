package teste1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;



public class Usuarios {
	
	HashMap<String,Integer> alunos =  new HashMap<String, Integer>();
	Random rand;
	
	List<Integer> numeros = new ArrayList<Integer>();
	
	
	public Usuarios(){
		rand =  new Random();
		int numero;
		for(int  cont = 0; cont < 13;) {
			
			numero = rand.nextInt(100);
			if(numeros.contains(numero)) {
				continue;
			}
			
			numeros.add(numero);	
			cont++;
			
		}
		
		
		
		alunos.put("LUCIANO", numeros.get(0));
		alunos.put("MATEUS", numeros.get(1));
		alunos.put("FERNANDO", numeros.get(2));
		alunos.put("KARINE", numeros.get(3));
		alunos.put("LUCAS", numeros.get(4));
		alunos.put("JOHN", numeros.get(5));
		alunos.put("TIAGO", numeros.get(6));
		alunos.put("THOMAS", numeros.get(7));
		alunos.put("GIOVANI", numeros.get(8));
		alunos.put("GUSTAVO", numeros.get(9));
		alunos.put("RAFAEL", numeros.get(10));
		alunos.put("EVELIN", numeros.get(11));
		
	}
	
	
	public String getAluno(String nome) {
		
		
		 if(alunos.containsKey(nome)) {
         	
			 return alunos.get(nome).toString() + " : RAFAEL";	
         }else {
         	
         	return "-1 : RAFAEL";
         	
         }
		
			
	}
	
	public void escrecerAlunos() {
		
		for (HashMap.Entry<String,Integer> par : alunos.entrySet()) {
		    System.out.println(par.getKey());
		    System.out.println(par.getValue());
		}
	}

}
