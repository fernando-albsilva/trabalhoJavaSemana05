package trabalhoSemana05;

	public class Botafogo extends TimeDeFutebol implements ITime{
		
		private String nome;
		private int qtdVitoria;
		private int qtdEmpate;
		private int qtdDerrota;
		
		public Botafogo() {
			this.nome= "Botafogo";
			this.qtdVitoria=0;
			this.qtdEmpate=0;
			this.qtdDerrota=0;
		}
		
		public String getNome() {
			return this.nome;
		}

		@Override
		public void printNomeTime() {
		
			System.out.print(this.nome);
		}

		@Override
		public void adicionarVitoria() {
			this.qtdVitoria++;
		}

		@Override
		public void adicionarEmpate() {
			this.qtdEmpate++;
		}

		@Override
		public void adicionarDerrota() {
			this.qtdDerrota++;
		}

		@Override
		public int totalPontos() {
			return ( (this.qtdVitoria*3)+(this.qtdEmpate) );
		}

		@Override
		public int getVitoria() {
			return qtdVitoria;
		}

		@Override
		public int getEmpate() {
			return this.qtdEmpate;
		}

		@Override
		public int getDerrota() {
			return this.qtdDerrota;
		}

}