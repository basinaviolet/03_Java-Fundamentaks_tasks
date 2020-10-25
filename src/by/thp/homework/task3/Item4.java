package by.thp.homework.task3;

import java.util.Random;

public class Item4 {

	public static void main(String[] args) {
		// Дана по�?ледовательно�?ть чи�?ел а1 ,а2 ,..., ап. 
		// Указать наименьшую длину чи�?ловой о�?и, �?одержащую в�?е �?ти чи�?ла.
		
		int N = 10;
		int[] arrayN = new int[N];
		int min;
		int max;
		int lenthNumAxis;

		arrayN = inputArrayRandom(N);
		System.out.print("Из ма�?�?ива: [");
		getArray (N, arrayN);
		
		min = arrayN[0];
		max = 0;
		for (int i = 0; i < arrayN.length; i++) {
			if (arrayN[i] > max) {
				max = arrayN[i];
			} else if (arrayN[i] < min) {
				min = arrayN[i];
			}
		}
		
		lenthNumAxis = max - min;
		
		System.out.print("�?аименьша�? длина чи�?ловой о�?и (min " + min + " max " + max + ") = " + lenthNumAxis);
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

		int[] arrayN = new int[n];
		Random getRandomInt = new Random();

		for (int i = 0; i < n; i++) {
			arrayN[i] = getRandomInt.nextInt(20);
		}

		return arrayN;
	}
	
}
