package model;

/**
 * @author Trevor Parrish - tparrish2
 * CIS175 - Spring 2023
 * Feb 8, 2023
 */
public class NumAddition {
	
	private int firstNumber;
	private int secondNumber;
	private int numberSum;
	
	public NumAddition() {
		super();
	}
	
	public NumAddition(int firstNumber, int secondNumber) {
		super();
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
		setAddition(firstNumber, secondNumber);
	}

	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
		setAddition(firstNumber, secondNumber);
	}
	
	public int getFirstNumber() {
		return firstNumber;
	}

	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
		setAddition(firstNumber, secondNumber);
	}
	
	public int getSecondNumber() {
		return secondNumber;
	}

	public void setNumberSum(int numberSum) {
		this.numberSum = numberSum;
	}
	
	public int getNumberSum() {
		return numberSum;
	}

	public void setAddition(int firstNumber, int secondNumber) {
		setNumberSum(firstNumber + secondNumber); 
	}

	@Override
	public String toString() {
		return "NumAddition [firstNumber=" + firstNumber + ", secondNumber=" + secondNumber + ", numberSum=" + numberSum
				+ "]";
	}
}
