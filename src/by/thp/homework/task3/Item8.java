package by.thp.homework.task3;

import java.util.Random;

public class Item8 {

	public static void main(String[] args) {
		// Даны целые чи�?ла а1 ,а2 ,..., аn . 
		// Выве�?ти на печать только те чи�?ла, дл�? которых аi > i.
		
		int N = 10;
		int[] arrayN = new int[N];

		arrayN = inputArrayRandom(N);
		System.out.print("Ма�?�?ив: [");
		getArray (N, arrayN);
		
		System.out.print("Ai > i: ");
		for (int i = 0; i < arrayN.length; i++) {
			if (arrayN[i] > i) { 
				System.out.print(arrayN[i] + " ");
			}
		}
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
			arrayN[i] = getRandomInt.nextInt(n);
		}

		return arrayN;
	}
	
}
