package Default;
import adapters.MernisServiceAdapter;
import concretes.CampaignManager;
import concretes.GameManager;
import concretes.PlayerManager;
import entities.Campaign;
import entities.Game;
import entities.Player;

public class Main {

	public static void main(String[] args) {
		Player player1 = new Player();
		player1.setId(1);
		player1.setFirstName("enes");
		player1.setLastName("sesiz");
		player1.setNationalityId("1234124");
		
		Campaign campaign1 = new Campaign(1, "50%", 50);
		Game game1 = new Game(1, "Snake", 200);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign1);
		campaignManager.update(campaign1);
		campaignManager.remove(campaign1);
		
		GameManager gameManager = new GameManager();
		gameManager.add(game1);
		gameManager.update(game1);
		gameManager.remove(game1);
		gameManager.saleWithCampaign(game1, player1, campaign1);
		gameManager.saleWithoutCampaign(game1, player1);
		
		PlayerManager playerManager = new PlayerManager(new MernisServiceAdapter());
		playerManager.add(player1);
		
		
		
		
		
		
		
	}

}
