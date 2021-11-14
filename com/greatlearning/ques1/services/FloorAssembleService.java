package com.greatlearning.ques1.services;

import java.util.ArrayList;
import java.util.List;

public class FloorAssembleService {
	 
	    int presentFloor;
	    List<Integer> floorsOnSpecificDay;

    /**
     * To assemble the floors
     * @param floorSizes list of input of floor sizes.
     */
    public void assembleFloor(List<Integer> floorSize) {


        List<Integer> floorsLeft = new ArrayList<>();
        int maxFloorNum = floorSize.size();
        presentFloor = maxFloorNum;


        for (int i = 0; i < maxFloorNum; i++) {

            floorsOnSpecificDay = new ArrayList<>();

            int size = floorSize.get(i);
            //check if size is same as present floor
            if (size == presentFloor) {
                floorsOnSpecificDay.add(size);
                presentFloor--;
                RestOfTheFloors(presentFloor, floorsLeft);
            }
            //check if size is less than present floor , if true add in remainingfloors

            if (size < presentFloor) {
            	floorsLeft.add(size);
            }



            //if no floors assembled print empty line
            System.out.println();
            System.out.println("Day: " + (i + 1));
            for (int j : floorsOnSpecificDay) {
                System.out.print(j + " ");
            }
        }
    }

    /**
     * to check the list of remaining floors to be added to the stack on nth day
     * @param currentFloor pointer to the current floor
     * @param remainingList remaining floors
     */
    private void RestOfTheFloors(int currentFloor, List<Integer> remainingList) {
        for (int i : remainingList) {
            if (i == currentFloor) {
                floorsOnSpecificDay.add(i);
                presentFloor = currentFloor - 1;
                RestOfTheFloors(presentFloor, remainingList);
            }
        }
    }
}