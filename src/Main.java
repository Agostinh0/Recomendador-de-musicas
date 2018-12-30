import beans.Musica;
import beans.Pessoa;
import algoritmo.Knn;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
public class Main {
	
	public static void main(String[] args) throws IOException {
		
		//Criando as listas
		ArrayList<Musica> musicas1 = new ArrayList<>();
		
		ArrayList<Musica> musicas2 = new ArrayList<>();
		
		ArrayList<Musica> musicas3 = new ArrayList<>();
		
		ArrayList<Musica> musicas4 = new ArrayList<>();
		
		ArrayList<Musica> musicas5 = new ArrayList<>();
		
		ArrayList<Musica> musicasRecomendadas = new ArrayList<>();
		
		//Lendo dos arquivos para popular as listas
		
		//Perfil de usuário 1
		try {
		       Stream<String> lines = Files.lines(Paths.get("C:\\Users\\Agostinho (Carrara)\\Desktop\\Pastas e arquivos\\Relatório + vetor de caracteristica\\musicas1.txt"));
		       lines.forEach((String t) -> {
		          String[] parse = t.split(",");
		          if(parse.length<12) return;
		          musicas1.add(new Musica(Double.parseDouble(parse[0]), 
		        		  Double.parseDouble(parse[1]), Double.parseDouble(parse[2]),
		        		  Double.parseDouble(parse[3]), Double.parseDouble(parse[4]),
		        		  Double.parseDouble(parse[5]), Double.parseDouble(parse[6]),
		        		  Double.parseDouble(parse[7]), Double.parseDouble(parse[8]),
		        		  Double.parseDouble(parse[9]), Double.parseDouble(parse[10]),
		        		  Double.parseDouble(parse[11])));
		       });
		    } catch (IOException ex) {
		       System.out.println("Unable to open music file." + ex.toString());
		    }
		
		
		Pessoa pessoa1 = new Pessoa("matheus.c", "12345", musicas1);
		
		//Perfil de usuário 2
		try {
		       Stream<String> lines = Files.lines(Paths.get("C:\\Users\\Agostinho (Carrara)\\Desktop\\Pastas e arquivos\\Relatório + vetor de caracteristica\\musicas2.txt"));
		       lines.forEach((String t) -> {
		          String[] parse = t.split(",");
		          if(parse.length<12) return;
		          musicas2.add(new Musica(Double.parseDouble(parse[0]), 
		        		  Double.parseDouble(parse[1]), Double.parseDouble(parse[2]),
		        		  Double.parseDouble(parse[3]), Double.parseDouble(parse[4]),
		        		  Double.parseDouble(parse[5]), Double.parseDouble(parse[6]),
		        		  Double.parseDouble(parse[7]), Double.parseDouble(parse[8]),
		        		  Double.parseDouble(parse[9]), Double.parseDouble(parse[10]),
		        		  Double.parseDouble(parse[11])));
		       });
		    } catch (IOException ex) {
		       System.out.println("Unable to open music file." + ex.toString());
		    }
		
		
		Pessoa pessoa2 = new Pessoa("jose.s", "12345", musicas2);
		
		//Perfil de usuário 3
		try {
		       Stream<String> lines = Files.lines(Paths.get("C:\\Users\\Agostinho (Carrara)\\Desktop\\Pastas e arquivos\\Relatório + vetor de caracteristica\\musicas3.txt"));
		       lines.forEach((String t) -> {
		          String[] parse = t.split(",");
		          if(parse.length<12) return;
		          musicas3.add(new Musica(Double.parseDouble(parse[0]), 
		        		  Double.parseDouble(parse[1]), Double.parseDouble(parse[2]),
		        		  Double.parseDouble(parse[3]), Double.parseDouble(parse[4]),
		        		  Double.parseDouble(parse[5]), Double.parseDouble(parse[6]),
		        		  Double.parseDouble(parse[7]), Double.parseDouble(parse[8]),
		        		  Double.parseDouble(parse[9]), Double.parseDouble(parse[10]),
		        		  Double.parseDouble(parse[11])));
		       });
		    } catch (IOException ex) {
		       System.out.println("Unable to open music file." + ex.toString());
		    }
		
		
		Pessoa pessoa3 = new Pessoa("renato.a", "12345", musicas3);
		
		//Perfil de usuário 4
		try {
		       Stream<String> lines = Files.lines(Paths.get("C:\\Users\\Agostinho (Carrara)\\Desktop\\Pastas e arquivos\\Relatório + vetor de caracteristica\\musicas4.txt"));
		       lines.forEach((String t) -> {
		          String[] parse = t.split(",");
		          if(parse.length<12) return;
		          musicas4.add(new Musica(Double.parseDouble(parse[0]), 
		        		  Double.parseDouble(parse[1]), Double.parseDouble(parse[2]),
		        		  Double.parseDouble(parse[3]), Double.parseDouble(parse[4]),
		        		  Double.parseDouble(parse[5]), Double.parseDouble(parse[6]),
		        		  Double.parseDouble(parse[7]), Double.parseDouble(parse[8]),
		        		  Double.parseDouble(parse[9]), Double.parseDouble(parse[10]),
		        		  Double.parseDouble(parse[11])));
		       });
		    } catch (IOException ex) {
		       System.out.println("Unable to open music file." + ex.toString());
		    }
		
		
		Pessoa pessoa4 = new Pessoa("daniela.v", "12345", musicas4);
		
		//Perfil de usuário 5
		try {
		       Stream<String> lines = Files.lines(Paths.get("C:\\Users\\Agostinho (Carrara)\\Desktop\\Pastas e arquivos\\Relatório + vetor de caracteristica\\musicas5.txt"));
		       lines.forEach((String t) -> {
		          String[] parse = t.split(",");
		          if(parse.length<12) return;
		          musicas5.add(new Musica(Double.parseDouble(parse[0]), 
		        		  Double.parseDouble(parse[1]), Double.parseDouble(parse[2]),
		        		  Double.parseDouble(parse[3]), Double.parseDouble(parse[4]),
		        		  Double.parseDouble(parse[5]), Double.parseDouble(parse[6]),
		        		  Double.parseDouble(parse[7]), Double.parseDouble(parse[8]),
		        		  Double.parseDouble(parse[9]), Double.parseDouble(parse[10]),
		        		  Double.parseDouble(parse[11])));
		       });
		    } catch (IOException ex) {
		       System.out.println("Unable to open music file." + ex.toString());
		    }
			
		Pessoa pessoa5 = new Pessoa("gustavo.c", "12345", musicas5);
		
		Knn knn = new Knn();
		
		//Abrir base de dados do arquivo arff
		List<Musica> base = new ArrayList<>();
        
        try {
		       Stream<String> lines = Files.lines(Paths.get("C:/Users/Agostinho (Carrara)/Desktop/Pastas e arquivos/Relatório + vetor de caracteristica/data.arff"));
		       lines.forEach((String t) -> {
		          String[] parse = t.split(",");
		          if(parse.length<12) return;
		          base.add(new Musica(Double.parseDouble(parse[0]), 
		        		  Double.parseDouble(parse[1]), Double.parseDouble(parse[2]),
		        		  Double.parseDouble(parse[3]), Double.parseDouble(parse[4]),
		        		  Double.parseDouble(parse[5]), Double.parseDouble(parse[6]),
		        		  Double.parseDouble(parse[7]), Double.parseDouble(parse[8]),
		        		  Double.parseDouble(parse[9]), Double.parseDouble(parse[10]),
		        		  Double.parseDouble(parse[11])));
		       });
		    } catch (IOException ex) {
		       System.out.println("Unable to open music file." + ex.toString());
		    }
               
        int count = 1;
        
        
        for(int i = 20; i < base.size(); i++) {
        	for(int j = 0; j < pessoa1.getMusicas().size(); j++) {
        		
    			double dist = knn.obterDistanciaEuclidiana(base.get(i), pessoa1.getMusicas().get(j));
    			
    			if(dist < 0.53) {
    				System.out.println( count + " " + dist);
    			}
    			count++;
        		
        		}
        	}
        }        
        
	  }
	