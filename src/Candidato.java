import java.util.Comparator;

public class Candidato implements Comparator<Candidato>{

	String inscricao;
	String nome;
	Double nota1;
	Double nota2;
	Double nota3;
	public String getInscricao() {
		return inscricao;
	}
	public void setInscricao(String inscricao) {
		this.inscricao = inscricao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getNota1() {
		return nota1;
	}
	public void setNota1(Double nota1) {
		this.nota1 = nota1;
	}
	public Double getNota2() {
		return nota2;
	}
	public void setNota2(Double nota2) {
		this.nota2 = nota2;
	}
	public Double getNota3() {
		return nota3;
	}
	public void setNota3(Double nota3) {
		this.nota3 = nota3;
	}
	
	/**
	 * Compara nota3 entre 2 candidatos. Útil para ordenar uma coleção de Candidatos.
	 */
	@Override
	public int compare(Candidato c1, Candidato c2) {
		Double diferenca = c1.getNota3() - c2.getNota3();
		if (diferenca == 0) { 
			  
            // sao iguais em nota3
            return 0; 
        } 
        else if (diferenca < 0) { 
  
            // c1 < c2 
            return 1; 
        } 
        else { 
  
            // c1 > c2 
            return -1; 
        } 
	}
	
	
	
}
