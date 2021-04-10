package problems;

import static org.junit.Assert.*;


import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.Assert;
import org.junit.Before;


public class ImplTest {
	
	private FloorBinarySearchImpl f;
	private Integer[] arrayPositivosExclusivo;
	private Integer[] arrayPositivosEZero;
	private Integer[] arrayPositivosENegativos;
	private Integer[] arrayZero;
	private Integer[] arrayNegativosEZero;
	private Integer[] arrayNegativos;
	private Integer[] arrayPositivosNegativosZero;
	
	@BeforeEach
	void init() {
		f = new FloorBinarySearchImpl();
		//arrayPositivosExclusivo = {9, 20, 32, 24, 73, 97, 2, 5};
		//arrayPositivosEZero = {9, 20, 32, 24, 73, 0, 97, 2, 5};
		//arrayPositivosENegativos = {9, -20, 32, -24, 73, -97, 2, 5};
		//arrayZero = {0};
		//arrayNegativosEZero = {-9, -20, -32, -24, -73, 0, -97, -2, -5};
		//arrayNegativos = {-9, -20, -32, -24, -73, -97, -2, -5};
		//arrayPositivosNegativosZero = {-9, 20, -32, 24, -73, 0, 97, -2, 5};
		
	}
	
	@Test
	public void testFloorPositivosExclusivo() {
		Integer[] teste = {9, 20, 32, 24, 73, 97, 2, 5};
		Integer floor = f.floor(teste, 30);
		assert(floor == 24);
	}

}
