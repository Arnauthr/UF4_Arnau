package Concessionari;

public class UsaConcesionario {

	public static void main(String[] args) {
		Concesionario con = new Concesionario();

		Coche coche1 = new Coche("RT45YU67");
		coche1.setMarca("Fiat");
		coche1.setModelo("500");
		con.nuevoCoche(coche1);

		Coche coche2 = new Coche("RZ26YP03");
		coche2.setMarca("Seat");
		coche2.setModelo("Panda");
		con.nuevoCoche(coche2);

		Coche coche3 = new Coche("FT93DQ77");
		coche3.setMarca("Seat");
		coche3.setModelo("Leon");
		con.nuevoCoche(coche3);

		System.out.println(con);

		Coche c = con.buscaCoche("RZ26YP03");
		System.out.println(c);
		}
}