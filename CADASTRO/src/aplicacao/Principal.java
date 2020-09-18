package aplicacao;

import entidades.Animal;
import entidades.Cachorro;
import entidades.Cavalo;
import entidades.Preguica;

public class Principal 
{
	public static void main(String[] args) 
	{
	Animal novoAnimal = new Animal("ANIMAL", "SOM");
	Cachorro novoCachorro = new Cachorro("CACHORRO", "LATE");
	Cavalo novoCavalo = new Cavalo("CAVALO", "RELINXA");
	Preguica novaPreguica = new Preguica("PREGUIÇA", "DORME");
	
    novoAnimal.setSom("SOM");
    novoCachorro.setSom("LATE");
    novoCavalo.setSom("RELINXA");
    novaPreguica.setSom("DORME");
    
    System.out.println(novoAnimal.somAnimais());
    System.out.println(novoCachorro.somAnimais());
    System.out.println(novoCavalo.somAnimais());
    System.out.println(novaPreguica.somAnimais());
	}
}
