package ds2021;

public class Documentaires extends Film {
	private String sujet;
	private static final float tarif=2;
	public String getSujet() {
		return sujet;
	}
	public void setSujet(String sujet) {
		this.sujet = sujet;
	}
	public static float getTarif() {
		return tarif;
	}
	public Documentaires(String sujet,String titre, String realisateur, String pays, int duree) {
		super(titre, realisateur, pays, duree);
		this.sujet=sujet;
	}
	public String toString() {
		return this.sujet+" "+super.toString()+" son sujet est "+getSujet();
	}
	public float totalVenteBillets (){
		return this.getNbPlaces()*tarif;
	}
}
