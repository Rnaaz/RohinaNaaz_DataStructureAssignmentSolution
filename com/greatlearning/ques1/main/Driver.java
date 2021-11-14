package com.greatlearning.ques1.main;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import com.greatlearning.ques1.services.FloorAssembleService;

public class Driver {

	public static void main(String[] args) {
		FloorAssembleService floorAssembleService = new FloorAssembleService();
		List<Integer> floor_array = new LinkedList<>();

		// Input from the user for total no. of floors
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the total no of floors in the building");

		int total_no_of_floors = sc.nextInt();
		
		//Input from the user for the floor size for each floor
		
		
		for (int i = 0; i < total_no_of_floors; i++) {
			System.out.println("Enter the floor size given on day : " + (i + 1));
			int floor_size = sc.nextInt();
			floor_array.add(i,floor_size);
		}

		System.out.println("The order of construction is as follows");
		floorAssembleService.assembleFloor(floor_array);
		sc.close();

	}

}
