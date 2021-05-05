import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.GamerManager;
import Concrete.SaleManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) {
		
		Gamer gamer1 = new Gamer();
		gamer1.setId(1);
		gamer1.setFirstName("Cem");
		gamer1.setLastName("Eröksüz");
		gamer1.setNationalityId("30004415524");
		gamer1.setYearOfBirth(1993);
		gamer1.setNickName("Myth");
		
		Gamer gamer2 = new Gamer();
		gamer2.setId(1);
		gamer2.setFirstName("Can");
		gamer2.setLastName("Ercan");
		gamer2.setNationalityId("12345678910");
		gamer2.setYearOfBirth(2000);
		gamer2.setNickName("CanErcan");
		
		GamerManager gamerManager = new GamerManager(new MernisServiceAdapter());
		gamerManager.add(gamer1);
		gamerManager.add(gamer2);
		gamerManager.update(gamer1);
		gamerManager.delete(gamer2);
		
		System.out.println("\n****************************\n");
		
		Game game1 = new Game();
		game1.setId(1);
		game1.setGameName("CS:GO");
		game1.setPrice(70);
		
		Game game2 = new Game();
		game2.setId(2);
		game2.setGameName("Age of Empires 2");
		game2.setPrice(50);
		
		GameManager gameManager = new GameManager();
		gameManager.add(game1);
		gameManager.add(game2);
		gameManager.update(game2);
		
		System.out.println("\n****************************\n");
		
		Campaign campaign0 = new Campaign(0, "Kampanyasýz", 0, game1.getPrice());	
		Campaign campaign1 = new Campaign(1, "Yaz Ýndirimi", 25, game1.getPrice());	
		Campaign campaign2 = new Campaign(2, "Kara Cuma", 80, game1.getPrice());
		
		CampaignManager campaignManager1 = new CampaignManager();
		
		campaignManager1.add(campaign1);
		campaignManager1.delete(campaign2);
		
		System.out.println("\n****************************\n");
		
		
		SaleManager saleManager = new SaleManager();
		saleManager.campaignSale(campaign0, game1, gamer2);
		saleManager.campaignSale(campaign1, game2, gamer1);
		saleManager.campaignSale(campaign2, game1, gamer1);
 		
		
		
		
		
	}

}
