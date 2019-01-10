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
		
		ArrayList<Musica> musicas11 = new ArrayList<>();
		
		ArrayList<Musica> musicas12 = new ArrayList<>();
		
		ArrayList<Musica> musicas13 = new ArrayList<>();
		
		ArrayList<Musica> musicas14 = new ArrayList<>();
		
		ArrayList<Musica> musicas15 = new ArrayList<>();
		
		ArrayList<Musica> musicas16 = new ArrayList<>();
		
		ArrayList<Musica> musicas17 = new ArrayList<>();
		
		ArrayList<Musica> musicas18 = new ArrayList<>();
		
		ArrayList<Musica> musicas19 = new ArrayList<>();
		
		ArrayList<Musica> musicas20 = new ArrayList<>();
		
		
		
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
		
		//Perfil de usuário 11
		
		ReadFile arquivoOnze = new ReadFile();
		
		arquivoOnze.openFile("src/resources/musicas11.txt", musicas11);
		
		Pessoa pessoa11 = new Pessoa("fausto.s", "12345", musicas11);
		
		//Perfil de usuário 12
		
		ReadFile arquivoDoze = new ReadFile();
		
		arquivoDoze.openFile("src/resources/musicas12.txt", musicas12);
		
		Pessoa pessoa12 = new Pessoa("xuxa.m", "12345", musicas2);
		
		//Perfil de usuário 13
		ReadFile arquivoTreze = new ReadFile();
		
		arquivoTreze.openFile("src/resources/musicas13.txt", musicas13);
		
		Pessoa pessoa13 = new Pessoa("ney.m", "12345", musicas3);
		
		//Perfil de usuário 14
		ReadFile arquivoCatorze = new ReadFile();
		
		arquivoCatorze.openFile("src/resources/musicas14.txt", musicas14);
		
		Pessoa pessoa14 = new Pessoa("luciano.h", "12345", musicas14);
		
		//Perfil de usuário 15
		ReadFile arquivoQuinze = new ReadFile();
		
		arquivoQuinze.openFile("src/resources/musicas15.txt", musicas15);
			
		Pessoa pessoa15 = new Pessoa("jo.s", "12345", musicas15);
		
		//Perfil de usuário 16
		ReadFile arquivoDezesseis = new ReadFile();
		
		arquivoDezesseis.openFile("src/resources/musicas16.txt", musicas16);
		
		Pessoa pessoa16 = new Pessoa("samuel.r", "12345", musicas16);
		
		//Perfil de usuário 17
		ReadFile arquivoDezessete = new ReadFile();
		
		arquivoDezessete.openFile("src/resources/musicas17.txt", musicas17);
		
		Pessoa pessoa17 = new Pessoa("gloria.p", "12345", musicas17);
		
		//Perfil de usuário 18
		ReadFile arquivoDezoito = new ReadFile();
		
		arquivoDezoito.openFile("src/resources/musicas18.txt", musicas18);
		
		Pessoa pessoa18 = new Pessoa("reginaldo.r", "12345", musicas18);
		
		//Perfil de usuário 9
		ReadFile arquivoDezenove = new ReadFile();
		
		arquivoDezenove.openFile("src/resources/musicas19.txt", musicas19);
		
		Pessoa pessoa19 = new Pessoa("fatima.b", "12345", musicas19);
		
		//Perfil de usuário 20
		ReadFile arquivoVinte = new ReadFile();
		
		arquivoVinte.openFile("src/resources/musicas20.txt", musicas20);
		
		Pessoa pessoa20 = new Pessoa("silvio.s", "12345", musicas20);
		
		
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

		//Abrir base preparada para execução do algoritmo para a pessoa 8
		
		ArrayList<Musica> base8 = new ArrayList<>();
				
		ReadFile arquivoBase8 = new ReadFile();
				
		arquivoBase8.openFile("src/resources/base8.txt", base8);
		
		//Abrir base preparada para execução do algoritmo para a pessoa 9
		
		ArrayList<Musica> base9 = new ArrayList<>();
				
		ReadFile arquivoBase9 = new ReadFile();
				
		arquivoBase9.openFile("src/resources/base9.txt", base9);
		
		//Abrir base preparada para execução do algoritmo para a pessoa 10
		
		ArrayList<Musica> base10 = new ArrayList<>();
				
		ReadFile arquivoBase10 = new ReadFile();
				
		arquivoBase10.openFile("src/resources/base10.txt", base10);
		
		//Abrir base preparada para execução do algoritmo para a pessoa 11
		ArrayList<Musica> base11 = new ArrayList<>();
        
		ReadFile arquivoBase11 = new ReadFile();
		
		arquivoBase11.openFile("src/resources/base11.txt", base11);
		
        //Abrir base preparada para execução do algoritmo para a pessoa 12
		
		ArrayList<Musica> base12 = new ArrayList<>();
		
		ReadFile arquivoBase12 = new ReadFile();
		
		arquivoBase12.openFile("src/resources/base12.txt", base12);
		
		//Abrir base preparada para execução do algoritmo para a pessoa 13
		
		ArrayList<Musica> base13 = new ArrayList<>();
				
		ReadFile arquivoBase13 = new ReadFile();
				
		arquivoBase13.openFile("src/resources/base13.txt", base13);
		
		//Abrir base preparada para execução do algoritmo para a pessoa 14
		
		ArrayList<Musica> base14 = new ArrayList<>();
				
		ReadFile arquivoBase14 = new ReadFile();
				
		arquivoBase14.openFile("src/resources/base14.txt", base14);
		
		//Abrir base preparada para execução do algoritmo para a pessoa 15
		
		ArrayList<Musica> base15 = new ArrayList<>();
				
		ReadFile arquivoBase15 = new ReadFile();
				
		arquivoBase15.openFile("src/resources/base15.txt", base15);
		
		//Abrir base preparada para execução do algoritmo para a pessoa 16
		
		ArrayList<Musica> base16 = new ArrayList<>();
				
		ReadFile arquivoBase16 = new ReadFile();
				
		arquivoBase16.openFile("src/resources/base16.txt", base16);

		//Abrir base preparada para execução do algoritmo para a pessoa 17
		
		ArrayList<Musica> base17 = new ArrayList<>();
				
		ReadFile arquivoBase17 = new ReadFile();
				
		arquivoBase17.openFile("src/resources/base17.txt", base17);

		//Abrir base preparada para execução do algoritmo para a pessoa 18
		
		ArrayList<Musica> base18 = new ArrayList<>();
				
		ReadFile arquivoBase18 = new ReadFile();
				
		arquivoBase18.openFile("src/resources/base18.txt", base18);
		
		//Abrir base preparada para execução do algoritmo para a pessoa 19
		
		ArrayList<Musica> base19 = new ArrayList<>();
				
		ReadFile arquivoBase19 = new ReadFile();
				
		arquivoBase19.openFile("src/resources/base19.txt", base19);
		
		//Abrir base preparada para execução do algoritmo para a pessoa 20
		
		ArrayList<Musica> base20 = new ArrayList<>();
				
		ReadFile arquivoBase20 = new ReadFile();
				
		arquivoBase20.openFile("src/resources/base20.txt", base20);

       
		
		
		
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
        //knn.executarAlgoritmoComDistEuclidiana(base6, pessoa6);
        
        //Pessoa 7
        //knn.executarAlgoritmoComDistEuclidiana(base7, pessoa7);
        
        //Pessoa 8
        //knn.executarAlgoritmoComDistEuclidiana(base8, pessoa8);
        
        //Pessoa 9
        //knn.executarAlgoritmoComDistEuclidiana(base9, pessoa9);
        
        //Pessoa 10
        //knn.executarAlgoritmoComDistEuclidiana(base10, pessoa10);
		
		//Pessoa 11
		//knn.executarAlgoritmoComDistEuclidiana(base11, pessoa11);
		
		//Pessoa 12
        knn.executarAlgoritmoComDistEuclidiana(base12, pessoa12);
       
        //Pessoa 13
        //knn.executarAlgoritmoComDistEuclidiana(base13, pessoa13);
        
        //Pessoa 14
        //knn.executarAlgoritmoComDistEuclidiana(base14, pessoa14);
        
        //Pessoa 15
        //knn.executarAlgoritmoComDistEuclidiana(base15, pessoa15);
        
        //Pessoa 16
        //knn.executarAlgoritmoComDistEuclidiana(base16, pessoa16);
        
        //Pessoa 17
        //knn.executarAlgoritmoComDistEuclidiana(base17, pessoa17);
        
        //Pessoa 18
        //knn.executarAlgoritmoComDistEuclidiana(base18, pessoa18);
        
        //Pessoa 19
        //knn.executarAlgoritmoComDistEuclidiana(base19, pessoa19);
        
        //Pessoa 20
        //knn.executarAlgoritmoComDistEuclidiana(base20, pessoa20);
        
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
        //knn.executarAlgoritmoComDistManhattan(base6, pessoa6);
        
        //Pessoa 7
        //knn.executarAlgoritmoComDistManhattan(base7, pessoa7);
        
        //Pessoa 8
        //knn.executarAlgoritmoComDistManhattan(base8, pessoa8);
        
        //Pessoa 9
        //knn.executarAlgoritmoComDistManhattan(base9, pessoa9);
        
        //Pessoa 10
        //knn.executarAlgoritmoComDistManhattan(base10, pessoa10);
  		
  		//Pessoa 11
  		//knn.executarAlgoritmoComDistManhattan(base11, pessoa11);
  		
  		//Pessoa 12
        knn.executarAlgoritmoComDistManhattan(base12, pessoa12);
             
        //Pessoa 13
        //knn.executarAlgoritmoComDistManhattan(base13, pessoa13);
      
        //Pessoa 14
        //knn.executarAlgoritmoComDistManhattan(base14, pessoa14);
      
        //Pessoa 15
        //knn.executarAlgoritmoComDistManhattan(base15, pessoa15);
        
        //Pessoa 16
        //knn.executarAlgoritmoComDistManhattan(base16, pessoa16);
        
        //Pessoa 17
        //knn.executarAlgoritmoComDistManhattan(base17, pessoa17);
        
        //Pessoa 18
        //knn.executarAlgoritmoComDistManhattan(base18, pessoa18);
        
        //Pessoa 19
        //knn.executarAlgoritmoComDistManhattan(base19, pessoa19);
        
        //Pessoa 20
        //knn.executarAlgoritmoComDistManhattan(base20, pessoa20);
        

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
        //knn.executarAlgoritmoComSimCosseno(base6, pessoa6);
        
        //Pessoa 7
        //knn.executarAlgoritmoComSimCosseno(base7, pessoa7);
        
        //Pessoa 8
        //knn.executarAlgoritmoComSimCosseno(base8, pessoa8);
        
        //Pessoa 9
        //knn.executarAlgoritmoComSimCosseno(base9, pessoa9);
        
        //Pessoa 10
        //knn.executarAlgoritmoComSimCosseno(base10, pessoa10);
  		
  		//Pessoa 11
  		//knn.executarAlgoritmoComSimCosseno(base11, pessoa11);
  		
  		//Pessoa 12
        knn.executarAlgoritmoComSimCosseno(base12, pessoa12);
             
        //Pessoa 13
        //knn.executarAlgoritmoComSimCosseno(base13, pessoa13);
      
        //Pessoa 14
        //knn.executarAlgoritmoComSimCosseno(base14, pessoa14);
      
        //Pessoa 15
        //knn.executarAlgoritmoComSimCosseno(base15, pessoa15);
        
        //Pessoa 16
        //knn.executarAlgoritmoComSimCosseno(base16, pessoa16);
        
        //Pessoa 17
        //knn.executarAlgoritmoComSimCosseno(base17, pessoa17);
        
        //Pessoa 18
        //knn.executarAlgoritmoComSimCosseno(base18, pessoa18);
        
        //Pessoa 19
        //knn.executarAlgoritmoComSimCosseno(base19, pessoa19);
        
        //Pessoa 20
        //knn.executarAlgoritmoComSimCosseno(base20, pessoa20);
        
        
     }        
        
}
	