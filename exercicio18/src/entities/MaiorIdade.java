package entities;

public class MaiorIdade {
	
	private Integer idade;
	
	public MaiorIdade() {
	}
	
	public Integer getIdade() {
		return idade;
	}
	
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	public String ehMaiorDeIdade(Integer idade) {
		if(idade >= 18) {
			return "Maior de idade\n";
		} else {
			return "Menor de idade\n";
		}
	}
}
