package Concrete;

import Abstract.GamerCheckService;
import Entities.Gamer;

public class GamerCheckManager implements GamerCheckService{

	

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		// TODO Auto-generated method stub
		return true;
	}

}
