package com.greatlearning.dsacoding.question1;

import java.util.Stack;

public class Building {
	
	static void buildingFloors(int[] floors) {
		
		int floor = floors.length;
		Stack<Integer> floorStack = new Stack<Integer>();
		
		System.out.println("The order of construction is as follows");
		
		for(int i = 0; i<floors.length; i++) {
			System.out.println();
			System.out.println("Day: "+(i+1));
			
			floorStack.push(floors[i]);
			
			if(floors[i]==floor) {
				System.out.print(floorStack.pop()+" ");
				floor--;
				
					for(int j = 0; j<=i; j++) {
						if(floors[i-j]==floor) {
							System.out.print(floorStack.pop()+" ");
							floor--;
						}
					}
				
			}
		}
	}

}
