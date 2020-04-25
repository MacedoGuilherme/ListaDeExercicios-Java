package entities;

public class Calculador {
	
	private Integer number1;
	private Integer number2;
	
	public Calculador() {
	}

	public Integer getNumber1() {
		return number1;
	}

	public void setNumber1(Integer number1) {
		this.number1 = number1;
	}

	public Integer getNumber2() {
		return number2;
	}

	public void setNumber2(Integer number2) {
		this.number2 = number2;
	}
	
	public Double showSum(Integer number1, Integer number2) {
		return (double) (number1 + number2);
	}
	
	public Double showSubtraction(Integer number1, Integer number2) {
		return (double) number1 - number2;
	}
	
	public Double showMultiplication(Integer number1, Integer number2) {
		return (double) number1 * number2;
	}
	
	public Double showDivision(Integer number1, Integer number2) {
		return (double) number1 / number2;
	}

}
