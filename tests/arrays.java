package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import com.entornos.oscar.array.*;

class arrays {
	
	int [] array1;
	
	@BeforeAll
	void inicializar() {
		 array1 = new int [] {1,2,3,4,5,6};
	
	
	}

	@Test
	void testMedia() {
		double resultado = MisArrays.calcularMedia(array1);
		double resultadoEsperado = 3.5;
		assertEquals(resultado, resultadoEsperado);
	}
	@Test
	void testMediana() {
		inicializar();
		double resultado = MisArrays.calcularMediana();
		int resultadoEsperado = 12;
		assertEquals(resultado, resultadoEsperado);
	}
	
	@Test
	void testMaximo() {
		inicializar();
		int resultado = MisArrays.maximo();
		int resultadoEsperado = 12;
		assertEquals(resultado, resultadoEsperado);
	}
	
	@Test
	void testMinimo() {
		inicializar();
		int resultado = MisArrays.minimo();
		int resultadoEsperado = 12;
		assertEquals(resultado, resultadoEsperado);
	

	
}
