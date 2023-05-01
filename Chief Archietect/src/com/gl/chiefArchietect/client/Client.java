package com.gl.chiefArchietect.client;

import com.gl.chiefArchietect.model.SkyscraperConstruction;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the total number of floors in the building: ");
		int totalFloor = input.nextInt();

		int[] floorSizeGiven = new int[totalFloor];
		for (int i = 0; i < totalFloor; i++) {
			System.out.print("Enter the floor size given on day " + (i + 1) + ": ");
			floorSizeGiven[i] = input.nextInt();
		}
		SkyscraperConstruction.findDailyConstruction(floorSizeGiven,totalFloor);
		input.close();
	}
}
