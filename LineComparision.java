package com.LineComparision;

import java.util.Scanner;

public class LineComparision {
	static Scanner scan = new Scanner(System.in);

	public void calculateLength() {
		System.out.println("Enter the values:");
		double x1 = scan.nextDouble();
		double x2 = scan.nextDouble();
		double y1 = scan.nextDouble();
		double y2 = scan.nextDouble();
		double len1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		System.out.println("length is:" + len1);
	}

	public void equalityOfTwoLines() {
		System.out.println("Enter the values:");
		double x1 = scan.nextDouble();
		double x2 = scan.nextDouble();
		double y1 = scan.nextDouble();
		double y2 = scan.nextDouble();
		double a1 = scan.nextDouble();
		double a2 = scan.nextDouble();
		double b1 = scan.nextDouble();
		double b2 = scan.nextDouble();

		double len1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		double len2 = Math.sqrt((a2 - a1) * (a2 - a1) + (b2 - b1) * (b2 - b1));
		System.out.println("length is:" + len1);
		System.out.println("length is:" + len2);
		if (len1 == len2) {
			System.out.println("len1s are equal");
		} else {
			System.out.println("both lines are not equal");
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program");
		LineComparision object = new LineComparision();
		object.calculateLength();
		object.equalityOfTwoLines();
	}

}
