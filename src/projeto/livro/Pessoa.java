package projeto.livro;

public class Pessoa {
	//ATRIBUTOS
	private String nome;
	private int idade;
	private String sexo;
	
	//MÉTODO PÚBLICO
	public void fazerAniversario() {
	this.idade++; //ou this.idade = this.idade + 1;
		
	}
	//MÉTODO CONSTRUTOR
	public Pessoa(String nome, int idade, String sexo) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}
	
	//METODOS ESPECIAIS
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
}
