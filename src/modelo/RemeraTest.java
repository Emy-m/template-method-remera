package modelo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RemeraTest {

	@Test
	public void calculoRemeraNacional() {
		RemeraNacional remera = new RemeraNacional(100);

		// 100 * 1.015 = 101.5 * 1.2 = 121.8 * 1.15 = 140.07

		assertEquals(140.07, remera.precioFinal(), 0.01);
	}

	@Test
	public void calculoRemeraImportada() {
		RemeraImportada remera = new RemeraImportada(100);

		// 100 * 1.03 = 103 * 1.05 = 108.15 * 1.25 = 135.1875

		assertEquals(135.18, remera.precioFinal(), 0.01);
	}
}
