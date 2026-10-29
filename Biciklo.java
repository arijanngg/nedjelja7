package predavanje;

public class Biciklo extends Vozilo implements Ekonomican {

	@Override
	public double izracunajVrijemeDostave(double udaljenostKM) {
		// TODO Auto-generated method stub
		return udaljenostKM/maxBrzina;
	}
	
	

	public Biciklo(int id, double maxBrzina) {
		super(id, 20);
	}



	@Override
	public double potrosnjaPoKm() {
		// TODO Auto-generated method stub
		return 0;
	}

}
