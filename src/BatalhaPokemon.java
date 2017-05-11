
public class BatalhaPokemon extends EventBattle {
	private class EscolherAtaque extends TurnoDaBatalha{
	
		public void action(Treinador a, Treinador b){
		if(a.pokes[0].pVelocidade > b.pokes[0].pVelocidade){
			a.escolherAcao(b.pokes[0]);
			b.escolherAcao(a.pokes[0]);
			}
		if(a.pokes[0].pVelocidade < b.pokes[0].pVelocidade){
			
			}
		}
	}
}
