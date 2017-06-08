package exe;

import api.Home;

public class Main {

	public static void main(String[] args) {

		String test = new databaseProcessing.DataforPari().dataBankroll("'2017/01/01' and '2017/12/31'");
		System.out.println(test);
		Home session = new Home();
		session.setVisible(true);
	}

}
