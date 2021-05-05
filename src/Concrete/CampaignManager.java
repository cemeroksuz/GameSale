package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService{

	

	@Override
	public void add(Campaign campaing) {
		System.out.println("Kampanya Eklendi: " + campaing.getCampaignName());
		
	}

	@Override
	public void update(Campaign campaing) {
		System.out.println("Kampanya Güncellendi: " + campaing.getCampaignName());
		
	}

	@Override
	public void delete(Campaign campaing) {
		System.out.println("Kampanya Silindi: " + campaing.getCampaignName());
		
	}

}
