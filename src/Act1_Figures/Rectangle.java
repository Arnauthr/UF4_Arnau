package Act1_Figures;

public class Rectangle implements Figura {

	private float costat1;
	private float costat2;

	public Rectangle(float costat1, float costat2) {
		this.costat1=costat1;
		this.costat2=costat2;
	}

	public float area() {
		return costat1*costat2;
	}

	public float perimetre() {
		return costat1*2+costat2*2;
	}
	
	public String toString() {
		return "Rectangle: " + "Perímetre = " + perimetre() + " Àrea = " + area();
	}
}