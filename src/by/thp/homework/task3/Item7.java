package by.thp.homework.task3;

import java.util.Random;

public class Item7 {

	public static void main(String[] args) {
		// Даны дей�?твительные чи�?ла а1 ,а2 ,..., аn . 
		// Помен�?ть ме�?тами наибольший и наименьший �?лементы.
		
		int N = 10;
		int[] arrayN = new int[N];
		int max, min;
		int[] maxI = new int[N/2];
		int[] minI = new int[N/2];
		int kmax = 0;
		int kmin = 0;
		int i;

		arrayN = inputArrayRandom(N);
		System.out.print("Первоначальный ма�?�?ив: [");
		getArray (N, arrayN);
		
		max = arrayN[0];
		min = arrayN[0];
		for (i = 0; i < arrayN.length; i++) {
			if (arrayN[i] > max) { 
				max = arrayN[i];
				maxI = setArray(N/2, 0);
				kmax = 0;
				maxI[kmax] = i + 1; // ма�?�?ив номеров дл�? в�?ех мак�?имальных чи�?ел. В�?е незаполненные будут равны 0
			} else if(arrayN[i] == max) { 
				kmax++;
				maxI[kmax] = i + 1;				
			} else if (arrayN[i] < min) { 
				min = arrayN[i];
				minI = setArray(N/2, 0);
				kmin = 0;
				minI[kmin] = i + 1; // ма�?�?ив номеров дл�? в�?ех минимальных чи�?ел. В�?е незаполненные будут равны 0
			} else if(arrayN[i] == min) { 
				kmin++;
				minI[kmin] = i + 1;
			}
		}
		
		i = 0;
		while (maxI[i] - 1 >= 0) {// е�?ли меньше нул�? - больше номеров нет
				arrayN[maxI[i] - 1] = min;
				i++;
		}
		
		i = 0;
		while (minI[i] - 1 >= 0) {// е�?ли меньше нул�? - больше номеров нет
				arrayN[minI[i] - 1] = max;
				i++;
		}
		
		System.out.print("�?овый ма�?�?ив:          [");
		getArray (N, arrayN);
		
	}
	
	public static int[] setArray (int n, int per) {
		
		int[] arrayForSet = new int[n];
		for (int i = 0; i < arrayForSet.length; i++) {
			arrayForSet[i] = per;
		}
		return arrayForSet;
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
