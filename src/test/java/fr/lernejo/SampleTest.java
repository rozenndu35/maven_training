package fr.lernejo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import fr.lernejo.Sample.*;

class SampleTest {

	private final Sample simple = new Sample();
	
	@Test
	void op() {
		//test unitaire op = ADD
		//cas d'erreur
		//cas limite
		//cas normal
		Assertions.assertEquals(simple.op(Operation.ADD, 1, 2), 3);
		//test unitaire op = MULT
		//cas d'erreur
		//cas limite
		//cas normal
		Assertions.assertEquals(simple.op(Operation.MULT, 1, 2), 2);
	}
	@Test
	void fact() {
		//test unitaire op = MULT
		//cas d'erreur <0
		Assertions.assertThrows(IllegalArgumentException.class,() -> simple.fact(-1));
		//cas limite
		Assertions.assertEquals(simple.fact(0), 1);
		//cas normal
		Assertions.assertEquals(simple.fact(2), 2);
		
	}

}
