import beans.Musica;
import beans.Pessoa;
import beans.ReadFile;
import algoritmo.Knn;
import java.io.IOException;
import java.util.ArrayList;
public class Main {
	
	public static void main(String[] args) throws IOException {
		
		//Criando as listas
		ArrayList<Musica> musicas1 = new ArrayList<>();
		
		ArrayList<Musica> musicas2 = new ArrayList<>();
		
		ArrayList<Musica> musicas3 = new ArrayList<>();
		
		ArrayList<Musica> musicas4 = new ArrayList<>();
		
		ArrayList<Musica> musicas5 = new ArrayList<>();
		
		ArrayList<Musica> musicas6 = new ArrayList<>();
		
		ArrayList<Musica> musicas7 = new ArrayList<>();
		
		ArrayList<Musica> musicas8 = new ArrayList<>();
		
		ArrayList<Musica> musicas9 = new ArrayList<>();
		
		ArrayList<Musica> musicas10 = new ArrayList<>();
		
		//Lendo dos arquivos para popular as listas
		
		//Perfil de usuário 1
		
		ReadFile arquivoUm = new ReadFile();
		
		arquivoUm.openFile("src/resources/musicas1.txt", musicas1);
		
		Pessoa pessoa1 = new Pessoa("matheus.c", "12345", musicas1);
		
		//Perfil de usuário 2
		
		ReadFile arquivoDois = new ReadFile();
		
		arquivoDois.openFile("src/resources/musicas2.txt", musicas2);
		
		Pessoa pessoa2 = new Pessoa("jose.s", "12345", musicas2);
		
		//Perfil de usuário 3
		ReadFile arquivoTres = new ReadFile();
		
		arquivoTres.openFile("src/resources/musicas3.txt", musicas3);
		
		Pessoa pessoa3 = new Pessoa("renato.a", "12345", musicas3);
		
		//Perfil de usuário 4
		ReadFile arquivoQuatro = new ReadFile();
		
		arquivoQuatro.openFile("src/resources/musicas4.txt", musicas4);
		
		Pessoa pessoa4 = new Pessoa("daniela.v", "12345", musicas4);
		
		//Perfil de usuário 5
		ReadFile arquivoCinco = new ReadFile();
		
		arquivoCinco.openFile("src/resources/musicas5.txt", musicas5);
			
		Pessoa pessoa5 = new Pessoa("gustavo.c", "12345", musicas5);
		
		//Perfil de usuário 6
		ReadFile arquivoSeis = new ReadFile();
		
		arquivoSeis.openFile("src/resources/musicas6.txt", musicas6);
		
		Pessoa pessoa6 = new Pessoa("andre.m", "12345", musicas6);
		
		//Perfil de usuário 7
		ReadFile arquivoSete = new ReadFile();
		
		arquivoSete.openFile("src/resources/musicas7.txt", musicas7);
		
		Pessoa pessoa7 = new Pessoa("sandra.b", "12345", musicas7);
		
		//Perfil de usuário 8
		ReadFile arquivoOito = new ReadFile();
		
		arquivoOito.openFile("src/resources/musicas8.txt", musicas8);
		
		Pessoa pessoa8 = new Pessoa("simone.c", "12345", musicas8);
		
		//Perfil de usuário 9
		ReadFile arquivoNove = new ReadFile();
		
		arquivoNove.openFile("src/resources/musicas9.txt", musicas9);
		
		Pessoa pessoa9 = new Pessoa("carlos.t", "12345", musicas9);
		
		//Perfil de usuário 10
		ReadFile arquivoDez = new ReadFile();
		
		arquivoDez.openFile("src/resources/musicas10.txt", musicas10);
		
		Pessoa pessoa10 = new Pessoa("chico.s", "12345", musicas10);
		
		
		Knn knn = new Knn();
		
		
		
		//Abrir base preparada para execução do algoritmo para a pessoa 1
		ArrayList<Musica> base = new ArrayList<>();
        
		ReadFile arquivoBase = new ReadFile();
		
		arquivoBase.openFile("src/resources/base.txt", base);
		
        //Abrir base preparada para execução do algoritmo para a pessoa 2
		
		ArrayList<Musica> base2 = new ArrayList<>();
		
		ReadFile arquivoBase2 = new ReadFile();
		
		arquivoBase2.openFile("src/resources/base2.txt", base2);
		
		//Abrir base preparada para execução do algoritmo para a pessoa 3
		
		ArrayList<Musica> base3 = new ArrayList<>();
				
		ReadFile arquivoBase3 = new ReadFile();
				
		arquivoBase3.openFile("src/resources/base3.txt", base3);
		
		//Abrir base preparada para execução do algoritmo para a pessoa 4
		
		ArrayList<Musica> base4 = new ArrayList<>();
				
		ReadFile arquivoBase4 = new ReadFile();
				
		arquivoBase4.openFile("src/resources/base4.txt", base4);
		
		//Abrir base preparada para execução do algoritmo para a pessoa 5
		
		ArrayList<Musica> base5 = new ArrayList<>();
				
		ReadFile arquivoBase5 = new ReadFile();
				
		arquivoBase5.openFile("src/resources/base5.txt", base5);
		
		//Abrir base preparada para execução do algoritmo para a pessoa 6
		
		ArrayList<Musica> base6 = new ArrayList<>();
				
		ReadFile arquivoBase6 = new ReadFile();
				
		arquivoBase6.openFile("src/resources/base6.txt", base6);

		//Abrir base preparada para execução do algoritmo para a pessoa 7
		
		ArrayList<Musica> base7 = new ArrayList<>();
				
		ReadFile arquivoBase7 = new ReadFile();
				
		arquivoBase7.openFile("src/resources/base7.txt", base7);

		//Abrir base preparada para execução do algoritmo para a pessoa 6
		
		ArrayList<Musica> base8 = new ArrayList<>();
				
		ReadFile arquivoBase8 = new ReadFile();
				
		arquivoBase8.openFile("src/resources/base8.txt", base8);
		
		//Abrir base preparada para execução do algoritmo para a pessoa 6
		
		ArrayList<Musica> base9 = new ArrayList<>();
				
		ReadFile arquivoBase9 = new ReadFile();
				
		arquivoBase9.openFile("src/resources/base9.txt", base9);
		
		//Abrir base preparada para execução do algoritmo para a pessoa 6
		
		ArrayList<Musica> base10 = new ArrayList<>();
				
		ReadFile arquivoBase10 = new ReadFile();
				
		arquivoBase10.openFile("src/resources/base10.txt", base10);
	
       
		//Execução do algoritmo usando Distância Euclidiana 
		
		//Pessoa 1
		//knn.executarAlgoritmoComDistEuclidiana(base, pessoa1);
		
		//Pessoa 2
        //knn.executarAlgoritmoComDistEuclidiana(base2, pessoa2);
       
        //Pessoa 3
        //knn.executarAlgoritmoComDistEuclidiana(base3, pessoa3);
        
        //Pessoa 4
        //knn.executarAlgoritmoComDistEuclidiana(base4, pessoa4);
        
        //Pessoa 5
        //knn.executarAlgoritmoComDistEuclidiana(base5, pessoa5);
        
        //Pessoa 6
        knn.executarAlgoritmoComDistEuclidiana(base6, pessoa6);
        
        //Pessoa 7
        //knn.executarAlgoritmoComDistEuclidiana(base7, pessoa7);
        
        //Pessoa 8
        //knn.executarAlgoritmoComDistEuclidiana(base8, pessoa8);
        
        //Pessoa 9
        //knn.executarAlgoritmoComDistEuclidiana(base9, pessoa9);
        
        //Pessoa 10
        //knn.executarAlgoritmoComDistEuclidiana(base10, pessoa10);
        
        System.out.println("-----------------------");
        
        //Execução do algoritmo usando Distância de Manhattan
        
    	//Pessoa 1
  		//knn.executarAlgoritmoComDistManhattan(base, pessoa1);
  		
  		//Pessoa 2
        //knn.executarAlgoritmoComDistManhattan(base2, pessoa2);
             
        //Pessoa 3
        //knn.executarAlgoritmoComDistManhattan(base3, pessoa3);
      
        //Pessoa 4
        //knn.executarAlgoritmoComDistManhattan(base4, pessoa4);
      
        //Pessoa 5
        //knn.executarAlgoritmoComDistManhattan(base5, pessoa5);
        
        //Pessoa 6
        knn.executarAlgoritmoComDistManhattan(base6, pessoa6);
        
        //Pessoa 7
        //knn.executarAlgoritmoComDistManhattan(base7, pessoa7);
        
        //Pessoa 8
        //knn.executarAlgoritmoComDistManhattan(base8, pessoa8);
        
        //Pessoa 9
        //knn.executarAlgoritmoComDistManhattan(base9, pessoa9);
        
        //Pessoa 10
        //knn.executarAlgoritmoComDistManhattan(base10, pessoa10);
        

        System.out.println("------------------------------");
        
        //Execução do algoritmo utilizando Similaridade do Cosseno
        
        //Pessoa 1
  		//knn.executarAlgoritmoComSimCosseno(base, pessoa1);
  		
  		//Pessoa 2
        //knn.executarAlgoritmoComSimCosseno(base2, pessoa2);
             
        //Pessoa 3
        //knn.executarAlgoritmoComSimCosseno(base3, pessoa3);
      
        //Pessoa 4
        //knn.executarAlgoritmoComSimCosseno(base4, pessoa4);
      
        //Pessoa 5
        //knn.executarAlgoritmoComSimCosseno(base5, pessoa5);
        
        //Pessoa 6
        knn.executarAlgoritmoComSimCosseno(base6, pessoa6);
        
        //Pessoa 7
        //knn.executarAlgoritmoComSimCosseno(base7, pessoa7);
        
        //Pessoa 8
        //knn.executarAlgoritmoComSimCosseno(base8, pessoa8);
        
        //Pessoa 9
        //knn.executarAlgoritmoComSimCosseno(base9, pessoa9);
        
        //Pessoa 10
        //knn.executarAlgoritmoComSimCosseno(base10, pessoa10);
        
        
     }        
        
}
	