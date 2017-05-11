class EventSet {
	private TurnoDaBatalha[] estadosDaLuta = new TurnoDaBatalha[100];
	private int index = 0;
	public void add(TurnoDaBatalha c){
		if(index >= estadosDaLuta.length)
			return;
		estadosDaLuta[index++] = c;
	}
	public TurnoDaBatalha getTurno(){
		return estadosDaLuta[index];
	}
}


public class EventBattle {
	private EventSet es = new EventSet();
	public void addEvent(TurnoDaBatalha c){ es.add(c); }
	public void run(Treinador a, Treinador b){
		TurnoDaBatalha e;
		e = es.getTurno();
		while(a.estaNoJogo()&&b.estaNoJogo()){
			e.action(a,b);
		}
	}
}