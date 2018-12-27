package algoritmo;

import weka.classifiers.Classifier;
import weka.classifiers.Evaluation;
import weka.classifiers.lazy.IBk;
import weka.core.Instances;
import weka.core.converters.ArffLoader;

import java.io.IOException;

import beans.Musica;

public class Knn {
	
	public static Instances getDataSet(String fileName) throws IOException {
		int classId = 1;
		
		ArffLoader loader = new ArffLoader();
		
		loader.setSource(Knn.class.getResourceAsStream("/"+ fileName));
		
		Instances dataSet = loader.getDataSet();
		dataSet.setClassIndex(classId);
		return dataSet;
	}
	
	public static void process() throws Exception {
		Instances data = getDataSet("data.arff");
		data.setClassIndex(data.numAttributes() - 1);
		//k - the number of nearest neighbors to use for prediction
		Classifier ibk = new IBk(1);		
		ibk.buildClassifier(data);
	
		System.out.println(ibk);
       
        Evaluation eval = new Evaluation(data);
        eval.evaluateModel(ibk, data);
		/** Print the algorithm summary */
		System.out.println("** KNN Demo  **");
		System.out.println(eval.toSummaryString());
	    System.out.println(eval.toClassDetailsString());
		System.out.println(eval.toMatrixString());
	}

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
	
	
}
