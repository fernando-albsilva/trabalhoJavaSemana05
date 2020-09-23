package trabalhoSemana05;

public class PartidaTester {

	
	public static void main(String[] args) {
		
		Flamengo flamengo= new Flamengo();
		Fluminense fluminense=new Fluminense(); 
		Vasco vasco=new Vasco(); 
		Botafogo botafogo=new Botafogo();
		
		Campeonato campeonato=new Campeonato();
		
		campeonato.resultadoPartida(flamengo, 3, fluminense, 1);
		
		campeonato.resultadoPartida(flamengo,2, botafogo,4);
		
		campeonato.resultadoPartida(flamengo, 3, vasco, 3);
		
		campeonato.resultadoPartida(vasco,2, botafogo,4);
		
		campeonato.resultadoPartida(vasco,1, fluminense,2);
		
		campeonato.resultadoPartida(fluminense,2, botafogo,5);
		
		
		
		campeonato.listarRank(flamengo,fluminense,vasco,botafogo);
		
	

				

	}
		

		
		
		

}
