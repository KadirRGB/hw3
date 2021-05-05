package concretes;

import abstracts.IGameService;
import entities.Campaign;
import entities.Game;
import entities.Player;

public class GameManager implements IGameService{

	@Override
	public void add(Game game) {
		System.out.println(game.getName()+" added");
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getName()+" updated");		
	}

	@Override
	public void remove(Game game) {
		System.out.println(game.getName()+" updated");
	}

	@Override
	public void saleWithoutCampaign(Game game, Player player) {
		System.out.println(player.getFirstName() + " bought the " + game.getName() + " game for : " + game.getPrice() );
		
	}

	@Override
	public void saleWithCampaign(Game game, Player player, Campaign campaign) {
		System.out.println(player.getFirstName() + " bought the " + game.getName() + " game for : " + (game.getPrice()-game.getPrice()*campaign.getDiscount()/100)+ " $ with  " + campaign.getName() +" campaign");

	}

}
