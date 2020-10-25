package by.thp.homework.task3;

import java.util.Random;

public class Item10 {

	public static void main(String[] args) {
		// Дан ма�?�?ив дей�?твительных чи�?ел, размерно�?ть которого N. 
		// Под�?читать, �?колько в нем отрицательных, положительных и нулевых �?лементов.
		
		int N = 10;
		int[] arrayN = new int[N];
		int[] res = {0, 0, 0};

		arrayN = inputArrayRandom(N);
		System.out.print("Ма�?�?ив: [");
		getArray (N, arrayN);
		
		
		for (int i = 0; i < arrayN.length; i++) {
			if (arrayN[i] < 0) { 
				res[0] = res[0] + 1;
			} else if (arrayN[i] == 0) { 
				res[1] = res[1] + 1;
			} else { 
				res[2] = res[2] + 1;
			}
		}
		
		System.out.print("<0: " + res[0] + "; =0: " + res[1] + "; >0: " + res[2]);
	}

	public static void getArray (int n, int[] arrayForGet) {
		
		for (int i = 0; i < arrayForGet.length; i++) {
			if (i == arrayForGet.length - 1) {
				System.out.println(arrayForGet[i] + "]");
			} else {
				System.out.print(arrayForGet[i] + "], [");
			}
		}
	}

	public static int[] inputArrayRandom(int n) {
		
		int[] base = {-10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int[] arrayN = new int[n];
		Random getRandomInt = new Random();

		for (int i = 0; i < n; i++) {
			arrayN[i] = base[getRandomInt.nextInt(25)];
		}

		return arrayN;
	}
	
}
