
public class Dancer {
	int positionActual;

	int getPosicionEn(Integer n) {
                /*primera version basada en algorimo de Fibonacci*/
		Integer i = 0;
		int stepsPrevious = 0, stepsPenultimate = 0;
		int posAnterior = 0;
		int posActual = 0;
		int steps = 0;
		while (i <= n && i <= 2147483647) {
			if (i == 0) {
				posActual = 0;
			} else if (i == 1) {
				posActual = 1;
				steps = 1;
			} else if (i == 2) {
				posActual = -1;
				steps = -2;
			} else {
				steps = stepsPrevious - stepsPenultimate;
				posActual = posAnterior + steps;
			}

			i++;
			posAnterior = posActual;
			stepsPenultimate = stepsPrevious;
			stepsPrevious = steps;
		}
		return posActual;
	}

	int getPosicionEnNew(Integer n) {
		
		/*segunda versión, una vez descubierto que los resultados son cíclicos*/
		
		int pos = 0;
		// divisible entre 6
		if (n % 6 == 0) {
			pos = 0;
		}
		if (n % 6 == 1) {
			pos = 1;
		}
		if (n % 6 == 2) {
			pos = -1;
		}
		if (n % 6 == 3) {
			pos = -4;
		}
		if (n % 6 == 4) {
			pos = -5;
		}
		if (n % 6 == 5) {
			pos = -3;
		}
		System.out.println(pos);
		return pos;
	}

}
