package predavanje;

public class DostavaDemo {

	public static void main(String[] args) {

		Vozilo[] vozila = new Vozilo[3];
		vozila[0] = new Biciklo(321,20);
		vozila[1]= new Motor(543,60);
		vozila[2] = new Automobil(999,80);
		
		double udaljenost = 10.0;
		
		for(Vozilo v :vozila) {
			v.inf();
			if(v instanceof Ekonomican) {
				Ekonomican e = (Ekonomican) v;
				
				double potrosnja = e.potrosnjaPoKm() * udaljenost;
				System.out.println("Ukupna potrosnja je " + potrosnja);
			
			
			}
		}
		
		
		
		
	}

}
