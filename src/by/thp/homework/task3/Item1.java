package by.thp.homework.task3;

import java.util.Scanner;
//import java.util.Math;
import java.util.Random;

public class Item1 {
	// 1. В маccив A [N] зане�?ены натуральные чи�?ла. �?айти �?умму тех �?лементов,
	// которые кратны данному К.
	public static void main (String[] args) {
		
		int n;
		int k;
		int sum = 0;
		
		System.out.println("Введите N: ");
		n = inputInt ();
		
		int[] arrayA = new int[n];
		arrayA = inputArray(n);
		
		System.out.println("Введите K: ");
		k = inputInt ();
		
		System.out.print("Ма�?�?ив A: [");
		for (int i = 0; i < arrayA.length; i++) {
			if (arrayA[i] % k == 0) {sum += arrayA[i];}	 
			
			if (i < arrayA.length -1 ) {System.out.print(arrayA[i] + "], [");}
			else {System.out.println(arrayA[i] + "]");}
		}
		
		System.out.print("Сумма чи�?ел кратных " + k + " равна: " + sum);
			
	}

// функци�? ввода переменной типа integer
	public static int inputInt() {

		int per;

		Scanner inputPer = new Scanner(System.in);

		while (!inputPer.hasNextInt()) {
			System.out.println("Введите корректное значение: ");
			inputPer.next();
		}
		
		per = inputPer.nextInt();
	//	inputPer.close();
		
		return per;

	}

// заполнение ма�?�?ива типа integer	
	public static int[] inputArray(int n) {

		int[] arrN = new int[n];
		Random getRandomInt = new Random();

		for (int i = 0; i < n; i++) {
			arrN[i] = getRandomInt.nextInt(1000);
		}
		return arrN;
	}

}
