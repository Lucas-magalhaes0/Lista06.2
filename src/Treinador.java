
public class Treinador {
	String nome;	
	
	Pokemon [] pokes = new Pokemon[6];
	int index = 0;
	
	Item [] itens = new Item[100];
	int indexItem = 0;
		
	Treinador (String nome) {
		this.nome = nome;
		
	}	
	
	public void addPoke (int indexPokeBanco) {
		if (index <= 6) {
			pokes[index++] = Banco.poke[indexPokeBanco];			
		}
	}
	
	public boolean estaNoJogo () {
		for (Pokemon poke : pokes) {
			if (poke.isAlive) {
				return true;
			}
		}
		
		return false;
	}
	
	public void addItens (int indexItemBanco) {
		if (indexItem < 100) {
			itens[indexItem++] = Banco.itens[indexItemBanco];			
		}
	}
	
	/* usa item no pokes[0]
	 * tornei as variaveis privadas em Item, assim so da para acessar valores por metodos */
	public int useItem (int indexItem) {  
		if (itens[indexItem].canUse() == false) return -1;
		
		pokes[1].pVida += itens[indexItem].use();
		itens[indexItem].subtract();
		
		return 1;
	}
	
	public void defineNumItem (int indexItem, int qtd) {
		itens[indexItem].defineNumItens(qtd);
	}
	
	//alterar pokemon principal. Retorna true caso a troca for efetuada com sucesso
	public boolean alteraPokePrincipal (int indexPoke) {
		
		if (pokes[indexPoke].isAlive == true) { //criar metodo para retornar isAlive, quando mudar para private
			int [] vecInt = {};
			Pokemon e = new Pokemon("","", 1, 1, 1, 1, vecInt); //aqui deveria ser static, mas o eclipse nao aceita (?)
			e = pokes[1];
			pokes[1] = pokes[indexPoke];
			pokes[indexPoke] = e;
			
			return true;
		}
		
		return false;
	}
	
	//imprime dados sobre pokemons
	public void dados () {
		for (int i = 0; i <= 0; i++ ) {
			System.out.println("Indice do Pokemon: " + i);
			pokes[i].dados();
			for (int j = 0; j < (pokes[i].golpes).length; j++) {
				//Banco.nomeHab[this.pokes[i].golpes[j]]; // ************** como acessar o banco a partir de um metodo? *************
			}
		}
	}
	
	public void escolherAtaque(Pokemon x){
		
	}
	
	public void escolherAcao(Pokemon x){
		int indice = 1;
		if(this.pokes[0].pVida < 25){
			if(this.useItem(0) == 1){
				
			}
			else {
				if(this.pokes[0].comparaTipos(x) == -1)
					while(this.pokes[indice].comparaTipos(x) == -1 || this.pokes[indice].comparaTipos(x) == 0 && indice <= index)
						indice++;
				if(indice == index + 1) {
					indice = 1;
					while(this.pokes[indice].comparaTipos(x) == -1 && indice <= index)
						indice++;
					if(indice == index + 1){
							indice = 1;
							while(this.pokes[0].pVida > this.pokes[indice].pVida && indice <= index)
								indice++;
								if(indice == index + 1){
									this.escolherAtaque(x);
								}
					}
				}
			}
		}
	}
	
	public static void main (String [] args) {
		Treinador ash = new Treinador("Ash");
		final Banco bank = new Banco();
		
		int [] a= {0, 1};
		//bank.addPoke("Pikachu", "Eletrico", a, 100,120,30,200);
		//bank.addHabAtk("Choque do Trovao", 60,"Eletrico",1);
		//bank.addHabAtk("Para raios", 0,"Eletrico",2);
		
		ash.addPoke(0);
		
		//ash.dados();
		
		
		System.out.println(Banco.nomeHab[0]); // como acessar o banco a partir de um metodo?
		System.out.println(Banco.valAtk[0]);
		System.out.println(Banco.nomeHab[1]); 
		System.out.println(Banco.valAtk[1]);
		
		
		
	}
}
