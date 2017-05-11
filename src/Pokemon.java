
public class Pokemon {
	final Banco bank = new Banco ();
	String nome;
	String tipo;
	int pVida;
	int pVidaMax; /* parece ser necessario adicionar essa variavel, pois caso use itens de cura, 
				   * existe um limite que pode ser recuperado */
	int pAtaque;
	int pDefesa;
	int pVelocidade;
	int [] golpes; // indice das hab/dano
	boolean isAlive = true;
	
	
	Pokemon (String nome, String tipo, int pVida, int pAtaque, int pDefesa, int pVelocidade, int [] golpes){
		this.nome = nome;
		this.tipo = tipo;
		this.pVida = pVida;
		this.pAtaque = pAtaque;
		this.pDefesa = pDefesa;
		this.pVelocidade = pVelocidade;
		this.pVidaMax = pVida; // na declaracao do pokemon, o pVida acaba sendo o pVidaMax
		if(golpes.length <= 4)
		this.golpes = golpes;
	}
	
	public int comparaTipos(Pokemon x, int modoDeComparacao) {
		if(this.isAlive == false)
			return -1;
		if(modoDeComparacao == 1){
			String[] tipos = {"Pedra","Papel","Tesoura"};
			if(this.tipo.compareTo(tipos[0]) == 0 && x.tipo.compareTo(tipos[2]) == 0)
				return 1;
			if(this.tipo.compareTo(tipos[1]) == 0 && x.tipo.compareTo(tipos[0]) == 0)
				return 1;
			if(this.tipo.compareTo(tipos[2]) == 0 && x.tipo.compareTo(tipos[1]) == 0)
				return 1;
			if(this.tipo.compareTo(tipos[0]) == 0 && x.tipo.compareTo(tipos[1]) == 0)
				return -1;
			if(this.tipo.compareTo(tipos[1]) == 0 && x.tipo.compareTo(tipos[2]) == 0)
				return -1;
			if(this.tipo.compareTo(tipos[2]) == 0 && x.tipo.compareTo(tipos[0]) == 0)
				return -1;
			else return 0;
		}
		else {
			String[] tipos = {"Pedra","Papel","Tesoura"};
			
			for (int i = 0; i < golpes.length; i++) {
				if(Banco.tipoHab[golpes[i]].compareTo(tipos[0]) == 0 && x.tipo.compareTo(tipos[2]) == 0)
					return i;
				if(this.tipo.compareTo(tipos[1]) == 0 && x.tipo.compareTo(tipos[0]) == 0)
					return 1;
				if(this.tipo.compareTo(tipos[2]) == 0 && x.tipo.compareTo(tipos[1]) == 0)
					return 1;
				if(this.tipo.compareTo(tipos[0]) == 0 && x.tipo.compareTo(tipos[1]) == 0)
					return -1;
				if(this.tipo.compareTo(tipos[1]) == 0 && x.tipo.compareTo(tipos[2]) == 0)
					return -1;
				if(this.tipo.compareTo(tipos[2]) == 0 && x.tipo.compareTo(tipos[0]) == 0)
					return -1;
			}
			else return 0;
		}
	}
	//imprime dados sobre pokemons
	public static void dados () {
				
		System.out.println(Banco.nomeHab[0]); // como acessar o banco a partir de um metodo?
		System.out.println(Banco.valAtk[0]);
		System.out.println(Banco.nomeHab[1]); 
		System.out.println(Banco.valAtk[1]);
		
	}
	
	public static void main (String [] args) {
		
		
		dados();
		
	}
}

