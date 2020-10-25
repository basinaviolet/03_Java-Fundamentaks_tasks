package by.thp.homework.task3;

import java.util.Random;

public class Item6 {

	public static void main(String[] args) {
		// Дана по�?ледовательно�?ть дей�?твительных чи�?ел а1 ,а2 ,..., ап. 
		// Заменить в�?е ее члены, большие данного Z, �?тим чи�?лом.
		// Под�?читать количе�?тво замен.
		
		int N = 10;
		int Z = 10;
		int[] arrayN = new int[N];

		arrayN = inputArrayRandom(N);
		System.out.print("Первоначальный ма�?�?ив: [");
		getArray (N, arrayN);
		
		int k = 0;
		for (int i = 0; i < arrayN.length; i++) {
			if (arrayN[i] > Z) {
				arrayN[i] = Z;
				k++;
			}
		}
		
		System.out.print("�?овый ма�?�?ив: [");
		getArray (N, arrayN);
		
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
