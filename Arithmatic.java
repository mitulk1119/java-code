package Switch;

public class Arithmatic {

	private double firstNumber;
	private double secondNumber;

	public void setFirstNumber(double firstNumber) {
		this.firstNumber = firstNumber;
	}

	public double getFirstNumber() {
		return firstNumber;
	}

	public void setSecondNumber(double secondNumber) {
		this.secondNumber = secondNumber;
	}

	public double getSecondNumber() {
		return secondNumber;
	}

	public double getAdditionResult() {
		double addition = firstNumber + secondNumber;

		return addition;
	}

	public double getSubtractionResult() {
		double subtraction = firstNumber - secondNumber;

		return subtraction;
	}

	public double getMultiplicationResult() {
		double multiplication = firstNumber * secondNumber;

		return multiplication;
	}

	public double getDivisionResult() {
		if (secondNumber != 0) {
			double division = firstNumber / secondNumber;
			return division;

		} else {
			return 0;
		}
	}

}
