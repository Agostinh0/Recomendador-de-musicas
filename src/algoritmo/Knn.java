package algoritmo;

import java.util.ArrayList;

import beans.Musica;
import beans.Pessoa;

public class Knn {
		
	public double obterDistanciaEuclidiana(Musica musica1, Musica musica2) {

		double distancia = Math.pow((musica1.getDanceability() - musica2.getDanceability()), 2) +
					Math.pow((musica1.getEnergy() - musica2.getEnergy()), 2) + 
					Math.pow((musica1.getKey() - musica2.getKey()), 2) +
					Math.pow((musica1.getLoudness() - musica2.getLoudness()), 2) +
					Math.pow((musica1.getMode() - musica2.getMode()), 2) + 
					Math.pow((musica1.getSpeechiness() - musica2.getSpeechiness()), 2) + 
					Math.pow((musica1.getAcousticness() - musica2.getAcousticness()), 2) +
					Math.pow((musica1.getInstrumentalness() - musica2.getInstrumentalness()), 2) +
					Math.pow((musica1.getLiveness() - musica2.getLiveness()), 2) +
					Math.pow((musica1.getValence() - musica2.getValence()), 2) +
					Math.pow((musica1.getTempo() - musica2.getTempo()), 2) +
					Math.pow((musica1.getDuration_ms() - musica2.getDuration_ms()), 2);
		
		return Math.sqrt(distancia);

	}
	
	public void executarAlgoritmoComDistEuclidiana(ArrayList<Musica> base, Pessoa pessoa) {
		int count = 1;
		Knn knn = new Knn();
		
        for(int i = 0; i < base.size(); i++) {
        	for(int j = 0; j < pessoa.getMusicas().size(); j++) {
        		
    			double dist = knn.obterDistanciaEuclidiana(base.get(i), pessoa.getMusicas().get(j));
    			
    			if(dist > 0 && dist < 0.418) {
    				System.out.println(count + " " + dist + " " + base.get(i).getDanceability());
    				count++;
    			}
        		
        	}
        }
	}

	

	public double obterDistanciaManhattan(Musica musica1, Musica musica2) {

		double distancia = Math.abs(musica1.getDanceability() - musica2.getDanceability()) +
				Math.abs(musica1.getEnergy() - musica2.getEnergy()) + 
				Math.abs(musica1.getKey() - musica2.getKey()) +
				Math.abs(musica1.getLoudness() - musica2.getLoudness()) +
				Math.abs(musica1.getMode() - musica2.getMode()) + 
				Math.abs(musica1.getSpeechiness() - musica2.getSpeechiness()) + 
				Math.abs(musica1.getAcousticness() - musica2.getAcousticness()) +
				Math.abs(musica1.getInstrumentalness() - musica2.getInstrumentalness()) +
				Math.abs(musica1.getLiveness() - musica2.getLiveness()) +
				Math.abs(musica1.getValence() - musica2.getValence()) +
				Math.abs(musica1.getTempo() - musica2.getTempo()) +
				Math.abs(musica1.getDuration_ms() - musica2.getDuration_ms());

				return distancia;
	}
	
	public void executarAlgoritmoComDistManhattan(ArrayList<Musica> base, Pessoa pessoa) {
		int count = 1;
		Knn knn = new Knn();
		
		for(int i = 0; i < base.size(); i++) {
        	for(int j = 0; j < pessoa.getMusicas().size(); j++) {
        		
    			double dist = knn.obterDistanciaManhattan(base.get(i), pessoa.getMusicas().get(j));
    			
    			if(dist > 0 && dist < 1) {
    				System.out.println(count + " " + dist + " " +  base.get(i).getDanceability());
    				count++;
    			}
        		
        	}
        }
	}
	
	public double obterSimiliridadeCosseno(Musica array1, Musica array2) {
		double normaArray1 = Math.sqrt(Math.pow(array1.getDanceability(), 2) + Math.pow(array1.getEnergy(), 2) + 
				Math.pow(array1.getKey(), 2) + Math.pow(array1.getLoudness(), 2) + Math.pow(array1.getMode(), 2) + 
				Math.pow(array1.getSpeechiness(), 2) + Math.pow(array1.getAcousticness(), 2) + Math.pow(array1.getInstrumentalness(), 2) +
				Math.pow(array1.getLiveness(), 2) + Math.pow(array1.getValence(), 2) + Math.pow(array1.getTempo(), 2) + Math.pow(array1.getDuration_ms(), 2));
		
		double normaArray2 = Math.sqrt(Math.pow(array2.getDanceability(), 2) + Math.pow(array2.getEnergy(), 2) + 
				Math.pow(array2.getKey(), 2) + Math.pow(array2.getLoudness(), 2) + Math.pow(array2.getMode(), 2) + 
				Math.pow(array2.getSpeechiness(), 2) + Math.pow(array2.getAcousticness(), 2) + Math.pow(array2.getInstrumentalness(), 2) +
				Math.pow(array2.getLiveness(), 2) + Math.pow(array2.getValence(), 2) + Math.pow(array2.getTempo(), 2) + Math.pow(array2.getDuration_ms(), 2));
		
		double produto = ((array1.getDanceability() * array2.getDanceability()) +
				(array1.getEnergy() * array2.getEnergy()) + (array1.getKey() * array2.getKey()) +
				(array1.getLoudness() * array2.getLoudness()) + (array1.getMode() * array2.getMode()) +
				(array1.getSpeechiness() * array2.getSpeechiness()) + (array1.getAcousticness() * array2.getAcousticness()) +
				(array1.getInstrumentalness() * array2.getInstrumentalness()) + (array1.getLiveness() * array2.getLiveness()) +
				(array1.getValence() * array2.getValence()) + (array1.getTempo() * array2.getTempo()) + (array1.getDuration_ms() * array2.getDuration_ms())); 
		
		
		double similaridade = (produto)/(normaArray1 * normaArray2);
		
		return similaridade;
	}
	
	public void executarAlgoritmoComSimCosseno(ArrayList<Musica> base, Pessoa pessoa) {
		int count = 1;
		Knn knn = new Knn();
		
		for(int i = 0; i < base.size(); i++) {
        	for(int j = 0; j < pessoa.getMusicas().size(); j++) {
        		double sim = knn.obterSimiliridadeCosseno(base.get(i), pessoa.getMusicas().get(j));
        		
        		if(sim > 0.98 && sim < 0.99) {
        			System.out.println(count + " " + sim + " " + base.get(i).getDanceability());
        			count++;
        		}
        	}
        }
	}
	
	
}
