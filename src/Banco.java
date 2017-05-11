final class Banco {
	
	/*
	Banco () {
		int [] a = {0,1};
		Banco.addPoke("Pikachu", "Eletrico", a, 100,120,30,200);
		Banco.addHabAtk("Choque do Trovao", 60,"Eletrico",1);
		addHabAtk("Para raios", 0,"Eletrico",2);
	}
	*/
	
	//hab e dano
	static final String [] nomeHab = {"Choque do Trovao", "Para raios", "Bomba de sodio", "Helice mortal",
										"Trovoada intensa", "Corolario voador", "Integral Glauciana", "Bilbo voador"};
	static final String[] tipoHab = {"Pedra", "Tesoura", "Papel", "Tesoura", "Pedra", "Papel", "Tesoura", "Pedra",};
	static final int[]	atkPrioridade = {};
	static final int [] valAtk = new int[100];
	static final int indexHabAtk = 0;

	//pokemons
	static final Pokemon [] poke = new Pokemon[100]; // se fizermos isso, nao vai dar pra alterar o hp do pokemon depois, ja que a variaveeh do tipo final
	static final int indexPoke = 0;
	
	//itens
	static Item [] itens = new Item[100];
	static int indexItem = 0;
	
	/*
	public static void addHabAtk (String nome, int valAtk, String tipo, int prioridade) {
		if (indexHabAtk > 100) return;
		Banco.atkPrioridade[indexHabAtk] = prioridade;
		//Banco.nomeHab[indexHabAtk] = nome;
		Banco.tipoHab[indexHabAtk] = tipo;
		Banco.valAtk[indexHabAtk++] = valAtk;	
		
	}
	
	
	public static void addPoke (String nome, String tipo, int [] Golpes, int pVida, int pAtaque, int pDefesa, int pVelocidade) {
		if (indexPoke > 100) return;
		
		Pokemon e = new Pokemon(nome, tipo, pVida, pAtaque, pDefesa, pVelocidade, Golpes);
		
		
		poke[indexPoke++] = e;
	}
	
	public void addItens (String nomeItem, int valCura) {
		if (indexItem > 100) return;
		
		Item e = new Item(nomeItem, valCura);
		
		Banco.itens[indexItem++] = e;
	}
	
	public static void  main (String [] args) {
		
	}
	*/
	
}
