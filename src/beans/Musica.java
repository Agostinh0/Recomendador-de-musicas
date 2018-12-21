package beans;

public class Musica {
	private double danceability;
	private double energy;
	private double key;
	private double loudness;
	private double mode;
	private double speechiness;
	private double acousticness;
	private double instrumentalness;
	private double liveness;
	private double valence;
	private double tempo;
	private double duration_ms;
	
	public Musica(double danceability, double energy, double key, double loudness, double mode, double speechiness,
			double acousticness, double instrumentalness, double liveness, double valence, double tempo, double duration_ms) {
		super();
		this.danceability = danceability;
		this.energy = energy;
		this.key = key;
		this.loudness = loudness;
		this.mode = mode;
		this.speechiness = speechiness;
		this.acousticness = acousticness;
		this.instrumentalness = instrumentalness;
		this.liveness = liveness;
		this.valence = valence;
		this.tempo = tempo;
		this.duration_ms = duration_ms;
	}

	public double getValence() {
		return valence;
	}

	public void setValence(double valence) {
		this.valence = valence;
	}

	public double getDanceability() {
		return danceability;
	}

	public void setDanceability(double danceability) {
		this.danceability = danceability;
	}

	public double getEnergy() {
		return energy;
	}

	public void setEnergy(double energy) {
		this.energy = energy;
	}

	public double getKey() {
		return key;
	}

	public void setKey(double key) {
		this.key = key;
	}

	public double getLoudness() {
		return loudness;
	}

	public void setLoudness(double loudness) {
		this.loudness = loudness;
	}

	public double getMode() {
		return mode;
	}

	public void setMode(double mode) {
		this.mode = mode;
	}

	public double getSpeechiness() {
		return speechiness;
	}

	public void setSpeechiness(double speechiness) {
		this.speechiness = speechiness;
	}

	public double getAcousticness() {
		return acousticness;
	}

	public void setAcousticness(double acousticness) {
		this.acousticness = acousticness;
	}

	public double getInstrumentalness() {
		return instrumentalness;
	}

	public void setInstrumentalness(double instrumentalness) {
		this.instrumentalness = instrumentalness;
	}

	public double getLiveness() {
		return liveness;
	}

	public void setLiveness(double liveness) {
		this.liveness = liveness;
	}

	public double getTempo() {
		return tempo;
	}

	public void setTempo(double tempo) {
		this.tempo = tempo;
	}

	public double getDuration_ms() {
		return duration_ms;
	}

	public void setDuration_ms(double duration_ms) {
		this.duration_ms = duration_ms;
	}
	
	
	
	
}