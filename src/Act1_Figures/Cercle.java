package Act1_Figures;

public class Cercle implements Figura {

	private float radi;

	public Cercle(float radi) {
		this.radi=radi;
	}

	
	public float area() {
		int radifinal;
        radifinal = (int) (radi*radi);
        return (float) (Math.PI*radifinal);    
	}
	
	public float perimetre() {
		return (float) (2*Math.PI*radi);
      }
	
	public String toString() {
		return "Cercle: " + "Perímetre = " + perimetre() + " Àrea = " + area();
	}
}
