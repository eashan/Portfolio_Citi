package portfolio.test;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import portfolio.test.ejb.client.TestLocal;

@Path("/test")
public class TestResource {

	Context context;
	TestLocal bean;
	
	TestResource(){
		try{
			context = new InitialContext();
			bean = (TestLocal) context.lookup("java:global/Portfolio/PortfolioEJB/Test!portfolio.test.ejb.client.TestLocal");
		}catch(NamingException e){
			e.printStackTrace();
		}
	}
	
	@GET
	@Produces("text/plain")
	public String ping(@QueryParam("uname") String uname){
		bean.ping(uname);
		return "Updated db";
	}
	
	
}
