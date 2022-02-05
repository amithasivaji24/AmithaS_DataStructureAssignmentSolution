package com.greatlearning.dsacoding.question1;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the total no of floors in the building");
		int noOfFloors = sc.nextInt();
		int[] floors = new int[noOfFloors];
		
		for(int i = 0; i<noOfFloors; i++) {
			System.out.println("enter the floor size given on day : "+(i+1));
			floors[i]=sc.nextInt();
		}
		
		Building building = new Building();
		building.buildingFloors(floors);
	}

}
