package trabalhoSemana05;

public interface ITime {
	public void printNomeTime();
	public void adicionarVitoria();
	public void adicionarEmpate();
	public void adicionarDerrota();
	public int totalPontos();
	public int getVitoria();
	public int getEmpate();
	public int getDerrota();
	public String getNome();
}
