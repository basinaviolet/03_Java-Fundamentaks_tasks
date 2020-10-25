package by.thp.homework.task3;

import java.util.Random;

public class Item9 {

	public static void main(String[] args) {
		// Ð”Ð°Ð½Ñ‹ Ð´ÐµÐ¹Ñ?Ñ‚Ð²Ð¸Ñ‚ÐµÐ»ÑŒÐ½Ñ‹Ðµ Ñ‡Ð¸Ñ?Ð»Ð° ð?‘Ž1, ð?‘Ž2, â€¦ , ð?‘Ž2ð?‘›. Ð?Ð°Ð¹Ñ‚Ð¸ 
		
		int N = 5;
		int[] arrayN = new int[N*2];
		int[] res = {0, 0};
		int max = 0;

		arrayN = inputArrayRandom(N*2);
		System.out.print("ÐœÐ°Ñ?Ñ?Ð¸Ð²: [");
		getArray (N, arrayN);
		
		N = arrayN.length;
		for (int i = 0; i <= N / 2; i++) {
			if (arrayN[i] + arrayN[N - 1 - i] > max) { 
				max = arrayN[i] + arrayN[N - 1 - i];
				res[0] = i + 1;
				res[1] = N - i - 1;
			} 
		}
		
		System.out.print(res[0] + "/" + res[1] + " : " + max);
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
