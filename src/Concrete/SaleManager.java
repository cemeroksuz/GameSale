package Concrete;


import Abstract.SaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class SaleManager implements SaleService{

	@Override
	public void sale(Gamer gamer, Game game) {
		System.out.println(game.getGameName()+ " adl� oyun " + gamer.getNickName()+ " takma adl� oyuncuya " + game.getPrice() + " TL'ye sat�ld�.");
		
	}

	@Override
	public void campaignSale(Campaign campaign, Game game, Gamer gamer) {
		System.out.println(game.getGameName()+ " adl� oyun " + gamer.getNickName()+
				" takma adl� oyuncuya " + (game.getPrice()-((game.getPrice()*campaign.getDiscountRate())/100))+ " TL'ye "+
				campaign.getCampaignName()+  " kampayas� dahilinde sat�ld�.");
		
	}

}
