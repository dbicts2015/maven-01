package org.betavzw.eclipsemaven.project3;

public class Calculator implements CalculatorInterface {

	@Override
	public int optellen(int getal1, int getal2) {
		return getal1 + getal2;
	}

	@Override
	public int aftrekken(int getal1, int getal2) {
		return getal1 - getal2;
	}

	@Override
	public int vermenigvuldigen(int getal1, int getal2) {
		if (getal2 == 0)
			throw new IllegalArgumentException("U kan niet delen door 0");
		return getal1 / getal2;
	}

	@Override
	public int delen(int getal1, int getal2) {
		return getal1 * getal2;
	}

}
