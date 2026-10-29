package predavanje;

public class Automobil extends Vozilo implements Ekonomican {

	public Automobil(int id, double maxBrzina) {
		super(id, 80);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double izracunajVrijemeDostave(double udaljenostKM) {
		// TODO Auto-generated method stub
		return udaljenostKM/maxBrzina;
	}

	@Override
	public double potrosnjaPoKm() {
		// TODO Auto-generated method stub
		return 0;
	}

}
