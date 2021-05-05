package abstracts;

import entities.Player;

public interface IPlayerService {
	
	void add(Player player) throws Exception;
	void update(Player player);
	void remove(Player player);
	
}
