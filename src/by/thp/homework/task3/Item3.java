package by.thp.homework.task3;

import java.util.Random;

public class Item3 {

	public static void main(String[] args) {
		// Дана по�?ледовательно�?ть дей�?твительных чи�?ел а1 а2 ,..., аn . Вы�?�?нить, будет
		// ли она возра�?тающей.

		int N = 10;
		//int i;
		int[] array1 = new int[N];
	    int[] array2 = new int[N];

		array1 = inputArrayRandom(N);
		array2 = inputArrayIncr(N);
		
		arrayCheck (N, array1);
		arrayCheck (N, array2);

	}
	
	public static void arrayCheck (int length, int[] arrayForCheck) {
		
		boolean check = true;
		int i = 0;
		while (check == true && i < length - 1) {
			if (arrayForCheck[i] >= arrayForCheck[i + 1]) {
				check = false;
			}
			i++;
		}

		System.out.print("Ма�?�?ив [");
		for (i = 0; i < arrayForCheck.length; i++) {
			if (i == arrayForCheck.length - 1) {
				System.out.print(arrayForCheck[i] + "] - ");
			} else {
				System.out.print(arrayForCheck[i] + "], [");
			}
		}

		if (check == true) {
			System.out.println("возра�?тающий");
		} else {
			System.out.println("�?Евозра�?тающий");
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
	
	public static int[] inputArrayIncr(int n) {

		int[] arrayN = new int[n];

		for (int i = 0; i < n; i++) {
			arrayN[i] = i;
		}

		return arrayN;
	}
}
