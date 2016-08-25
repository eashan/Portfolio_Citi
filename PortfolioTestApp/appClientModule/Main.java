import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import portfolio.test.ejb.client.TestRemote;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Context context;
		try {
			// Create Properties for JNDI InitialContext.
			Properties prop = new Properties();
			prop.put(Context.INITIAL_CONTEXT_FACTORY,org.jboss.naming.remote.client.InitialContextFactory.class.getName()); 
			prop.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
			prop.put(Context.PROVIDER_URL, "http-remoting://localhost:8080");
			prop.put("jboss.naming.client.ejb.context", true);

			// Create the JNDI InitialContext.
			context = new InitialContext(prop);
		

//		// Formulate the full JNDI name for the OnlineRetailer session bean.
//		String appName     = "StudentOnlineRetailer";
//		String moduleName  = "StudentOnlineRetailerEJB";
//		String beanName    = "OnlineRetailerBean";
//		String packageName = "student.onlineretailer.ejb";
//		String className   = "OnlineRetailerBeanRemote";
//
//		// Lookup the bean using the full JNDI name.
//		//String fullJndiName = String.format("%s/%s/%s!%s.%s", appName, moduleName, beanName, packageName, className);
		String fullJndiName = "/Portfolio/PortfolioEJB/Test!portfolio.test.ejb.client.TestRemote";
		
		TestRemote bean = (TestRemote) context.lookup(fullJndiName);
		
		bean.ping("Eashan");
		}
		catch(NamingException e){
			e.printStackTrace();
		}
		
	}

	/* (non-Java-doc)
	 * @see java.lang.Object#Object()
	 */
	public Main() {
		super();
	}

}