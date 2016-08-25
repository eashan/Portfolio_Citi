package portfolio.test.ejb.client;

import javax.ejb.Remote;

@Remote
public interface TestRemote {

	public void ping(String uname);

}
