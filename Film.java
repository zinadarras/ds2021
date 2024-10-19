package ds2021;
import java.util.Scanner;
public class Film {
	protected String titre;
	protected String realisateur;
	protected String pays;
	protected int duree;
	protected int nbPlaces;
	public static int id=0;
	public String getTitre() {
		return titre;
	}
	public int getId() {
		return this.id;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getRealisateur() {
		return realisateur;
	}
	public void setRealisateur(String realisateur) {
		this.realisateur = realisateur;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	public int getDuree() {
		return duree;
	}
	public void setDuree(int duree) {
		this.duree = duree;
	}
	public int getNbPlaces() {
		return nbPlaces;
	}
	public void setNbPlaces(int nbPlaces) {
		this.nbPlaces = nbPlaces;
	}
	public String toString() {
		return titre+" de "+ realisateur +" ("+pays+") -"+duree;
	}
	public Film(String titre, String realisateur, String pays, int duree) {
		this.titre = titre;
		this.realisateur = realisateur;
		this.pays = pays;
		this.duree = duree;
	}
	public float totalVenteBillets () {
		Scanner sc=new Scanner(System.in);
		System.out.println("donnner nombre de places des etudiants");
		int n=sc.nextInt();
		while(n>this.nbPlaces) {
			System.out.println("donnner nombre de places des etudiants");
			n=sc.nextInt();
		}
		return n*2+(this.nbPlaces-n)*3;
	}
}
