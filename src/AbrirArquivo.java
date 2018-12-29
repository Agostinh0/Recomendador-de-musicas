import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import beans.Musica;

public class AbrirArquivo {
	
	static BufferedReader openFile(File file, FileReader fr, BufferedReader br) {
    
		try {
            fr = new FileReader(file);
            br = new BufferedReader(fr);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return br;

    }





    static void populateInstances(BufferedReader br, List<Musica> base) throws IOException {
        
    	int count;
        int auxCount;
        double maximumDistance = 0;
        double minimumDistance = 0;
        double auxDouble = 0;
        String aux;

        while (br.ready()) {
            String line = br.readLine();

            if (line.startsWith("@") || line.isEmpty()) {
                continue;
            }

            Musica m = new Musica();
            
            count = 0;
            auxCount = 0;

            for (int i = 0; auxCount != 12; i++) {



                if (line.codePointAt(i) == ',' || auxCount == 11) {

                    if (auxCount == 11) {

                        aux = line.substring(count, line.length());

                        auxCount++;



                    } else {

                        aux = line.substring(count, i);

                        auxCount++;

                    }



                    if (auxCount != 12) {
                        auxDouble = Double.parseDouble(aux);
                    }

                    switch (auxCount) {

                        case 1:

                            m.setDanceability(auxDouble);

                            maximumDistance = auxDouble;

                            minimumDistance = auxDouble;

                            break;

                        case 2:

                            m.setEnergy(auxDouble);

                            if (auxDouble > maximumDistance) {

                                maximumDistance = auxDouble;

                            } else if (auxDouble < minimumDistance) {

                                minimumDistance = auxDouble;

                            }

                            break;

                        case 3:
                        	
                        	m.setKey(auxDouble);

                            if (auxDouble > maximumDistance) {

                                maximumDistance = auxDouble;

                            } else if (auxDouble < minimumDistance) {

                                minimumDistance = auxDouble;

                            }

                            break;

                        case 4:

                            m.setLoudness(auxDouble);

                            if (auxDouble > maximumDistance) {

                                maximumDistance = auxDouble;

                            } else if (auxDouble < minimumDistance) {

                                minimumDistance = auxDouble;

                            }

                            break;

                        case 5:

                            m.setMode(auxDouble);

                            if (auxDouble > maximumDistance) {

                                maximumDistance = auxDouble;

                            } else if (auxDouble < minimumDistance) {

                                minimumDistance = auxDouble;

                            }

                            break;

                        case 6:

                            m.setSpeechiness(auxDouble);

                            if (auxDouble > maximumDistance) {

                                maximumDistance = auxDouble;

                            } else if (auxDouble < minimumDistance) {

                                minimumDistance = auxDouble;

                            }

                            break;

                        case 7:

                            m.setInstrumentalness(auxDouble);

                            if (auxDouble > maximumDistance) {

                                maximumDistance = auxDouble;

                            } else if (auxDouble < minimumDistance) {

                                minimumDistance = auxDouble;

                            }

                            break;

                        case 8:

                            m.setLiveness(auxDouble);

                            if (auxDouble > maximumDistance) {

                                maximumDistance = auxDouble;

                            } else if (auxDouble < minimumDistance) {

                                minimumDistance = auxDouble;

                            }

                            break;

                        case 9:

                            m.setValence(auxDouble);

                            if (auxDouble > maximumDistance) {

                                maximumDistance = auxDouble;

                            } else if (auxDouble < minimumDistance) {

                                minimumDistance = auxDouble;

                            }

                            break;

                        case 10:

                            m.setTempo(auxDouble);

                            if (auxDouble > maximumDistance) {

                                maximumDistance = Double.parseDouble(aux);

                            } else if (auxDouble < minimumDistance) {

                                minimumDistance = auxDouble;

                            }

                            break;

                        case 11:

                            m.setDuration_ms(auxDouble);

                            if (auxDouble > maximumDistance) {

                                maximumDistance = auxDouble;

                            } else if (auxDouble < minimumDistance) {

                                minimumDistance = auxDouble;

                            }

                            break;

                    }

                    count = i + 1;

                }





            }

           
            base.add(m);



        }



    }



    static void close(BufferedReader br, FileReader fr) {

        if (br != null) {
            try {
                br.close();
                fr.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
