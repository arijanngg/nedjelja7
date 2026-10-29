package predavanje;

public class Motor extends Vozilo implements Ekonomican {
	
	
	
	

	public Motor(int id, double maxBrzina) {
		super(id, 50);
	}

	@Override
	public double izracunajVrijemeDostave(double udaljenostKM) {
		// TODO Auto-generated method stub
		return udaljenostKM/maxBrzina;
	}

	@Override
	public double potrosnjaPoKm() {
		// TODO Auto-generated method stub
		return 0.03;
	}

}
