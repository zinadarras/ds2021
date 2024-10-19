package ds2021;

public class Jcc {
	private Film[] competition;
	private int annee;
	private static final int NBFMAX=30;
	private int nbF=0;
	public Film[] getCompetition() {
		return competition;
	}
	public void setCompetition(Film[] competition) {
		this.competition = competition;
	}
	public int getAnnee() {
		return annee;
	}
	public void setAnnee(int annee) {
		this.annee = annee;
	}
	public int getNbF() {
		return nbF;
	}
	public void setNbF(int nbF) {
		this.nbF = nbF;
	}
	public static int getNbfmax() {
		return NBFMAX;
	}
	public Jcc(int taille,int annee) {
		this.annee=annee;
		if (taille<NBFMAX) {
		this.competition=new Film[taille];
		this.annee=annee;}
		else System.out.println("taille doit etre <30");
	}
	public void ajoutFilm (Film f) {
		if (nbF<competition.length) {
			this.competition[nbF]=f;
			nbF++;
			this.getId++;}
		else System.out.println("La competition est au complet");
	}
	public void listeFilmsJCC () {
		for (int i=0;i<nbF;i++) {
			System.out.println(competition[i]);
		}
	}
	public float totalVenteBilletsJCC () {
		float n=0;
		for (int i=0;i<nbF;i++)
			n=n+competition[i].totalVenteBillets();
		return n;
	}
	public static void main(String[] args) {
		Jcc j=new Jcc(2,2021);
		Documentaires f1=new Documentaires("La guerrre civile","Le dernier refuge","Ousman","Mali",86);
		f1.setNbPlaces(30);
		Film f2=new Film("Insurrection","Jilani Saadi","Tunisie",105);
		f2.setNbPlaces(45);
		j.ajoutFilm(f1);
		j.ajoutFilm(f2);
		j.listeFilmsJCC();
		System.out.println(j.totalVenteBilletsJCC());
	}
}
