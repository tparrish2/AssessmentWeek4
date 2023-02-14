package model;

import java.util.Random;

/**
 * @author Trevor Parrish - tparrish2
 * CIS175 - Spring 2023
 * Feb 8, 2023
 */

public class TruthDare {
	
	private String input;
	private String truthOrDare;
	private int randNum;
	
	public TruthDare() {
		super();
	}
	
	public TruthDare(String input) {
		super();
		this.input = input;
		randNum = getRandomNum();
		setStatement(input);
	}
	
	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
		setStatement(input);
	}

	public void setTruthOrDare(String truthOrDare) {
		this.truthOrDare = truthOrDare;
	}

	public String getTruthOrDare() {
		return truthOrDare;
	}

	public int getRandNum() {
		return randNum;
	}

	public void setRandNum(int randNum) {
		this.randNum = randNum;
	}

	public void setStatement(String input) {
		if (input.equals("Truth")) {
			switch (randNum) {
			case 1: 
				truthOrDare = "Who is your biggest crush?";
				break;
			case 2: 
				truthOrDare = "What is your darkest secret?";
				break;
			case 3: 
				truthOrDare = "What is the biggest lie you have ever told?";
				break;
			case 4: 
				truthOrDare = "What is your biggest fear?";
				break;
			case 5: 
				truthOrDare = "What is your worst habit?";
				break;
			}
		}
		else {
			switch (randNum) {
			case 1: 
				truthOrDare = "Prank call someone from your phone.";
				break;
			case 2: 
				truthOrDare = "Create a Java program that uses servlets and JSP.";
				break;
			case 3: 
				truthOrDare = "Act like a dog for two minutes.";
				break;
			case 4: 
				truthOrDare = "Kiss the person to your left.";
				break;
			case 5: 
				truthOrDare = "Sing your favorite song.";
				break;
			}
		}	
	}
	
	public int getRandomNum() {
		int min = 1;
		int max = 5;
		Random rand = new Random();
		int num = rand.nextInt(max - min + 1) + min;
		return num;
	}

	@Override
	public String toString() {
		return "TruthDare [input=" + input + ", truthOrDare=" + truthOrDare + ", randNum=" + randNum + "]";
	}

}
