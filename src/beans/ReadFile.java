package beans;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;

public class ReadFile {
	
	public void openFile(String path, ArrayList<Musica> music) {
		try {
		       Stream<String> lines = Files.lines(Paths.get(path));
		       lines.forEach((String t) -> {
		          String[] parse = t.split(",");
		          if(parse.length<12) return;
		          music.add(new Musica(Double.parseDouble(parse[0]), 
		        		  Double.parseDouble(parse[1]), Double.parseDouble(parse[2]),
		        		  Double.parseDouble(parse[3]), Double.parseDouble(parse[4]),
		        		  Double.parseDouble(parse[5]), Double.parseDouble(parse[6]),
		        		  Double.parseDouble(parse[7]), Double.parseDouble(parse[8]),
		        		  Double.parseDouble(parse[9]), Double.parseDouble(parse[10]),
		        		  Double.parseDouble(parse[11])));
		          
		       });
		       lines.close();
		    } catch (IOException ex) {
		       System.out.println("Unable to open music file." + ex.toString());
		    }
	}
	
}
