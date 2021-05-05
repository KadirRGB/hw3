package concretes;

import abstracts.ICampaingService;
import entities.Campaign;

public class CampaignManager implements ICampaingService {

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getName()+" campaign added.");
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getName()+" campaign updated.");

	}

	@Override
	public void remove(Campaign campaign) {
		System.out.println(campaign.getName()+" campaign removed.");
	}

}
