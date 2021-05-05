package Concrete;


import Abstract.GamerService;
import Adapters.MernisServiceAdapter;
import Entities.Gamer;

public class GamerManager implements GamerService{

	public GamerManager(MernisServiceAdapter mernisServiceAdapter) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(Gamer gamer) {
		System.out.println("Oyuncu Eklendi: " + gamer.getNickName());
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Oyuncu Güncellendi: " + gamer.getNickName());
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Oyuncu Silindi: " + gamer.getNickName());
		
	}

}
