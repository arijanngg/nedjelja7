package predavanje;

 public abstract class Vozilo {

	

		protected int id;
		protected double maxBrzina;
		public void inf() {
			System.out.println("ID vozila je : " +id+" a njegova maksimalna brzina je " + maxBrzina);
			
			
		}
		
		
		
		public Vozilo(int id, double maxBrzina) {
			super();
			this.id = id;
			this.maxBrzina = maxBrzina;
		}
		

		public abstract double izracunajVrijemeDostave(double udaljenostKM);
}