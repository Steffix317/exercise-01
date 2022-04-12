package a;

import java.util.Random;

public class A {
	public static void main (String[] args) { //main und [] hinzu
		Random random = new Random(); //objekt erzeugen aus der random klasse
		String s = "Hello World!"; // int zu string geändert
		// char c entfernt

		//ein Array wird erstellt mit der länge 15
		int[] numberList = new int[15]; // new hinzugefügt
		for (int i = 0; i < numberList.length; i++) { // =0 hinzu
			numberList[i] = random.nextInt(100);
		}
		int sum = 0; //int davor

		for (int c = 0; c < numberList.length; c++) { //i zu c
			sum += numberList[c];
		}
		if (sum > 750) { // runde Klammern hinzu
			System.out.println(s); //system.. dazu
		} else { //else hinzu
			System.out.println("Falsch"); //system.. dazu

		}
	}
}