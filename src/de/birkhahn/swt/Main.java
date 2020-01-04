package de.birkhahn.swt;

import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	static float firstNumber;
	static float secondNumber;
	static String operation;
	
	public static float add(float x, float y) {
		float result = x + y;
        return result;
    }
	
	public static float sub(float x, float y) {
		float result = x - y;
        return result;
    }
	
	public static float mult(float x, float y) {
		float result = x*y;
        return result;
    }
	
	public static float div(float x, float y) {
		float result = x*y;
        return result;
    }
	
	private static void askForSummands(int number) {
		if (number == 1) {
			System.out.println("Gib deine erste Zahl ein:");
		} else {
			System.out.println("Gib deine zweite Zahl ein:");
		}
	}
	
	private static void askForOperation() {
		System.out.println("Wähle die Operation. Gib +, -, * oder / ein:");
	}
	
	private static String readUserInput() {
		Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
	}
	
	private static void setFirstNumber(String string) {
		float x = Float.parseFloat(string);
		firstNumber = x;
	}
	
	public static float getFirstNumber() {
		return firstNumber;
	}
	
	private static void setSecondNumber(String string) {
		float x = Float.parseFloat(string);
		secondNumber = x;
	}
	
	public static float getSecondNumber() {
		return secondNumber;
	}
	
	private static void setOperation(String string) {
		operation = string;
	}
	
	public static String getOperation() {
		return operation;
	}
	
	public static void getEmptyReturn() {
		System.out.println();
	}
	
	public static void getResultString(float first, float second, String operation, float result) {
		System.out.println(first + " " + operation + " " + second + " = " + result);
	}
	
    public static void main(String[] args){
    	while (true) {
    		askForSummands(1);
    		String x = readUserInput();
    		setFirstNumber(x);
    		askForSummands(2);
    		String y = readUserInput();
    		setSecondNumber(y);
    		askForOperation();
    		String z = readUserInput();
    		setOperation(z);
    	}
    }
}
