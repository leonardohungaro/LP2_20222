package modelo;

public class Filme {
	private String titulo, descricao;
	private int duracao;
	private Diretor dir;
	public Filme(String titulo, String descricao, int duracao, Diretor dir) {
		this.titulo = titulo;
		this.descricao = descricao;
		this.duracao = duracao;
		this.dir = dir;
	}
	public Filme() {

	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	public Diretor getDir() {
		return dir;
	}
	public void setDir(Diretor dir) {
		this.dir = dir;
	}
	public String toString() {
		return "\nFilme: " + titulo + "\nDescrição: " + descricao + "\nDuração: " + duracao + " min\nDiretor: " + dir.getNome();
	}
	public void exibirDuracaoEmHoras() {
		System.out.println("O "+ titulo +" possui "+ qtdHora() +" horas e "+ qtdMin() +" minutos de duração");
	}
	public boolean acheiVoce(String filme) {
		return this.titulo.equalsIgnoreCase(filme);
	}
	public int qtdHora() {
		return duracao/60;
	}
	public int qtdMin() {
		return duracao%60;
	}
	
}
