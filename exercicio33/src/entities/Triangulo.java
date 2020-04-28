package entities;

public class Triangulo {
	
	private Integer ladoA;
	private Integer ladoB;
	private Integer ladoC;
	
	public Triangulo(Integer ladoA, Integer ladoB, Integer ladoC) {
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.ladoC = ladoC;
	}

	public Integer getLadoA() {
		return ladoA;
	}

	public void setLadoA(Integer ladoA) {
		this.ladoA = ladoA;
	}

	public Integer getLadoB() {
		return ladoB;
	}

	public void setLadoB(Integer ladoB) {
		this.ladoB = ladoB;
	}

	public Integer getLadoC() {
		return ladoC;
	}

	public void setLadoC(Integer ladoC) {
		this.ladoC = ladoC;
	}
	
	public boolean isTriangle() {
		if((ladoA < ladoB + ladoC) && (ladoB < ladoA + ladoC) && (ladoC < ladoA + ladoB)) {
			return true;
		} else {
			return false;
		}
	}
	
	public String typeOfTriangle() {
		if(isTriangle()) {
			if(ladoA.equals(ladoB)  && ladoC.equals(ladoA) && ladoB.equals(ladoC)){
				return "Triângulo Equilátero e Isóscele";
			}else if((ladoA.equals(ladoB) || ladoA.equals(ladoC) || ladoB.equals(ladoC))) {
				return "Triângulo Isóscele";
			}else if(ladoA != ladoB && ladoA != ladoC && ladoB != ladoC) {
				return "Triângulo Escaleno";
			}
		}else {
			return "Não é possível formar um triângulo com os valores";
		}
		return null;
	}

}
