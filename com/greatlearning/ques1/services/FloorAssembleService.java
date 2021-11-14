package com.greatlearning.ques1.services;

import java.util.ArrayList;
import java.util.List;

public class FloorAssembleService {

	int currentFloor;
	List<Integer> floorsOnSpecificDay;

	// Function to assemble the floors
	public void assembleFloor(List<Integer> floorSize) {

		List<Integer> floorsLeft = new ArrayList<>();
		int maxFloorNum = floorSize.size();
		currentFloor = maxFloorNum;

		for (int i = 0; i < maxFloorNum; i++) {

			floorsOnSpecificDay = new ArrayList<>();

			int size = floorSize.get(i);
			
			// check if size is same as present floor
			
			if (size == currentFloor) {
				floorsOnSpecificDay.add(size);
				currentFloor--;
				RestOfTheFloors(currentFloor, floorsLeft);
			}
			
			// check if size is less than present floor

			if (size < currentFloor) {
				floorsLeft.add(size);
			}

			// if no floors assembled, print empty line
			
			System.out.println();
			System.out.println("Day: " + (i + 1));
			for (int j : floorsOnSpecificDay) {
				System.out.print(j + " ");
			}
		}
	}

	/**
	 * @param currentFloor  points to the current floor
	 * 
	 */
	private void RestOfTheFloors(int currentFloor, List<Integer> remainingList) {
		for (int i : remainingList) {
			if (i == currentFloor) {
				floorsOnSpecificDay.add(i);
				currentFloor = currentFloor - 1;
				RestOfTheFloors(currentFloor, remainingList);
			}
		}
	}
}