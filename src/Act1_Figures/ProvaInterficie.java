package Act1_Figures;

import java.util.ArrayList;

public class ProvaInterficie {
	
	public static ArrayList <Figura> llista =  new ArrayList <Figura>();

	public static void main(String[] args) {	
        Figura quad = new Quadrat(3.5f);
        Figura circ = new Cercle (3.5f); 
        Figura rect = new Rectangle (2.25f, 2.55f);
        
        llista.add(quad);
        llista.add(circ);
        llista.add(rect);

        for(Figura z: llista) {
            System.out.println(z);
        }
	}
}