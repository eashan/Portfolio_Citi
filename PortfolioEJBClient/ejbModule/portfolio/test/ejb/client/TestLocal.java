package portfolio.test.ejb.client;

import javax.ejb.Local;

@Local
public interface TestLocal {
	
	public void ping(String uname);

}
