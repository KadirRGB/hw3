package abstracts;

import entities.Campaign;
import entities.Game;
import entities.Player;

public interface IGameService {
	void add(Game game);
	void update(Game game);
	void remove(Game game);
	void saleWithoutCampaign(Game game, Player player);
	void saleWithCampaign(Game game, Player player, Campaign campaign );

}
