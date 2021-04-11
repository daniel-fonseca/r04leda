package problems;

public class Main {
	
	public static void main (String[] args) {
		FloorBinarySearchImpl f = new FloorBinarySearchImpl();
		
		//TESTES COM ARRAY SÓ DE POSITIVOS
				Integer[] arrayPositivos = {9, 20, 32, 24, 73, 97, 2, 5};
				Integer[] arrayPositivosENegativos = {9, -20, 32, -24, 73, -97, 2, 5};
				Integer[] arrayPositivosZero = {9, 20, 32, 24, 73, 0, 97, 2, 5};
				Integer[] arrayNegativos = {-9, -20, -32, -24, -73, -97, -2, -5};
				Integer[] arrayNegativosZero = {-9, -20, -32, -24, -73, 0, -97, -2, -5};
				Integer[] arrayZero = {0};
				Integer[] arrayPositivosNegativosZero = {9, -20, 32, -24, 73, 0, -97, 2, 5};
				Integer x = -53135453;
				Integer floorDeX = f.floor(arrayPositivosNegativosZero, x);
				System.out.println(floorDeX);
		
	}
	
	
	
}
