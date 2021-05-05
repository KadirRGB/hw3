package abstracts;

import entities.Campaign;

public interface ICampaingService {
	
	void add(Campaign campaign);
	void update(Campaign campaign);
	void remove(Campaign campaign);
	
}
