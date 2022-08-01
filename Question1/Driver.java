package com.gldatastructure;


import java.util.Arrays;
import java.util.Scanner;

public class Driver {

	public static int totalFloors;
	public static int[] totalFloorSize;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SkyScrapper sl = new SkyScrapper();
		sl.getInputs();
	sl.calculateAndPrintOrderOfConstruction(sl.totalFloorSize);
	}
}
