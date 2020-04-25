package entities;

public class Conversor {
	
	private Double celsius;

	public Conversor(Double celsius) {
		this.celsius = celsius;
	}

	public Double getCelsius() {
		return celsius;
	}

	public void setCelsius(Double celsius) {
		this.celsius = celsius;
	}
	
	public Double fahrenheit() {
		return ((9*getCelsius()+160) / 5);
	}
	
	public String toString() {
		return "Temperatura em Fahrenheit: " +
				String.format("%.1f", fahrenheit()) +
				"ºF";
	}
}
