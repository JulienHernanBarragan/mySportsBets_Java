package exe;

import api.Bankroll;

public class Main {

	public static void main(String[] args) {

		String test = new databaseProcessing.DataforPari().dataBankroll("'2017/01/01' and '2017/12/31'");
		System.out.println(test);
		Bankroll session = new Bankroll();
		session.setVisible(true);
	}

}
