package entities;

public class OperacaoAritmetica {

	public Double a;
	public Double b;
	public char c;
	
	public OperacaoAritmetica(Double a, Double b, char c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public Double getA() {
		return a;
	}

	public void setA(Double a) {
		this.a = a;
	}

	public Double getB() {
		return b;
	}

	public void setB(Double b) {
		this.b = b;
	}

	public char getC() {
		return c;
	}

	public void setC(char c) {
		this.c = c;
	}
	
	
	public String isOperator() {
		switch (getC()) {
		case '+':
			return "Resultado: " + (getA() + getB());
		case '-':
			return "Resultado: " + (getA() - getB());
		case '*':
			return "Resultado: " + (getA() * getB());
		case '/':
			if(getA() != 0 && getB() != 0) {
				return "Resultado: " + (getA() / getB());
			} else {
				return "Não é possível dividir por zero!";
			}
		default:
			return "Operador não definido";
		}
		
	}
	
	
}
