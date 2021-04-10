package problems;

import static org.junit.Assert.*;


import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;


public class FloorBinarySearchImplTest {
	
	private FloorBinarySearchImpl f;
	private Integer[] arrayPositivosExclusivo;
	private Integer[] arrayPositivosEZero;
	private Integer[] arrayPositivosENegativos;
	private Integer[] arrayZero;
	private Integer[] arrayNegativosEZero;
	private Integer[] arrayNegativos;
	private Integer[] arrayPositivosNegativosZero;
	
	@Before
	public void setUp() {
		f = new FloorBinarySearchImpl();
		Integer[] arrayPositivosExclusivo = {9, 20, 32, 24, 73, 97, 2, 5};
		Integer[] arrayPositivosEZero = {9, 20, 32, 24, 73, 0, 97, 2, 5};
		Integer[] arrayPositivosENegativos = {9, -20, 32, -24, 73, -97, 2, 5};
		Integer[] arrayZero = {0};
		Integer[] arrayNegativosEZero = {-9, -20, -32, -24, -73, 0, -97, -2, -5};
		Integer[] arrayNegativos = {-9, -20, -32, -24, -73, -97, -2, -5};
		Integer[] arrayPositivosNegativosZero = {-9, 20, -32, 24, -73, 0, 97, -2, 5};
	}
	
	@Test
	public void testFloorPositivosExclusivo() {
		Integer floor = f.floor(arrayPositivosExclusivo, 30);
		assert(floor == 24);
	}

}
