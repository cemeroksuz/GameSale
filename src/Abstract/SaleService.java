package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public interface SaleService {

	void sale(Gamer gamer, Game game);
	void campaignSale(Campaign campaign, Game game, Gamer gamer);
}
