package by.thp.homework.task3;

import java.util.Random;
import java.util.Scanner;

public class Item2 {

	// В целочи�?ленной по�?ледовательно�?ти е�?ть нулевые �?лементы. Создать ма�?�?ив из
	// номеров �?тих �?лементов.
	public static void main(String[] args) {

		int n;
		int i;
		System.out.print("Введите N: ");

		n = inputInt();

		int[] arrayItem2 = new int[n];
		arrayItem2 = inputArray(n);
		
		int[] resArrayItem2 = new int[n];

		int k = 0;
		
		System.out.print("Ма�?�?ив: [");
		for (i = 0; i < arrayItem2.length; i++) {
			if (arrayItem2[i] == 0) {
				resArrayItem2[k] = i;
				k ++;
			}
			if (i == arrayItem2.length - 1) {
				System.out.println(arrayItem2[i] + "]");
			} else {
				System.out.print(arrayItem2[i] + "], [");
			}
		}
		
		if (k != 0) {
			int[] resItem2 = new int[k];
			//resItem2 = Arrays.copyOf(resArrayItem2, k);
			
			System.out.print("�?омера ма�?�?ива, �?ожержащие 0-е значени�?: [");
			
			for (i = 0; i < k; i++) {
				resItem2[i] = resArrayItem2[i];
			}
			
			for (i = 0; i < resItem2.length; i++) {
				resItem2[i] = resArrayItem2[i];
				if (i == resItem2.length - 1) {
					System.out.println(resItem2[i] + 1 + "]");
				} else {
					System.out.print(resItem2[i] + 1 + "], [");
				}
			}
			
		} else {
			System.out.println("0-х значений в ма�?�?иве нет.");
		} 
	}

	// функци�? ввода переменной типа integer
	public static int inputInt() {
		
		int N;

		Scanner inputPer = new Scanner(System.in);

		while (!inputPer.hasNextInt()) {
			System.out.println("Введите корректное значение: ");
			inputPer.next();
		}
		
		N = inputPer.nextInt();
	//	inputPer.close();
		
		return N;

	}

	// заполнение ма�?�?ива типа integer
	public static int[] inputArray(int n) {

		int[] arrN = new int[n];
		Random getRandomInt = new Random();

		for (int i = 0; i < n; i++) {
			arrN[i] = getRandomInt.nextInt(5);
		}
		
		return arrN;
	}

}
