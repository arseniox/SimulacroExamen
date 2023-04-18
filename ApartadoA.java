package javaExamenSimulacro;

public class ApartadoA {

	public static void main(String[] args) {
		Punto uno = new Punto();
		Punto dos = new Punto();
		Punto tres = new Punto();
		
		uno.setX(5);
		uno.setY(0);
		
		dos.setX(10);
		dos.setY(10);
		
		tres.setX(-3);
		tres.setY(7);
		
		
		System.out.println("Coordenadas del punto uno: (" + uno.getX() + "," + uno.getY() + ")");
		System.out.println("Coordenadas del punto dos: (" + dos.getX() + "," + dos.getY() + ")");
		System.out.println("Coordenadas del punto tres: (" + tres.getX() + "," + tres.getY() + ")");
		
		System.out.println("");
		
		uno.setX(5+1);
		uno.setY(0+9);
		
		dos.setX(10-6);
		dos.setY(10/5);
		
		tres.setX(-3-3);
		tres.setY(7+7);
		
		
		System.out.println("Coordenadas del punto uno: (" + uno.getX() + "," + uno.getY() + ")");
		System.out.println("Coordenadas del punto dos: (" + dos.getX() + "," + dos.getY() + ")");
		System.out.println("Coordenadas del punto tres: (" + tres.getX() + "," + tres.getY() + ")");

	}

}
