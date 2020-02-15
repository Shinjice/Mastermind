package com.tam;

import java.util.Random;
import java.util.Scanner;

public class Mastermind {

	static int[] zesgetallen = { 1, 2, 3, 4, 5, 6 };
	static int[] output = new int[4];
	static int[] input = new int[4];
	static int counter;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 4; i++) {
			Random r = new Random();
			int test = r.nextInt(6);
			output[i] = zesgetallen[test];
		}

		System.out.println("Welkom bij Mastermind!");

		while (true) {

			System.out.println("Voer code van 4 nummers in: ");
			String ingevoerd = sc.nextLine();

			for (int y = 0; y < 4; y++) {			
				
				
				char temp = ingevoerd.charAt(y);
				int temp2 = temp - '0'; // truuk van char naar int digit(ascii), '0' is hetzelfde als 48, voorbeeld char '7'(55) - '0'(48) = 7
				input[y] = temp2;
				
				
			}
			
			

			System.out.println("Jouw code is: " + input[0] + input[1] + input[2] + input[3]);
			System.out.println("Code wat gekraakt moet worden : " + output[0] + output[1] + output[2] + output[3]);

			while (true) {

				if (output[0] == input[0] && output[1] == input[1] && output[2] == input[2] && output[3] == input[3]) {
					System.out.println("code is gekraakt, je hebt gewonnen!");
					return;
				}

				else {

					for (int z = 0; z < 4; z++) {
						if (output[z] == input[z]) {
							counter++;
						}
					}

					System.out.println(counter + " cijfer(s) staan op de juiste plaats en " + (4 - counter)
							+ " cijfer(s) staan NIET op de juiste plaats, probeer opnieuw");
					counter = 0;
					break;
				}
			}
		}
	}
}


