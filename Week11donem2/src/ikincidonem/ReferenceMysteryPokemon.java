package ikincidonem;

public class ReferenceMysteryPokemon {

	public static void main(String[] args) {
     int hp = 10 ; 
     Pokemon p = new Pokemon(5);
     method(p, hp);
     System.out.println("level : " + p.lev + " , " + " hp : "+ hp );
     hp = hp + p.lev;
     method(p, hp + 1);
     System.out.println("level : " + p.lev + " , " + " hp : "+ hp );
	}
	public static void  method(Pokemon poke , int hp) {
		poke.lev++;
		hp -=5;
	     System.out.println("level : " + poke.lev + " , " + " hp : "+ hp );
	}

}
