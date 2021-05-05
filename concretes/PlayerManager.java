package concretes;

import abstracts.IPlayerCheckService;
import abstracts.IPlayerService;
import entities.Player;

public class PlayerManager implements IPlayerService{
	private IPlayerCheckService playerCheckService;

	public PlayerManager(IPlayerCheckService playerCheckService) {
		super();
		this.playerCheckService = playerCheckService;
	}

	@Override
	public void add(Player player) throws Exception{
		if(playerCheckService.checkIfRealPerson(player)) {
			System.out.println("add to the System : "+player.getFirstName()+" "+player.getLastName());
		}else {
			System.out.println("Not a valid person : "+player.getFirstName()+" "+player.getLastName());
			throw new Exception("Not a valid person this " + player);
			
		}
		
	}
	@Override
	public void update(Player player) {
		// TODO Auto-generated method stub
		System.out.println("updated to db : "+player.getFirstName()+" "+player.getLastName());

	}

	@Override
	public void remove(Player player) {
		System.out.println("removed from db : "+player.getFirstName()+" "+player.getLastName());

	}

}
