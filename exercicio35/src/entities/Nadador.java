package entities;

public class Nadador {
	
	private Integer idadeNadador;

	public Nadador(Integer idadeNadador) {
		this.idadeNadador = idadeNadador;
	}

	public Integer getIdadeNadador() {
		return idadeNadador;
	}

	public void setIdadeNadador(Integer idadeNadador) {
		this.idadeNadador = idadeNadador;
	}
	
	public String classificarCategoria() {
		if(idadeNadador >= 5 && getIdadeNadador() <=7) {
			return "Infantil A";
		}else if(idadeNadador >= 8 && idadeNadador <= 10) {
			return "Infantil B";
		}else if(idadeNadador >= 11 && idadeNadador <= 13) {
			return "Juvenil A";
		}else if(idadeNadador >= 14 && idadeNadador <= 17) {
			return "Juvenil B";
		}else if(idadeNadador >= 18 && idadeNadador <= 25) {
			return "Sênior";
		}else {
			return "Idade fora da faixa etária";
		}
	}

}
