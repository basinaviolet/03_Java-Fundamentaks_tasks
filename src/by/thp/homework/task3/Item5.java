package by.thp.homework.task3;

import java.util.Random;

public class Item5 {

	public static void main(String[] args) {
		// Дана по�?ледовательно�?ть натуральных чи�?ел а1 , а2 ,..., ап. 
		// Создать ма�?�?ив из четных чи�?ел �?той по�?ледовательно�?ти.
		// Е�?ли таких чи�?ел нет, то выве�?ти �?ообщение об �?том факте.
		
		int N = 10;
		int[] arrayN = new int[N];
		int[] arrayNew = new int[N];

		arrayN = inputArrayRandom(N);
		System.out.print("Из ма�?�?ива: [");
		getArray (N, arrayN);
		
		int k = 0;
		int i;
		for (i = 0; i < arrayN.length; i++) {
			if (arrayN[i] % 2 == 0) {
				arrayNew[k] = arrayN[i];
				k++;
			}
		}
		
		int[] arrayEven = new int[k];
		for (i = 0; i < k; i++) {
			arrayEven[i] = arrayNew[i]; 
		}
		
		System.out.print("Ма�?�?ив четных чи�?ел: [");
		getArray (k, arrayEven);
		
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
